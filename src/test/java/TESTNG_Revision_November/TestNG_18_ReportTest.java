package TESTNG_Revision_November;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_18_ReportTest {
    @Test
    public void reportTest1(){
        System.out.println("This is test1");
    }
    @Test
    public void reportTest2(){

        Reporter.log("This is test2" );// for every test output we can add this line in Listeners class
        //Reporter.log("Status of execution is - " +result.getStatus());
        System.out.println("This is test2");
    }

    @Test
    public void reportTest3(){
        System.out.println("This is test3");
    }

    @Test
    public void reportTest4(){
       System.out.println("This is test4");
       }
}