package Interview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {

            public static String browser = "chrome";
            public static WebDriver driver;

    @BeforeMethod
    public void setup() {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://emilo-task.vercel.app/login");
    }
        @Test(priority = 2)
                public void loginTest() throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/input[1]")).sendKeys("sujitmanmode1997@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/input[2]")).sendKeys("Sujit1@1");
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/button")).click();
            Thread.sleep(5000);
        }
        @Test(priority = 1)
                public void signupTest() {
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/input[1]")).sendKeys("Sujit Manmode");
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/input[2]")).sendKeys("sujitmanmode1997@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/input[2]")).sendKeys("Sujit1@1");
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/input[4]")).sendKeys("Sujit1@1");
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/button")).click();
        }
        @AfterMethod
    public void teardown(){
        if(driver!= null){
            driver.quit();
        }
    }


}