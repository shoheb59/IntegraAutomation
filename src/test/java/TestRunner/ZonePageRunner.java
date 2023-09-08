package TestRunner;

import Base.Setup;
import Pages.ConsumptionCalculation;
import Pages.CreateZoneList;
import Pages.Login;
import org.testng.annotations.Test;

public class ZonePageRunner extends Setup {

    CreateZoneList zoneList;
    ConsumptionCalculation consumptionCalculation;
    Login loginPage;


    @Test(priority = 1)
    public void userLogin() throws InterruptedException {
        loginPage = new Login(driver);
        driver.get("http://dev.tesenso.cloud");
        Thread.sleep(5000);
        loginPage.doLogin();

    }
    @Test(priority = 2, description = "Match the consumption for the period VS sum of all zone consumption")
    public void totalConsumptionVSsumOfallZone() throws InterruptedException {
        consumptionCalculation = new ConsumptionCalculation(driver);
        Thread.sleep(5000);
        consumptionCalculation.consumptionMatching();
    }

    @Test(priority = 3, description = "User can create and Search Zone")
    public void Create_Search_Zone() throws InterruptedException {
        zoneList = new CreateZoneList(driver);
        Thread.sleep(5000);
        zoneList.createandSearchZoneList();

    }

    @Test(priority = 4,description = "User can Edit the Zone")
    public void EditZone() throws InterruptedException {
        zoneList = new CreateZoneList(driver);
        Thread.sleep(5000);
        zoneList.EditZone();
    }
    @Test(priority = 5, description = "User can delete the zone")
    public void DeleteZone() throws InterruptedException {
        zoneList = new CreateZoneList(driver);
        Thread.sleep(5000);
        zoneList.DeleteZone();
    }


}
