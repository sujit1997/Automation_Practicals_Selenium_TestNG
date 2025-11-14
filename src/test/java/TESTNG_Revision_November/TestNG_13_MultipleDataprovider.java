//package TESTNG_Revision_November;
//
//import org.testng.annotations.DataProvider;
//
//import java.lang.reflect.Method;
//
//public class TestNG_13_MultipleDataprovider {
//
//    @DataProvider(name = "create")
//    public Object[][] dataset1(Method M) {
//        Object[][] testdata = null;
//
//        if (M.getName().equals("test")) {
//            testdata = new Object[][] {
//                    {"standard_user", "secret_sauce"},
//                    {"locked_out_user", "secret_sauce"}
//        };
//    }
//        else if (M.getName().equals("test1")){
//         testdata = new Object[][]{
//                        {"username", "password", "Third"},
//                        {"username", "password", "Fourth"}
//                    };
//    }
//            return testdata;
//        }
//    }