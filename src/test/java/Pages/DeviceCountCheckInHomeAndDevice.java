package Pages;

import Locator.CountDeviceHomeVSDevicePage;
import Utility.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DeviceCountCheckInHomeAndDevice extends CountDeviceHomeVSDevicePage {

    WebDriver driver;
    Utils utils = new Utils();
    public DeviceCountCheckInHomeAndDevice(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void countCheck() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(200));
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys("integra@dev.tesenso.cloud");
        pass.sendKeys("2wsxXSW@");
        btnSubmit.click();

        //Home page device check
        Thread.sleep(10000);
        utils.waitForVisibiltyy(driver,totalDeviceHomePage);
        System.out.println("Welcome to the INTEGRA AG");
        Thread.sleep(3000);
        String getText = totalDeviceHomePage.getText();
        System.out.println("Device count string: "+getText);
        int DeviceCount = Integer.parseInt(totalDeviceHomePage.getText());
        System.out.println("Total Device Count In Home Page: "+DeviceCount);

        //Navigate
        btn_Devices.click();
        System.out.println("Welcome to the Device page");
        Thread.sleep(10000);
        utils.waitForVisibiltyy(driver,btn_addDevices);
        utils.waitForVisibiltyy(driver,label_DeviceCount);
        String totalDeviceCount = label_DeviceCount.getText();
        System.out.println(totalDeviceCount);
        // Split the input string by space and get the last part
        String[] parts = totalDeviceCount.split(" ");
        String number = null;

        // Check each part for the word "of" and get the number after it
        for (int i = 0; i < parts.length; i++) {
            if ("of".equals(parts[i]) && i < parts.length - 1) {
                number = parts[i + 1];
                break;
            }
        }

        if (number != null) {
            System.out.println("Extracted number: " + number);

        } else {
            System.out.println("Number after 'of' not found in the string.");
        }


        int deviceCountInDevicePage = Integer.parseInt(number);
        System.out.println("Device Count on Device page: "+deviceCountInDevicePage);
        System.out.println("Device Count on Home page: "+DeviceCount);

        if (DeviceCount == deviceCountInDevicePage) {
            System.out.println("Both Counts match: " + DeviceCount);
        } else {
            System.out.println("Counts do not match!");
            System.out.println("Total Count in Home Page: " + DeviceCount);
            System.out.println("Device Count in Device Page: " + deviceCountInDevicePage);
        }


        Assert.assertEquals(DeviceCount,deviceCountInDevicePage);



    }


}
