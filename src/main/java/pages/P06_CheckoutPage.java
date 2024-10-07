package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P06_CheckoutPage {
    public  P06_CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class=\"btn btn-primary\"]")
    WebElement checkoutBtn;
    @FindBy(xpath = "(//div/input)[2]")
    WebElement firstName;
    @FindBy(xpath = "(//div/input)[3]")
    WebElement lastName;
    @FindBy(xpath = "(//div/input)[5]")
    WebElement address;
    @FindBy(xpath = "(//div/input)[7]")
    WebElement city;
    @FindBy(xpath = "(//div/input)[8]")
    WebElement postCode;
    @FindBy(xpath = "//select[@name=\"country_id\"]")
    WebElement country;
    @FindBy(xpath = "//select[@id=\"input-payment-zone\"]")
    WebElement state;
    @FindBy(xpath = "(//div/input)[9]")
    WebElement continueBtn;
    @FindBy(xpath = "//input[@id=\"button-shipping-address\"]")
    WebElement continueShippingAddressBtn;
    @FindBy(xpath = "//input[@id=\"button-shipping-method\"]")
    WebElement continueShippingMethodBtn;
    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    WebElement checkBoxBtn;
    @FindBy(xpath = "//input[@id=\"button-payment-method\"]")
    WebElement continuePaymentMethodBtn;
    @FindBy(xpath = "//input[@id=\"button-confirm\"]")
    WebElement confirmOrderBtn;

    public void clickOnCheckoutBtn(){
        checkoutBtn.click();
    }
    public void BillingDetails(String firstName,String lastName,String address,String city,String postCode){
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.address.sendKeys(address);
        this.city.sendKeys(city);
        this.postCode.sendKeys(postCode);
    }
    public void selectCountry(){
        Select selectCountry = new Select(country);
        selectCountry.selectByIndex(15);
    }
    public void selectState(){
        Select selectState = new Select(state);
        selectState.selectByIndex(3);
        continueBtn.click();
    }

    public void clickOnContinueShippingAddressBtn(){
        continueShippingAddressBtn.click();
    }
    public void clickOnContinueShippingMethodBtn(){
        continueShippingMethodBtn.click();
    }
    public void clickOnContinuePaymentMethodBtn(){
        checkBoxBtn.click();
        continuePaymentMethodBtn.click();
    }
    public void ClickOnConfirmOrderBtn() {
        confirmOrderBtn.click();
    }
}
