package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import model.CreateNewAccountModel;

public class CreateNewAccountPage extends CreateNewAccountModel {

    private WebDriverWait wait;

    public CreateNewAccountPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10s explicit wait
    }

    public void typeFirstName(String first) {
        WebElement firstname = wait.until(ExpectedConditions.visibilityOf(getFirstName()));
        firstname.clear();
        firstname.sendKeys(first);
    }

    public void typeLastName(String last) {
        WebElement lastname = wait.until(ExpectedConditions.visibilityOf(getLastName()));
        lastname.clear();
        lastname.sendKeys(last);
    }

    public void typeNumber(String num) {
        WebElement number = wait.until(ExpectedConditions.visibilityOf(getNumber()));
        number.clear();
        number.sendKeys(num);
    }

    public void typePassword(String p) {
        WebElement pass = wait.until(ExpectedConditions.visibilityOf(getPassword()));
        pass.clear();
        pass.sendKeys(p);
    }

    public void typeMonth(String m) {
        WebElement month = wait.until(ExpectedConditions.visibilityOf(getMonth()));
        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText(m);
    }

    public void typeDay(String d) {
        WebElement day = wait.until(ExpectedConditions.visibilityOf(getDay()));
        Select selectDay = new Select(day);
        selectDay.selectByVisibleText(d);
    }

    public void typeYear(String y) {
        WebElement year = wait.until(ExpectedConditions.visibilityOf(getYear()));
        Select selectYear = new Select(year);
        selectYear.selectByVisibleText(y);
    }

    public void typeGender(String gen) {
        WebElement gender = wait.until(ExpectedConditions.elementToBeClickable(getGender(gen)));
        gender.click();
    }
}



