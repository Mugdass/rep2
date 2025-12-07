package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import page.HomePage;

public class FacebookHomeStep {

	WebDriver driver = StepBase.driver;
	
	HomePage homepage = new HomePage(driver);



@Given("I am on a Facebook page {string}")
public void i_am_on_a_facebook_page(String string) {
   
	
	
	driver.navigate().to(string);
	
	
	
}

@When("I enter {string}")
public void i_enter(String username) throws InterruptedException {
  
	homepage.typeUsername(username);

}

@When("When I enter {string}")
public void when_i_enter(String password) throws InterruptedException {
    
	homepage.typePsw(password);

}

@When("I click on Login button")
public void i_click_on_login_button() throws InterruptedException {
   
	homepage.typeClickOnLoginBtn();

}

@Then("I verify I am in user Home page")
public void i_verify_i_am_in_user_home_page() throws InterruptedException {
   
	boolean expectedR = true;
	
	boolean actualR = homepage.typea();
	
	Assert.assertEquals(actualR,expectedR);

	
}




}
