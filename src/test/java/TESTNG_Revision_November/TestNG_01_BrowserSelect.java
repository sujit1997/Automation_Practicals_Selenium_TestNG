package TESTNG_Revision_November;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_01_BrowserSelect {
    public static String browser = "chrome";
    public static WebDriver driver;

    @BeforeTest
    public void selectbrowser() {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
    }
    @Test
    public void test(){
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println("Page Title is: " +driver.getTitle());
    }
    @AfterTest
    public void tearDownTest(){
        driver.quit();
    }
}
