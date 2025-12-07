package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.HomeModel;

public class HomePage extends HomeModel {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	
	public void clickOnCreateNewAccountBtn() throws InterruptedException {
		
		WebElement btn = getCreateNewAccountBtn();
		btn.click();
		
		
	}
	
	
	
	
	
public void typeClickOnLoginBtn() throws InterruptedException {
		
		WebElement ClickOnLoginBtn = getClickOnLoginBtn();
		ClickOnLoginBtn.click();
		
		
	}








public void typeUsername(String username) throws InterruptedException {
	

	WebElement Username = getUsername();

	WebElement Psw = getPsw();
	
	Username.sendKeys(username);
	
	//Psw.sendKeys(password);
	
	
}


public void typePsw(String password) throws InterruptedException {
	WebElement Psw = getPsw();
	
	Psw.sendKeys(password);
	//Thread.sleep(1550);
}
	
	




public boolean typea() throws InterruptedException {
	boolean a = geta();
	
	System.out.println("verified: " + a);
	//Thread.sleep(1550);
	return a;
}
	
}
