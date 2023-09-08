package Pages;

import Locator.AllUserLocator;
import Utility.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Setting_AllUserPage extends AllUserLocator {

    WebDriver driver;
    Utils utils = new Utils();
    public Setting_AllUserPage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void navigateToSetting()
    {
        btn_Setting.click();
        System.out.println("Welcome to the Setting");
        btn_AllUser.click();
        System.out.println("You are now in ALL USER PAGE");
    }

    public void CreateUser()
    {
        btn_Add.click();
        txtField_UserEmail.sendKeys("random@yopmail.com");
        txtField_UserFirstName.sendKeys("Mr T");
        txtField_UserLastName.sendKeys("Hensen");
        txtField_UserPhoneNumber.sendKeys("414143442");
        txtfield_Description.sendKeys("Description Added");
        utils.waitForVisibiltyy(driver,btn_AddUser);
        btn_AddUser.click();
        utils.waitForVisibiltyy(driver,btn_OKuserActivation);
        btn_OKuserActivation.click();

    }
    public void SearchUser()
    {
        btn_SearchUser.click();
        txtField_SearchFieldUser.sendKeys("random@yopmail.com");

    }
    public void EditUser()
    {
        utils.waitForVisibiltyy(driver, btn_EditUser );
        btn_EditUser.click();
        txtField_UserLastName.sendKeys("-Jansen");
        utils.waitForVisibiltyy(driver,btn_AddUser);
        btn_AddUser.click();

    }
    public void deleteUser()
    {
        btn_DeleteUser.click();
        btn_DeleteDialogBox.click();

    }

}
