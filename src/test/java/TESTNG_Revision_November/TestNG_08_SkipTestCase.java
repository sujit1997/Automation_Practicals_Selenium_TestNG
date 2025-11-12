package TESTNG_Revision_November;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_08_SkipTestCase {

    @Test(enabled = false)
    public void test1(){
        System.out.println("This test is not skip if output get");
    }

    @Test()
    public void test2(){
        System.out.println("skipping this test forcefully");
        throw new SkipException("Skipping this test");
    }

    Boolean datasetup = true;
    @Test
    public void test3(){

        System.out.println("Skipping this test based on condition");
        if (datasetup = true){
            System.out.println("execute the test");
        }
        else {
            System.out.println("");
        }

    }
}
