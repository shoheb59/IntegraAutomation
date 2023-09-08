package Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginLocator {



    @FindBy(css = "input[id='username-input']")
    public WebElement userName;

    @FindBy(css = "input[id='password-input']")
    public WebElement pass;

    @FindBy(css = "button[class*='mat-accent']" )
    public WebElement btnSubmit;



    @FindBy(css = ".unit-value .value")
    public WebElement consumptionForthePeriod;

    @FindBy(xpath = "//tbody[@role='rowgroup']//mat-cell[@class='mat-cell cdk-cell cdk-column-def5 mat-column-def5 ng-star-inserted']")
    public List<WebElement> consumptionCells;

    @FindBy(css = "[aria-label='Next page']")
    public WebElement btn_NextPage;

    @FindBy(css = "[disabled = 'true']")
    public WebElement btn_nextPAge_disable;
}
