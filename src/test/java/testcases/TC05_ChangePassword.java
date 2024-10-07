package testcases;

import org.testng.annotations.Test;
import pages.P05_ChangePasswordPage;

import static util.Utility.generateRandomPassword;

public class TC05_ChangePassword extends TestBase{
    P05_ChangePasswordPage forgetPage;
     static String newPassword = generateRandomPassword();

    @Test(priority = 1)
    public void resetNewPassword() throws InterruptedException {
        forgetPage = new P05_ChangePasswordPage(driver);
        forgetPage.resetNewPassword(newPassword);
        System.out.println("New Password: " + newPassword);
        Thread.sleep(5000);
    }
}
