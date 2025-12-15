package TESTNG_DECEMBER;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TESTNG_05_SoftAssert {

    public static String browser = "chrome";
    public static WebDriver driver;

        @Test
        public void softasserttest(){
            SoftAssert softAssert = new SoftAssert();

            browser.equalsIgnoreCase("chrome");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.ebay.com/");

            String actualTitle = driver.getTitle();
            String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
            softAssert.assertEquals(actualTitle,expectedTitle,"title verification fail");
            String actualText = driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]")).getText();
            String expectedText = "Search";
            softAssert.assertEquals(actualText,expectedText,"text verification fail");

            driver.close();
            softAssert.assertAll();
        }
}
