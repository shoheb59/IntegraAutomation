package Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ListZoneLocator {

    @FindBy(css = ".mat-focus-indicator.mat-tooltip-trigger.mat-button.mat-icon-button.mat-button-base.ng-star-inserted:nth-child(1)")
    public WebElement btn_ListAdd;

    @FindBy(css =".mat-focus-indicator.mat-tooltip-trigger.mat-button.mat-icon-button.mat-button-base.ng-star-inserted:nth-child(2)")
    public WebElement btn_search;

    @FindBy(css="[formcontrolname='name']")
    public WebElement txtField_name;

    @FindBy(css ="[formcontrolname='description']")
    public WebElement txtField_description;

    @FindBy(css ="[formcontrolname='location']")
    public WebElement txtField_location;

    @FindBy(css ="[type='submit']")
    public WebElement btn_submit;

    @FindBy(css="[data-placeholder='Search entities']")
    public WebElement txtField_SearchForZone;

    @FindBy(css = "tbody[role='rowgroup']")
    public List<WebElement> searchResultsMatch;
    @FindBy(css ="[aria-label='Next page']")
    public WebElement btn_nextPage;

    @FindBy(xpath="(//mat-icon[contains(text(), 'edit')])[11]")
    public WebElement btn_EditZone;

    @FindBy (xpath = "//mat-icon[contains(text(), 'delete')]")
    public WebElement btn_DeleteZone;

    @FindBy (xpath = "//span[contains(text(), 'Delete')]")
    public WebElement btn_DeleteZoneConfirmationDialog;

}
