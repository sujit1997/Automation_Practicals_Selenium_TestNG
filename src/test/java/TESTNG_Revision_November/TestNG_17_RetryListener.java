//package TESTNG_Revision_November;
//
//import org.testng.IAnnotationTransformer;
//import org.testng.annotations.IAnnotation;
//import org.testng.annotations.ITestAnnotation;
//import org.testng.IRetryAnalyzer;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Method;
//
//public class TestNG_17_RetryListener implements IAnnotationTransformer {
//    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
//    {
//        annotation.setRetryAnalyzer(TestNG_17_executeFailTestCase.class);
//    }
//}
