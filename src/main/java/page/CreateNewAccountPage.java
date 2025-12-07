package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import model.CreateNewAccountModel;

public class CreateNewAccountPage extends CreateNewAccountModel{
	
	

	public CreateNewAccountPage(WebDriver driver) {
		super(driver);
		

	}
	
	
	public void typeFirstName(String first) throws InterruptedException {
		
		Thread.sleep(1550);
		WebElement firstname = getFirstName();
		firstname.clear();
		
		firstname.sendKeys(first);
		
		
		
		
	}
	
	
	public void typeLastName(String last) throws InterruptedException {
		WebElement lastname = getLastName();
		lastname.clear();
		
		lastname.sendKeys(last);
		//Thread.sleep(1550);
	}
	
	
	
	
	public void typeNumber(String num) throws InterruptedException {
		WebElement number = getNumber();
		number.clear();
		
		number.sendKeys(num);
		//Thread.sleep(1550);
	}
	
	
	public void typePassword(String p) throws InterruptedException {
		WebElement pass = getPassword();
		pass.clear();
		
		pass.sendKeys(p);
		//Thread.sleep(1550);
	}
	
	
	
	public void typeMonth(String m) throws InterruptedException {
		WebElement month = getMonth();
		Select month2 = new Select(month);
		
		//Thread.sleep(1550);
		
	
		
		month2.selectByVisibleText(m);
		//Thread.sleep(1550);
		

	}
	

	
	
	public void typeDay(String d) throws InterruptedException {
		WebElement day = getDay();
		Select day2 = new Select(day);
		
		Thread.sleep(1550);
		day2.selectByVisibleText(d);
		
	}
	
	
	
	
	public void typeYear(String y) throws InterruptedException {
		WebElement year = getYear();
		Select year2 = new Select(year);
		
		Thread.sleep(1550);
		year2.selectByVisibleText(y);
		
		
		
		
		
		
		
		
	}
	
	
	

	

	
public void typeGender(String gen) throws InterruptedException {
		

		WebElement gg= getGender(gen);
		
		
		
		Thread.sleep(1550);
		gg.click();
		
		
		
		
		
		
	}






	
	

}
	


