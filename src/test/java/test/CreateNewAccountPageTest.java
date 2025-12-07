package test;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import java.io.IOException;
import java.io.InputStream;
import lib.ExcelReader;

public class CreateNewAccountPageTest extends BaseTest {

    @Test(dataProvider = "dp")
    public void createnewaccountpagetest(String first, String last, String num, String p, String m, String d, String y, String gen) throws InterruptedException {
        getHomePage();
        homePage.clickOnCreateNewAccountBtn();

        getCreateNewAccountPage();
        createNewAccountPage.typeFirstName(first);
        createNewAccountPage.typeLastName(last);
        createNewAccountPage.typeNumber(num);
        createNewAccountPage.typePassword(p);
        createNewAccountPage.typeMonth(m);
        createNewAccountPage.typeDay(d);
        createNewAccountPage.typeYear(y);
        createNewAccountPage.typeGender(gen);
    }

    @DataProvider(name = "dp")
    public Object[][] dataloader() throws IOException {
        String filename = "AnotherListOfReg.xlsx"; // must match the file in src/test/resources
        String sheetname = "Sheet1";

        InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
        if (is == null) {
            throw new IOException("Excel file '" + filename + "' not found in src/test/resources");
        }

        ExcelReader er = new ExcelReader(is, sheetname);
        return er.excelToArray();
    }
}
