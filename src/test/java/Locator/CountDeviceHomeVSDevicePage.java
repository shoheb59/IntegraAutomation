package Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CountDeviceHomeVSDevicePage {

    @FindBy(css = "input[id='username-input']")
    public WebElement userName;

    @FindBy(css = "input[id='password-input']")
    public WebElement pass;

    @FindBy(css = "button[class*='mat-accent']" )
    public WebElement btnSubmit;

    @FindBy (xpath = "(//div[@class='card-wrapper']//span[@class='value'])[2]")
    public WebElement totalDeviceHomePage;

    @FindBy(xpath = "//div[contains(text(), 'Devices')]")
    public WebElement btn_Devices;
    @FindBy (css = ".mat-paginator-range-label:nth-of-type(1)")
    public WebElement label_DeviceCount;

    @FindBy(xpath = "//mat-icon[contains(text(), 'add')]")
    public WebElement btn_addDevices;
}
