package TESTNG_Revision_November;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class TestNG_10_BeforeSuite extends TestNG_10_BeforeSuiteChild {
    @BeforeSuite
    public void datasetup(){                    //We can also create suite by xml file
        System.out.println("common data setup");
    }
    @AfterSuite
    public void teardown(){
        System.out.println("tear down data");
    }
    @Test(groups = "functional")
    public void test1(){
        System.out.println("THis is test 1");
    }
    @Test(groups = "functional")
    public void test2(){
        System.out.println("THis is test 2");
    }
    @Test(groups = "regresion")
    public void test3(){
        System.out.println("THis is test 3");
    }
    @Test(groups = "regression")
    public void test4(){
        System.out.println("THis is test 4");
    }
    @Test
    public void test5(){
        System.out.println("THis is test 5");
    }
}


