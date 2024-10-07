package testcases;

import org.testng.annotations.Test;
import pages.P06_CheckoutPage;

import static util.Utility.*;

public class TC06_Checkout extends TestBase{
    P06_CheckoutPage checkoutPage;
    String firstName = generateRandomFirstname();
    String lastName = generateRandomLastname();
    String address = generateRandomAddress();
    String city = generateRandomCity();
    String postelCode = generatePostelCode();

    @Test(priority = 1)
    public void clickOnCheckoutBtn(){
        checkoutPage = new P06_CheckoutPage(driver);
        checkoutPage.clickOnCheckoutBtn();
    }

    @Test(priority = 2)
    public void validateBillingDetails() throws InterruptedException {
        checkoutPage = new P06_CheckoutPage(driver);
        checkoutPage.BillingDetails(firstName,lastName,address,city,postelCode);
        checkoutPage.selectCountry();
        Thread.sleep(1500);
        checkoutPage.selectState();
        Thread.sleep(1500);
        checkoutPage.clickOnContinueShippingAddressBtn();
        Thread.sleep(1500);
        checkoutPage.clickOnContinueShippingMethodBtn();
        Thread.sleep(1500);
        checkoutPage.clickOnContinuePaymentMethodBtn();
        Thread.sleep(1500);
        checkoutPage.ClickOnConfirmOrderBtn();
    }
}
