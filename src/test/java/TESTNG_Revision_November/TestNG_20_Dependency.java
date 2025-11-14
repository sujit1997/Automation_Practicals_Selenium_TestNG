//package TESTNG_Revision_November;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class TestNG_20_Dependency {
//    @Test
//    public void userRegistration(){
//        System.out.println("This is test1");
//        Assert.assertTrue(false);
//    }
//
//    @Test(dependsOnMethods = "userRegistration") // Hard dependency
//    public void userSearch(){
//        System.out.println("This is test2");
//    }
//
//    @Test
//    public void url(){
//        System.out.println("This is test3");
//        Assert.assertTrue(false);
//    }
//    @Test(dependsOnMethods = "url",alwaysRun = true) //soft dependency this test run even dependet mmethod is fail
//    public void urldependent(){
//        System.out.println("this is test 4");
//    }
//}
