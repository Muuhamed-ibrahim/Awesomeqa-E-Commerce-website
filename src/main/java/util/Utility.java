package util;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class Utility {

    static Faker faker = new Faker();
    protected static JavascriptExecutor jse ;

    public static int generateRandomIntForRadioButton() {
        Random random = new Random();
        int randomNumber = random.nextInt(2) + 11; // Generates a random number between 11 and 12
        return randomNumber;
    }
    public static String generateRandomFirstname(){
        String firstname = faker.name().firstName();
        return firstname;
    }
    public static String generateRandomLastname(){
        String lastname = faker.name().lastName();
        return lastname;
    }
    public static String generateRandomEmail(){
        String email = faker.internet().emailAddress();
        return email;
    }
    public static String generateRandomPhone(){
        String phone = faker.phoneNumber().phoneNumber();
        return phone;
    }
    public static String generateRandomPassword(){
        String password = faker.internet().password();
        return password;
    }
    public static String getRandomItem() {
        String[] items = {"laptop", "mobile", "components", "tables", "cameras"};
        Random random = new Random();
        int index = random.nextInt(items.length);
        return items[index];
    }

    public static int getRandomCurrencyIndex() {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        return randomNumber; // Random index between 1 and 3 (for 3 currencies in the list)
    }
    public static String generateRandomAddress(){
        String address = faker.address().fullAddress();
        return address;
    }
    public static String generateRandomCity(){
        String city = faker.address().country();
        return city;
    }
    public static String generatePostelCode(){
        String postelCode = faker.address().zipCode();
        return postelCode;
    }
    public static String RandomCategoryGenerator() {
        String[] categories = {"Desktops", "Components", "Laptops & Notebooks"};
        Random random = new Random();
        int randomIndex = random.nextInt(categories.length);
        return categories[randomIndex];
    }

}
