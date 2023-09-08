package Pages;

import Locator.LoginLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.Duration;

public class Login extends LoginLocator {

    WebDriver driver;
    public Login (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void doLogin() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(200));
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys("integra@dev.tesenso.cloud");
        pass.sendKeys("2wsxXSW@");
        btnSubmit.click();
        wait.until(ExpectedConditions.visibilityOf(consumptionForthePeriod));
        System.out.println("Welcome to the INTEGRA AG");
        Thread.sleep(3000);

    }

}
