package TESTNG_Revision_November;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestNG_04_Assertion {
    public static String browser = "chrome";
    public static WebDriver driver;
    public void titletest(){
        browser.equalsIgnoreCase("chrome");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();


    }
}
