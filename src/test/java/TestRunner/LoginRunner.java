package TestRunner;

import Base.Setup;
import Pages.ConsumptionCalculation;
import Pages.CreateZoneList;
import Pages.DeviceCreation;
import Pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginRunner extends Setup {

    Login loginPage;


    @Test(priority = 1, description = "Use can Login with Valid Credential")
    public void userLogin() throws InterruptedException {
        loginPage = new Login(driver);
        driver.get("http://dev.tesenso.cloud");
        Thread.sleep(5000);
        loginPage.doLogin();

    }


}
