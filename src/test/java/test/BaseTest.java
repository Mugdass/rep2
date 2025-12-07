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
            options.addArguments("--no-sandbox"); // required for Linux CI
            options.addArguments("--disable-dev-shm-usage"); // avoid resource issues

            // Run headless on CI (GitHub Actions) but visible locally
            if (System.getenv("GITHUB_ACTIONS") != null) {
                options.addArguments("--headless=new");
                options.addArguments("--window-size=1920,1080");
                options.addArguments("--disable-gpu");
            } else {
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
            }

            driver = new ChromeDriver(options);
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
