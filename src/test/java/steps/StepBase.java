package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.HomePage;

public class StepBase {

    static WebDriver driver;
    HomePage homepage;

    @io.cucumber.java.Before
    public void before() {
        // Automatically setup the correct ChromeDriver version
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @io.cucumber.java.After
    public void after() throws InterruptedException {
        Thread.sleep(2000); // optional
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    // Getter for driver if needed in steps
    public static WebDriver getDriver() {
        return driver;
    }
}
