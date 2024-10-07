package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static util.Utility.getRandomCurrencyIndex;

public class P01_HomePage {
    // 1- constructor -> page factory initialize driver
    // 2- locators -> private
    // 3- action methods -> public

    WebDriver driver;
    public P01_HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    @FindBy(xpath = "//a[@title='My Account']")
    WebElement myAccountList;
    @FindBy(xpath = "//a[text()='Register']")
    WebElement RegisterPage;
    @FindBy(xpath = "//a[text()='Login']")
    WebElement LoginPage;
    @FindBy(xpath = "//button[@class=\"btn btn-link dropdown-toggle\"]")
    WebElement currencyBtn;

    public void openRegisterPage(){
        this.myAccountList.click();
        this.RegisterPage.click();
    }
    public void openLoginPage(){
        this.myAccountList.click();
        this.LoginPage.click();
    }

    public void changeCurrencyBtn() throws InterruptedException {
        currencyBtn.click();
        Thread.sleep(1000);
        // random select currency
        String currencyXpath = "(//ul[@class='dropdown-menu'])/li[" + getRandomCurrencyIndex() + "]";
        driver.findElement(By.xpath(currencyXpath)).click();
    }



}
