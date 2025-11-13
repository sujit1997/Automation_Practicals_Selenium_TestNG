package TESTNG_Revision_November;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static TESTNG_Revision_November.TestNG_16_BaseTest.driver;

public class TestNG_16_ListenersUtils extends TestNG_16_BaseTest {

    public void getScreenShot() throws IOException{
        Date currentdate = new Date();
        String screenshotfilename = currentdate.toString().replace("","").replace(":","_");
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//" +screenshotfilename+".png"));
    }
}
