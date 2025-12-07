package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import page.CreateNewAccountPage;
import page.HomePage;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;
    protected CreateNewAccountPage createNewAccountPage;

    public void getHomePage() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            // options.addArguments("--headless"); // optional for CI
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        driver.get("https://www.facebook.com");
        homePage = new HomePage(driver);
    }

    public void getCreateNewAccountPage() {
        createNewAccountPage = new CreateNewAccountPage(driver);
    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
