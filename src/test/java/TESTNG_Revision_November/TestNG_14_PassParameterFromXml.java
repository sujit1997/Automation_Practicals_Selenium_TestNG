//package TESTNG_Revision_November;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//public class TestNG_14_PassParameterFromXml {
//
//    //public static String browser = "chrome"; // we get browser by csv or XML file
//    public static WebDriver driver;
//
//    @Parameters({"browser"})
//    @Test
//    public void launchApplication(String browser){
//        if(browser.equalsIgnoreCase("chrome")){
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            WebDriverManager.firefoxdriver().setup();
//            driver = new FirefoxDriver();
//        }
//        driver.get("https://www.saucedemo.com/");
//    }
//
//
//
//}
