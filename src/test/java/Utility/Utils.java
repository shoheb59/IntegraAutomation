package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {
    public static int generateRandomID(int min, int max) {
        int id = (int) (Math.random() * (max - min) + min);
        return id;
    }

    public static String ZoneName() {
        int num = Utils.generateRandomID(10, 2000);
        String zone = "NewZone" + num;
        return zone;
    }

    WebDriver driver;
    public void waitForVisibiltyy(WebDriver driver,WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
