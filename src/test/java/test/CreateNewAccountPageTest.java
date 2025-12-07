package test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;

public class CreateNewAccountPageTest extends BaseTest{
	
	
	@Test(dataProvider="dp")
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
	
	@DataProvider(name="dp")
	public Object[][] dataloader() throws IOException {
		Object[][] t;
		
		String filename = "data/AnotherListOfReg.xlsx";
		String sheetname = "Sheet1";
		ExcelReader er = new ExcelReader(filename, sheetname);
		t = er.excelToArray();
		return t;
		
		
		}
		
		
		
	

}
