package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static util.Utility.generateRandomIntForRadioButton;

public class P02_RegisterPage {

    WebDriver driver;
    public P02_RegisterPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(id = "input-firstname")
    WebElement firstname;
    @FindBy(id = "input-lastname")
    WebElement lastname;
    @FindBy(id = "input-email")
    WebElement email;
    @FindBy(id = "input-telephone")
    WebElement phone;
    @FindBy(id = "input-password")
    WebElement password;
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;
    @FindBy(name = "agree")
    WebElement terms;
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement ContinueBtn;

    public void register(String firstname,String lastname,String email,String phone,String password) {


        this.firstname.sendKeys(firstname);
        this.lastname.sendKeys(lastname);
        this.email.sendKeys(email);
        this.phone.sendKeys(phone);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(password);
        // random select newsletter
        String newsletterXpath = "(//input)[" + generateRandomIntForRadioButton() + "]";
        driver.findElement(By.xpath(newsletterXpath)).click();
        terms.click();
        ContinueBtn.click();

    }
}
