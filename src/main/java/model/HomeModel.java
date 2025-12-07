package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomeModel extends BaseModel {

	public HomeModel(WebDriver driver) {
		super(driver);
		
	}

	
	
	
	
	public WebElement getCreateNewAccountBtn() throws InterruptedException {
		
		
		WebElement btn = driver.findElement(By.xpath("//div[5]/a"));
			return btn;

		
		
		

	}
	
	
	
	
	
	
	
	
public WebElement getClickOnLoginBtn() throws InterruptedException {
		
		
		WebElement ClickOnLoginBtn = driver.findElement(By.xpath("//button[text()='Log In']"));
			return ClickOnLoginBtn;

		
		
		

	}
	
	






public WebElement getUsername() {
	
	WebElement Username = driver.findElement(By.xpath("//input[@name='email']"));
	
	
	return Username;
	
}


public WebElement getPsw() {
	
	WebElement Psw = driver.findElement(By.xpath("//input[@name='pass']"));
	
	return Psw;
	
}
	




public boolean geta() {
	
	boolean a = driver.findElement(By.xpath("//a[@aria-label='Home']")).isDisplayed();
	
	return a;
	
}
	

	
	
}
