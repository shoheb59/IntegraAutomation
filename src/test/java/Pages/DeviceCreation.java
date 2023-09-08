package Pages;

import Locator.DeviceCreationLocator;
import Utility.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeviceCreation extends DeviceCreationLocator {
    WebDriver driver;
    Utils utils = new Utils();


    public DeviceCreation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    public void totalCountofDeviceHomePage()
//    {
//        int DeviceCount = Integer.parseInt(totalDeviceHomePage.getText());
//        System.out.println("Total Device Count In Home Page: "+DeviceCount);
//
//    }
    public void navigateDevicePage()
    {
        btn_Devices.click();
        System.out.println("Welcome to the Device page");
    }
    public void createDevice() throws InterruptedException {
        btn_addDevices.click();
        txtField_Dev_EUI.sendKeys("ABCD12345678EFAB");
        txtField_Join_EUI.sendKeys("ABCD12345678EFAB");
        Thread.sleep(3000);
        dd_ListOfProfile.sendKeys("ABCD");
        txtField_Device_AppKey.sendKeys("ABCD12345678EFABABCD12345678EFAB");
        txtField_SerialNo_Meter.sendKeys("123456789");
        txtField_Device_Description.sendKeys("Automated Device Description");
        dd_ListOfZone.sendKeys("A156");
        txtField_Device_Address.sendKeys("Germany");
        txtField_Device_PC.sendKeys("PC ADDRESS: 01 Street blvd");
        txtField_Device_Location.sendKeys("GenevaLocation");
        txtField_ClientNo.sendKeys("01");
        txtField_ClinetName.sendKeys("John Has Nat");
        btn_SaveCreatedDevice.click();

    }


    public void searchDevices()
    {
        txtField_Search.click();
        txtField_SearchField.sendKeys("ABCD12345678EFAB");
    }

    public void editDevice()
    {
        btn_EditDevice.click();
        txtField_Device_Description.sendKeys(": Description Edited");
        btn_SaveCreatedDevice.click();
    }
    public void deleteDevice()
    {
        btn_DeleteDevice.click();
        btn_YESdialogBox.click();
        btn_NoAbortDialog.click();
        closeIconOfSearchButton.click();

    }
    public void exportDeviceFile() throws InterruptedException {
        btn_ExportDevice.click();
        utils.waitForVisibiltyy(driver,btn_ExportAsCSV);
        btn_ExportAsCSV.click();

        btn_ExportDevice.click();
        utils.waitForVisibiltyy(driver,btn_ExportAsXLS);
        btn_ExportAsXLS.click();


        btn_ExportDevice.click();
        utils.waitForVisibiltyy(driver,btn_ExportAsXLSX);
        btn_ExportAsXLSX.click();

    }

//    public void deviceCountCheck()
//    {
//
//
//
//
//        utils.waitForVisibiltyy(driver,label_DeviceCount);
//        String totalDeviceCount = label_DeviceCount.getText();
//        System.out.println(totalDeviceCount);
//        // Split the input string by space and get the last part
//        String[] parts = totalDeviceCount.split(" ");
//        String number = null;
//
//        // Check each part for the word "of" and get the number after it
//        for (int i = 0; i < parts.length; i++) {
//            if ("of".equals(parts[i]) && i < parts.length - 1) {
//                number = parts[i + 1];
//                break;
//            }
//        }
//
//        if (number != null) {
//            System.out.println("Extracted number: " + number);
//
//        } else {
//            System.out.println("Number after 'of' not found in the string.");
//        }
//
//
//        int deviceCountInDevicePage = Integer.parseInt(number);
//        System.out.println("Device Count on Device page: "+deviceCountInDevicePage);
//
//
//    }


}
