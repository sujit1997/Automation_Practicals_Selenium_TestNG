//package TESTNG_Revision;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//public class TestNG_05_SoftAssert {
//
//    @Test
//    public void titlecase(){
//    SoftAssert softAssert = new SoftAssert();
//    String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More  eBay";
//    String expectedText = "Search";
//
//    WebDriverManager.chromedriver().setup();
//    WebDriver driver = new ChromeDriver();
//
//    driver.get("https://www.ebay.com/");
//    String actualtitle = driver.getTitle();
//        System.out.println("veryfying title");
//
//        softAssert.assertEquals(actualtitle,expectedTitle,"Title varification failed");
//
//        String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).getText();
//        System.out.println("verifying text");
//
//        softAssert.assertEquals(actualtext,expectedText,"Text verification pass");
//        System.out.println("closing the browser");
//        driver.quit();
//        softAssert.assertAll();
//
//
//
//
//}
//}