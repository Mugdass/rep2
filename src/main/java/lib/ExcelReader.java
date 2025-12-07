package lib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    private Sheet sheet;

    public ExcelReader(String filename, String sheetname) throws IOException {
        FileInputStream fis = new FileInputStream(filename);
        Workbook wb = new XSSFWorkbook(fis);
        sheet = wb.getSheet(sheetname);
        if (sheet == null) {
            throw new IllegalArgumentException("Sheet '" + sheetname + "' not found.");
        }
    }

    public Object[][] excelToArray() {

        int totalRows = sheet.getPhysicalNumberOfRows();
        int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[totalRows - 1][totalColumns];

        for (int r = 1; r < totalRows; r++) {
            Row row = sheet.getRow(r);

            for (int c = 0; c < totalColumns; c++) {
                data[r - 1][c] = getCellData(row, c);
            }
        }
        return data;
    }

    private String getCellData(Row row, int col) {

        if (row == null) return "";
        Cell cell = row.getCell(col);
        if (cell == null) return "";

        CellType type = cell.getCellType();

        switch (type) {

            case STRING:
                return cell.getStringCellValue();

            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                }
                double v = cell.getNumericCellValue();
                return (v % 1 == 0) ? String.valueOf((int) v) : String.valueOf(v);

            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());

            case FORMULA:
                return cell.getCellFormula();

            case BLANK:
            default:
                return "";
        }
    }
}

