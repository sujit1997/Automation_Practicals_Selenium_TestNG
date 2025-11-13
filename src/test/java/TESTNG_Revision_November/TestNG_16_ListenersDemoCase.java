package TESTNG_Revision_November;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_16_ListenersDemoCase extends TestNG_16_BaseTest {

    @Test
    public void launchApp(){
        driver.get("https://www.ebay.com/");
        //Assert.assertTrue(false); // for capture screenshot we failing this test case by Assert
    }
}
