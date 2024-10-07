package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;

public class TC01_Home extends TestBase{
    P01_HomePage homePage;

    @Test(priority = 1)
    public void ValidateRegisterPage(){
        homePage=new P01_HomePage(driver);
        homePage.openRegisterPage();
    }

    @Test(priority = 2)
    public void ValidateLoginPage(){
        homePage=new P01_HomePage(driver);
        homePage.openLoginPage();
    }

    @Test(priority = 3)
    public void ValidateChangeCurrency() throws InterruptedException {
        homePage=new P01_HomePage(driver);
        homePage.changeCurrencyBtn();
    }


}
