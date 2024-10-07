package testcases;

import org.testng.annotations.Test;
import pages.P02_RegisterPage;

import static util.Utility.*;

public class TC02_Register extends TestBase{

    P02_RegisterPage registerPage;
    static String email = generateRandomEmail();
    static String password = generateRandomPassword();
    String firstname = generateRandomFirstname();
    String lastname = generateRandomLastname();
    String phone = generateRandomPhone();


    @Test(priority = 1, description = "Register with valid data")
    public void registerNewUserWithValidData() throws InterruptedException {
        registerPage = new P02_RegisterPage(driver);
        registerPage.register(firstname,lastname,email,phone,password);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        Thread.sleep(1500);
    }









//    String invalidFirstname = faker.lorem().characters(1, 2);
//    String invalidLastname = faker.lorem().characters(1, 2);
//    static String invalidEmail = "invalidEmail.com";
//    String invalidTelephone = "123";
//    static String invalidPassword = "123";
//    String passwordConfirm = "456";
//
//    @Test(priority = 2, description = "Register with invalid data")
//    public void validateRegisterWithInvalidData(){
//        P01_HomePage homePage= new P01_HomePage(driver);
//        P02_RegisterPage registerPage = new P02_RegisterPage(driver);
//
//        homePage.ClickOnMyAccountBtn();
//        homePage.ClickOnRegisterBtn();
//
//        registerPage.EnterFirstName(invalidFirstname);
//        registerPage.EnterLastName(invalidLastname);
//        registerPage.EnterEmail(invalidEmail);
//        registerPage.EnterTelephone(invalidTelephone);
//        registerPage.EnterPassword(invalidPassword);
//        registerPage.EnterPasswordConfirm(passwordConfirm);
//        registerPage.SelectRandomRadioButton();
//        registerPage.AgreeBtn();
//        registerPage.ContinueBtn();
//
//    }
}

