package TESTNG_Revision;

import org.testng.annotations.Test;

public class TESTNG_02_loginTest {

    @Test(priority = 1, description = "This step is run first")
    public void loginTest(){
        System.out.println("login is successful");
    }

    @Test(priority = 2, description = "This step is run second")
    public void logout(){
        System.out.println("logout is successful");
    }
}
