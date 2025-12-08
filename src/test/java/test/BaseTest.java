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
            options.addArguments("--no-sandbox"); 
            options.addArguments("--disable-dev-shm-usage");

            // Only run headless locally if desired; CI will use Xvfb to "see" the browser
            if (System.getenv("LOCAL_HEADLESS") != null) {
                options.addArguments("--headless=new");
                options.addArguments("--window-size=1920,1080");
                options.addArguments("--disable-gpu");
            }

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
