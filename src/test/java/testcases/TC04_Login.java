package testcases;

import org.testng.annotations.Test;
import pages.P04_LoginPage;

import static testcases.TC02_Register.*;
import static testcases.TC05_ChangePassword.newPassword;

public class TC04_Login extends TestBase{
    P04_LoginPage loginPage;

    @Test(priority = 1, description = "Login with valid data")
    public void validateLoginWithValidData() throws InterruptedException {
        loginPage = new P04_LoginPage(driver);
        loginPage.login(email,password);
        Thread.sleep(2500);
    }

    @Test(priority = 2, description = "Login with New Password After changed")
    public void validateLoginWithNewPassword() throws InterruptedException {
        loginPage = new P04_LoginPage(driver);
        loginPage.login(email,newPassword);
        Thread.sleep(2500);
    }

}
