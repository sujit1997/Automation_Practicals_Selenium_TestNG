package TESTNG_Revision_November;

import org.apache.commons.math3.linear.IllConditionedOperatorException;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestNG_16_Listeners extends TestNG_16_ListenersUtils implements ITestListener {
    public void onTestStart(ITestResult result){
        System.out.println("test case is start");
    }
    public void onTestSuccess(ITestResult result){
        System.out.println("test case is success");
    }
    public void onTestFailure(ITestResult result){
        System.out.println("test case is fail");
        System.out.println("Screenshort capture");
        try {
            getScreenShot();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void onTestSkipped(ITestResult result){
        System.out.println("test case is skip");
    }
}
