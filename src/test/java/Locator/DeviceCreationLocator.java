package Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeviceCreationLocator {
    @FindBy(xpath = "//div[contains(text(), 'Devices')]")
    public WebElement btn_Devices;

    @FindBy(xpath = "//mat-icon[contains(text(), 'add')]")
    public WebElement btn_addDevices;

    @FindBy(css = "[formcontrolname = 'dev_eui']")
    public WebElement txtField_Dev_EUI;

    @FindBy(css = "[formcontrolname = 'join_eui']")
    public WebElement txtField_Join_EUI;

    @FindBy(css = "[formcontrolname = 'meter_serial_no']")
    public WebElement txtField_SerialNo_Meter;

    @FindBy(css = "[formcontrolname = 'device_description']")
    public WebElement txtField_Device_Description;

    @FindBy(css = "[formcontrolname = 'device_address']")
    public WebElement txtField_Device_Address;
    @FindBy(css = "[formcontrolname = 'device_address_PC']")
    public WebElement txtField_Device_PC;

    @FindBy(css = "[formcontrolname = 'device_address_locality']")
    public WebElement txtField_Device_Location;

    @FindBy(css = "[formcontrolname = 'app_key']")
    public WebElement txtField_Device_AppKey;

    @FindBy(css = "[formcontrolname = 'client_no']")
    public WebElement txtField_ClientNo;
    @FindBy(css = "[formcontrolname = 'client_name']")
    public WebElement txtField_ClinetName;

    @FindBy(css = "[formcontrolname = 'device_profil']")
    public WebElement dd_ListOfProfile;
    @FindBy(css = "[formcontrolname = 'zone']")
    public WebElement dd_ListOfZone;

    @FindBy(xpath = "//span[contains(text(), 'Save')]")
    public  WebElement btn_SaveCreatedDevice;

    @FindBy(xpath = "(//mat-icon[contains(text(), 'search')])[2]")
    public WebElement txtField_Search;

    @FindBy(xpath = "//*[@data-placeholder='Search entities']")
    public WebElement txtField_SearchField;

    @FindBy (xpath = "//mat-icon[contains(text(), 'delete_outline')]")
    public WebElement btn_DeleteDevice;

    @FindBy (xpath = "//span[contains(text(), 'Yes')]")
    public WebElement btn_YESdialogBox;

    @FindBy(xpath = "(//span[contains(text(), 'No')])[2]")
    public WebElement btn_NoAbortDialog;

    @FindBy(xpath = "(//mat-icon[contains(text(), 'edit')])[7]")
    public WebElement btn_EditDevice;

    @FindBy(xpath = "(//*[@data-mat-icon-name='file-export'])[7]")
    public WebElement btn_ExportDevice;

    @FindBy(xpath = "(//span[@translate])[1]")
    public WebElement btn_ExportAsCSV;

    @FindBy(xpath = "(//span[@translate])[2]")
    public WebElement btn_ExportAsXLS;
    @FindBy(xpath = "(//span[@translate])[3]")
    public WebElement btn_ExportAsXLSX;

    //Device count Level
    @FindBy (css = ".mat-paginator-range-label:nth-of-type(1)")
    public WebElement label_DeviceCount;

    @FindBy (xpath = "(//div[@class='card-wrapper']//span[@class='value'])[2]")
    public WebElement totalDeviceHomePage;

    @FindBy(xpath = "(//mat-icon[contains(text(), 'close')])[7]")
    public WebElement closeIconOfSearchButton;

}
