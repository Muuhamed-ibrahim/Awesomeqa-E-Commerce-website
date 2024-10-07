package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_LoginPage {
    public P04_LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "input-email")
    WebElement email;
    @FindBy(id = "input-password")
    WebElement password;
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement loginBtn;
    public void login(String email,String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.loginBtn.click();
    }
}
