package TestRunner;

import Base.Setup;
import Pages.DeviceCreation;
import Pages.Login;
import org.testng.annotations.Test;

public class DevicePageRunner extends Setup {

    DeviceCreation deviceCreation;
    Login loginPage;



    @Test(priority = 1, description = "Use can login successfully")
    public void userLogin() throws InterruptedException {
        loginPage = new Login(driver);
        driver.get("http://dev.tesenso.cloud");
        Thread.sleep(5000);
        loginPage.doLogin();


    }


    @Test(priority = 2, description = "User navigate to the DEVICE page")
    public void NavigateDevicePage() throws InterruptedException {
        deviceCreation = new DeviceCreation(driver);
        Thread.sleep(5000);
        deviceCreation.navigateDevicePage();

    }

    @Test(priority = 3, description = "User can create the Devices")
    public void CreateDevice() throws InterruptedException {
        deviceCreation = new DeviceCreation(driver);
        Thread.sleep(5000);
        deviceCreation.createDevice();

    }


    @Test(priority = 4, description = "User can Search the Devices")
    public void SearchDevice() throws InterruptedException {
        deviceCreation = new DeviceCreation(driver);
        Thread.sleep(5000);
        deviceCreation.searchDevices();

    }

    @Test(priority = 5, description = "User can Edit the devices")
    public void EditDevice() throws InterruptedException {
        deviceCreation = new DeviceCreation(driver);
        Thread.sleep(5000);
        deviceCreation.editDevice();

    }
    @Test(priority = 6, description = "User can delete the Device")
    public void DeleteDevice() throws InterruptedException {
        deviceCreation = new DeviceCreation(driver);
        Thread.sleep(5000);
        deviceCreation.deleteDevice();

    }

    @Test(priority = 7, description = "User can Export the File")
    public void ExportDevices() throws InterruptedException {
        deviceCreation = new DeviceCreation(driver);
        Thread.sleep(5000);
        deviceCreation.exportDeviceFile();

    }



}
