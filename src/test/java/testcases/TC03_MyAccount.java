package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_MyAccount;

import static util.Utility.getRandomItem;

public class TC03_MyAccount extends TestBase{
    P03_MyAccount myAccount;
    String item = getRandomItem();

    @Test(priority = 1)
    public void logoutBtn() throws InterruptedException {
        myAccount = new P03_MyAccount(driver);
        myAccount.ClickOnLogoutBtn();
    }
    @Test(priority = 2)
    public void validateForgetPasswordPage(){
        myAccount = new P03_MyAccount(driver);
        myAccount.clickOnForgetPasswordPage();
    }
    @Test(priority = 3)
    public void searchOnItemRandomly() throws InterruptedException {
        myAccount = new P03_MyAccount(driver);
        myAccount.searchForItemRandomly(item);
        Thread.sleep(1500);
    }
    @Test(priority = 4)
    public void HoverOnCategories() throws InterruptedException {
        myAccount = new P03_MyAccount(driver);
        myAccount.HoverOnCategories();
        Thread.sleep(1500);
    }
    @Test(priority = 5)
    public void selectItemFromSubCategories() throws InterruptedException {
        myAccount = new P03_MyAccount(driver);
        myAccount.HoverRandomMenusButtonsAndSubCategory();
        Thread.sleep(1000);
    }
    @Test(priority = 6)
    public void openHomePage() throws InterruptedException {
        myAccount = new P03_MyAccount(driver);
        myAccount.openHomePage();
        Thread.sleep(1500);
    }

    @Test(priority = 7)
    public void addToWishList() throws InterruptedException {
        myAccount = new P03_MyAccount(driver);
        myAccount.addToWishList();
        Thread.sleep(1500);
        //Assert.assertEquals(myAccount.assertAddingToWishListSuccessfully(),"You must login or create an account to save MacBook to your wish list!");
    }
    @Test(priority = 8)
    public void addToCompareList() throws InterruptedException {
        myAccount = new P03_MyAccount(driver);
        myAccount.addToCompareList();
        Thread.sleep(1500);
        //Assert.assertEquals(myAccount.assertAddingToCompareListSuccessfully()," Success: You have added ");
    }
    @Test(priority = 9)
    public void addToShoppingCart() throws InterruptedException {
        myAccount = new P03_MyAccount(driver);
        myAccount.addToShoppingCart();
        Thread.sleep(1500);
        //Assert.assertEquals(myAccount.assertAddingToShopListSuccessfully()," Success: You have added ");
    }
    @Test(priority = 10)
    public void openShoppingCartPage() throws InterruptedException {
        myAccount = new P03_MyAccount(driver);
        myAccount.openShoppingCartPage();
        Thread.sleep(1500);
    }
}
