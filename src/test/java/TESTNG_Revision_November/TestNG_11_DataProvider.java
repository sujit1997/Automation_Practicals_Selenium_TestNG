//package TESTNG_Revision_November;
//
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class TestNG_11_DataProvider {
//
//    @Test(dataProvider = "dataset")
//    public void test(String username, String password){
//        System.out.println(username+"==="+password);
//    }
//
//    @DataProvider
//    public Object[][] dataset(){
//        Object[][] dataset = new Object[4][2];
//
//        dataset[0][0]="user1";
//        dataset[0][1]="pass1";
//
//        dataset[1][0]="user2";
//        dataset[1][1]="pass2";
//
//        dataset[2][0]="user3";
//        dataset[2][1]="user3";
//
//        dataset[3][0]="user4";
//        dataset[3][1]="pass4";
//
//        return dataset;
//    }
//
//    //Second way to provide data
//    @Test(dataProvider = "dataset1")//you can also write dataprovider name to access data
//    public void test1(String username, String password, String test){
//        System.out.println(username+"==="+password+"==="+test);
//    }
//
//    @DataProvider//(name="create")
//    public Object[][] dataset1(){
//        return new Object[][]
//                {
//                        {"username","password","test"},
//                        {"username1","password1","test1"}
//                };
//    }
//
//
//}
