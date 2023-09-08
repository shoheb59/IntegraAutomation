package Pages;

import Locator.LoginLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.text.DecimalFormat;

public class ConsumptionCalculation extends LoginLocator {
    WebDriver driver;
    public ConsumptionCalculation (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void consumptionMatching() throws InterruptedException {
        double consump = Double.parseDouble(consumptionForthePeriod.getText());
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Total Consumption: "+df.format(consump));

        Thread.sleep(4000);
        double sum = 0;

        int CellSize = consumptionCells.size();
        //System.out.println("cell size"+CellSize);

        for(int i=0; i< CellSize ;i++)
        {
            System.out.println("Starting i"+i);
            System.out.println("Cell size"+CellSize);
            if(i==10 )
            {
                break;
            }

            double consumption1;
            //System.out.println(consumptionCells.get(i).getText());
            consumption1 = Double.parseDouble(consumptionCells.get(i).getText());
            DecimalFormat df1 = new DecimalFormat("#.000");
            System.out.println("Consumption Value is: "+df1.format(consumption1));

            sum = sum + consumption1;
            System.out.println("Sum is: "+df.format(sum));
            if(i == 9 && btn_NextPage.isEnabled())
            {
                btn_NextPage.click();
                int reset = i;
                i = -1;
                Thread.sleep(10000);

                int resetCell = consumptionCells.size();
                CellSize = consumptionCells.size();



            }


        }


        Assert.assertEquals(consump,sum);
        System.out.println("Assertion passed");

    }
}
