package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

import static util.Utility.RandomCategoryGenerator;

public class P03_MyAccount {

    WebDriver driver;
    protected static JavascriptExecutor jse ;
    public P03_MyAccount(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.jse = (JavascriptExecutor) driver;
        this.driver = driver;
    }
    public static void scrollToElement(WebElement element) throws InterruptedException {
        Thread.sleep(1500);
        jse.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'});", element);
        Thread.sleep(1500);
    }
    @FindBy(xpath = "//a[@title='My Account']")
    WebElement myAccountList;
    @FindBy(xpath = "(//ul/li/a)[7]")
    WebElement LogoutBtn;
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueBtn;
    @FindBy(xpath = "//a[text()='Change your password']")
    WebElement ChangePasswordPage;
    @FindBy(xpath = "//input[@type=\"text\"]")
    WebElement search;
    @FindBy(xpath = "//button[@class=\"btn btn-default btn-lg\"]")
    WebElement searchBtn;
    @FindBy(xpath = "(//ul[@class=\"nav navbar-nav\"]/li)")
    List<WebElement> categories;
    @FindBy(xpath = "//i[@class=\"fa fa-home\"]")
    WebElement homeIcon;
    @FindBy(xpath = "(//button[@data-original-title=\"Add to Wish List\"]/i)[1]")
    WebElement wishListBtn;
    @FindBy(xpath = "(//button[@data-original-title=\"Compare this Product\"]/i)[2]")
    WebElement compareBtn;
    @FindBy(xpath = "(//button[@onclick=\"cart.add('40');\"]/i)")
    WebElement shoppingCartBtn;
    @FindBy(xpath = "//a[@title=\"Shopping Cart\"]")
    WebElement shoppingCartPage;

    public void ClickOnLogoutBtn() throws InterruptedException {
        this.myAccountList.click();
        this.LogoutBtn.click();
        Thread.sleep(4000);
    }

    public void clickOnForgetPasswordPage(){
        this.ChangePasswordPage.click();
    }
    public void searchForItemRandomly(String item){
        this.search.sendKeys(item);
        this.searchBtn.click();

    }
    public void HoverOnCategories(){
        Random random = new Random();
        int randomIndex = random.nextInt(categories.size());
        WebElement randomCategory = categories.get(randomIndex);
        Actions actions = new Actions(driver);
        actions.moveToElement(randomCategory).perform();
    }

    public void HoverRandomMenusButtonsAndSubCategory() {
    String SelectorMenuXpath = "//a[text()='" + RandomCategoryGenerator() + "']";
    WebElement MenusLinksHover = driver.findElement(By.xpath(SelectorMenuXpath));
    Actions ActionObj = new Actions(driver);
    ActionObj.moveToElement(MenusLinksHover).click().build().perform();
    List<WebElement> subCategories = driver.findElements(By.xpath("//a[ancestor::li[contains(@class,'open')]]"));
    if (subCategories.size() > 0) {
        Random random = new Random();
        int randomSubIndex = random.nextInt(subCategories.size());
        WebElement RandomSubCategory = subCategories.get(randomSubIndex);
        System.out.println("Randomly selected subcategory: " + RandomSubCategory.getText());
        ActionObj.moveToElement(RandomSubCategory).build().perform();
    } else {
        System.out.println("No subcategories found for the selected main category.");
    }
    }

    public void openHomePage(){
        homeIcon.click();
    }
    public void addToWishList() throws InterruptedException {
        scrollToElement(wishListBtn);
        wishListBtn.click();
    }
    public void addToCompareList() throws InterruptedException {
        scrollToElement(compareBtn);
        compareBtn.click();
    }
    public void addToShoppingCart() throws InterruptedException {
        scrollToElement(shoppingCartBtn);
        shoppingCartBtn.click();
    }
    public void openShoppingCartPage() throws InterruptedException {
        scrollToElement(shoppingCartPage);
        shoppingCartPage.click();
    }
    public String assertAddingToWishListSuccessfully(){
        return driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText();
    }
    public String assertAddingToCompareListSuccessfully(){
        return driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText();
    }
    public String assertAddingToShopListSuccessfully(){
        return driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText();
    }

}
