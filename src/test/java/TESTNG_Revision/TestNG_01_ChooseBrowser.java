package TESTNG_Revision;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_01_ChooseBrowser {
    public static String browser = "chrome";
    public static WebDriver driver;

    @BeforeTest
    public void selectBrowser(){
        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }

    @Test
    public void test(){
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }


}
