package TESTNG_Revision_November;

import org.testng.annotations.Test;

public class TestNG_08_SkipTestCase {

    @Test(enabled = false)
    public void test1(){
        System.out.println("This test is not skip if output get");
    }
}
