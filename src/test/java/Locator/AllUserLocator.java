package Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllUserLocator {

    @FindBy(xpath = "//div[contains(text(), 'Settings')]")
    public WebElement btn_Setting;

    @FindBy(xpath = "//span[contains(text(), 'All Users')]")
    public WebElement btn_AllUser;


    //User Creation
    @FindBy(xpath = "//mat-icon[contains(text(), 'add')]")
    public WebElement btn_Add;

    @FindBy(css = "[formcontrolname='email']")
    public WebElement txtField_UserEmail;

    @FindBy (css = "[formcontrolname='firstName']")
    public WebElement txtField_UserFirstName;

    @FindBy(css = "[formcontrolname='lastName']")
    public WebElement txtField_UserLastName;

    @FindBy (css = "[formcontrolname='phoneNumber']")
    public WebElement txtField_UserPhoneNumber;

    @FindBy(css = "[formcontrolname='description']")
    public WebElement txtfield_Description;

    @FindBy(xpath = "//span[contains(text(),'Add')]")
    public WebElement btn_AddUser;

    @FindBy(xpath = "//span[contains(text(),'OK')]")
    public WebElement btn_OKuserActivation;

    //Search
    @FindBy(xpath = "(//mat-icon[contains(text(), 'search')])[2]")
    public WebElement btn_SearchUser;

    @FindBy(xpath = "//*[@data-placeholder='Search entities']")
    public WebElement txtField_SearchFieldUser;


    //Edit
    @FindBy(xpath = "(//mat-icon[contains(text(), 'edit')])")
    public WebElement btn_EditUser;

    //Delete
    @FindBy (xpath = "//mat-icon[contains(text(), 'delete')]")
    public WebElement btn_DeleteUser;

    @FindBy(xpath = "//span[contains(text(), 'Delete')]")
    public WebElement btn_DeleteDialogBox;


}
