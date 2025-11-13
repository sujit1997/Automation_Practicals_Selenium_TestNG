package TESTNG_Revision_November;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_15_ListenersTestCase {
    @Test
    public void test1(){
        System.out.println("this is test 1");
    }
    @Test
    public void test2(){
        System.out.println("This is test 2");
        //Assert.assertTrue(false); //--> for showing screenshort capture
    }
}
