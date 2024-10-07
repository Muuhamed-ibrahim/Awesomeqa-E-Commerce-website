package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBase {
    static WebDriver driver;

    @BeforeTest
    public void SetWebDriver(){
        driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/ui");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @AfterTest
    public void TearDown(){
        driver.quit();
    }
}
