package TESTNG_Revision_November;

import org.testng.annotations.*;


public class TestNG_09_BeforeGroups {

    @BeforeClass
    public void beforeclass(){
        System.out.println("Run this before class");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("Run this after class");
    }
    @BeforeGroups(value = "functional")
    public void testex(){
        System.out.println("before functional group");
    }
    @AfterGroups(value = "functional")
    public void testex2(){
        System.out.println("After functional group");
    }
    @Test(groups = {"functional"})
    public void test1(){
        System.out.println("This is group 1");
    }
    @Test(groups = "regression")
    public void test2(){
        System.out.println("This is also group 1");
    }
    @Test(groups = "functional")
    public void test3(){
        System.out.println("This is group 2");
    }
    @Test(groups = "regression")
    public void test4(){
        System.out.println("This is also group 2");
    }
}
