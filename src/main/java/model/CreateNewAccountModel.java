package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccountModel extends BaseModel{

	public CreateNewAccountModel(WebDriver driver) {
		super(driver);
	}
	
	
	public WebElement getFirstName() {
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		
		return firstname;
		
	}
	
	
public WebElement getLastName() {
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		return lastname;
		
	}



public WebElement getNumber() {
	
	WebElement number = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	
	return number;
	
}


public WebElement getPassword() {
	
	WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	
	return pass;
	
}


public WebElement getMonth() {
	
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	
	
	
	return month;
	
}



public WebElement getDay() {
	
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	
	
	return day;
	
}



public WebElement getYear() {
	
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	
	
	return year;
	
}



public WebElement getGender(String gen) {
	
	
	//String genderXpath = "//label[text()='" +  gen+      "']/following-sibling::input";
	String genderXpath = "//label[text()='" +  gen+      "']";
	WebElement gg = driver.findElement(By.xpath(genderXpath));
	
	
	return gg;
	
}








	
	
	
}
