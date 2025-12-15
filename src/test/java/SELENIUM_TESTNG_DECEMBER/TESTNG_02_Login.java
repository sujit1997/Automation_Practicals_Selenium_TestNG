package SELENIUM_TESTNG_DECEMBER;

import org.testng.annotations.Test;


public class TESTNG_02_Login {

    @Test(priority = 1, description = "This is login Test")
    public void loginTest(){
        System.out.println("login is successful");
    }

    @Test(priority = 2, description = "This is logout test")
    public void logout(){
        System.out.println("logout is successful");
    }


}
