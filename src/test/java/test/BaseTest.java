package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.CreateNewAccountPage;
import page.HomePage;

public class BaseTest {

    protected static WebDriver driver;
    protected static CreateNewAccountPage createNewAccountPage;
    protected static HomePage homePage;

    @BeforeSuite
    public void setup() {

        // Ensure correct ChromeDriver version
        WebDriverManager.chromedriver().setup();

        // ChromeOptions for CI + local runs
        ChromeOptions options = new ChromeOptions();

        // IMPORTANT: Work both in GitHub Actions and locally
        if (isCI()) {
            System.out.println("Running in CI environment → Enabling headless mode");

            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-dev-shm-usage");
        }

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
    }

    // Detect GitHub Actions or any CI runner
    private boolean isCI() {
        return System.getenv("GITHUB_ACTIONS") != null ||
               System.getenv("CI") != null;
    }

    public void getCreateNewAccountPage() {
        createNewAccountPage = new CreateNewAccountPage(driver);
    }

    public void getHomePage() {
        homePage = new HomePage(driver);
    }

    @AfterSuite
    public void quitDriver() throws InterruptedException {
        Thread.sleep(500);
        if (driver != null) {
            driver.quit();
        }
    }
}

