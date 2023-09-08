package Pages;

import Locator.ListZoneLocator;
import Utility.Utils;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CreateZoneList extends ListZoneLocator {

    WebDriver driver;

    public CreateZoneList(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void createandSearchZoneList() throws InterruptedException {
        Thread.sleep(2000);
        btn_ListAdd.click();
        Thread.sleep(1000);
        String zoneName =  Utils.ZoneName();
        txtField_name.sendKeys(zoneName);
        System.out.println("New Added Zone name: "+zoneName);

        Thread.sleep(1000);
        txtField_description.sendKeys(("My Demo Description Unique id: "+Utils.generateRandomID(10,3000)));
        Thread.sleep(1000);
        txtField_location.sendKeys("Dhaka: "+Utils.generateRandomID(10,4000));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
        wait.until(ExpectedConditions.visibilityOf(btn_submit));
        wait.until(ExpectedConditions.elementToBeClickable(btn_submit));
        btn_submit.click();
        Thread.sleep(3000);


        System.out.println("Search the Created Zone name");
        btn_search.click();

        txtField_SearchForZone.sendKeys(zoneName);
        txtField_SearchForZone.sendKeys(Keys.ENTER);

//        for(int i=0;i<= 1000;i++)
//        {
//            String SearchTextResults = searchResultsMatch.get(i).getText();
//            if(!SearchTextResults.equalsIgnoreCase(zone))
//            {
//
//
//                System.out.println("Found:"+SearchTextResults);
//                btn_nextPage.click();
//                i++;
//
//
//
//
//            }
//            else {
//                System.out.println("Fount Result: "+SearchTextResults);
//                Assert.assertEquals(zone,SearchTextResults);
//            }
//        }



    }

    public void EditZone () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
        wait.until(ExpectedConditions.elementToBeClickable(btn_EditZone));
        btn_EditZone.click();
        txtField_description.sendKeys(": Newly Added Description");
        btn_submit.click();

    }
    public void DeleteZone()
    {
        btn_DeleteZone.click();
        btn_DeleteZoneConfirmationDialog.click();


    }

}
