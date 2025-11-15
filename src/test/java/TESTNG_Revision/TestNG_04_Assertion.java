//package TESTNG_Revision;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//
//public class TestNG_04_Assertion {
//
//    @Test
//    public void titlecase(){
//        WebDriverManager.chromedriver().setup();
//        ChromeDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//        driver.get("https://www.ebay.com/");
//
//        String actualtitle = driver.getTitle();
//        String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
//
//        driver.quit();
//
//        Assert.assertEquals(actualtitle,expectedtitle);
//    }
//
//}
