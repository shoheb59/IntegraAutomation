package TestRunner;

import Base.Setup;
import Pages.Login;
import Pages.Setting_AllUserPage;
import org.testng.annotations.Test;

public class AllUserPageRunner extends Setup {

    Setting_AllUserPage allUserPage;
    Login loginPage;


    @Test(priority = 1, description = "Use can Login with Valid Credential")
    public void userLogin() throws InterruptedException {
        loginPage = new Login(driver);
        driver.get("http://dev.tesenso.cloud");
        Thread.sleep(5000);
        loginPage.doLogin();

    }
    @Test(priority = 2)
    public void navigateSetting() throws InterruptedException {
        allUserPage = new Setting_AllUserPage(driver);
        Thread.sleep(3000);
        allUserPage.navigateToSetting();
    }

    @Test(priority = 3)
    public void CreateUser() throws InterruptedException {
        allUserPage = new Setting_AllUserPage(driver);
        Thread.sleep(3000);
        allUserPage.CreateUser();
    }

    @Test(priority = 4)
    public void searchUser() throws InterruptedException {
        allUserPage = new Setting_AllUserPage(driver);
        Thread.sleep(3000);
        allUserPage.SearchUser();
    }
    @Test(priority = 5)
    public void EditUserr() throws InterruptedException {
        allUserPage = new Setting_AllUserPage(driver);
        Thread.sleep(3000);
        allUserPage.EditUser();
    }

    @Test(priority = 6)
    public void DeleteUserr() throws InterruptedException {
        allUserPage = new Setting_AllUserPage(driver);
        Thread.sleep(3000);
        allUserPage.deleteUser();
    }
}
