package TESTNG_DECEMBER;

import org.testng.annotations.*;

public class TESTNG_03_Annotation {

    @BeforeTest
    public void loginToApplication(){
        System.out.println("login to application");
    }

    @AfterTest
    public void logoutToApplication(){
        System.out.println("logout to application");
    }

    @BeforeMethod
    public void connectToDB(){
        System.out.println("DB connected");
    }

    @AfterMethod
    public void disconnectDB(){
        System.out.println("DB disconnect");
    }

    @Test(priority = 1, description = "This is login Test")
    public void loginTest(){
        System.out.println("Test1");
    }

    @Test(priority = 2, description = "This is logout test")
    public void logout(){
        System.out.println("Test2");
    }
}
