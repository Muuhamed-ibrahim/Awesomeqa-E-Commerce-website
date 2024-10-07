package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_ChangePasswordPage {

    public P05_ChangePasswordPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "input-password")
    WebElement password;
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;
    @FindBy(xpath = "//input[@value=\"Continue\"]")
    WebElement continueBtn;
    public void resetNewPassword(String password){
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(password);
        this.continueBtn.click();
    }

}
