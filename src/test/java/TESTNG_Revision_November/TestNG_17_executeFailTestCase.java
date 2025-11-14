//package TESTNG_Revision_November;
//
//import org.testng.IRetryAnalyzer;
//import org.testng.ITestResult;
//
//public class TestNG_17_executeFailTestCase implements IRetryAnalyzer {
//
//    private int retryCount = 0;
//    private static final int maxRetryCount = 4;
//
//    public boolean retry(ITestResult result){
//    if (retryCount<maxRetryCount){
//        retryCount++;
//        return true;
//    }
//    return false;
//    }
//
//}
