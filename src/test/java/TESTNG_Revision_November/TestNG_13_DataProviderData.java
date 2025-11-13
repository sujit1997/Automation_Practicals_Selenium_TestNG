package TESTNG_Revision_November;

import org.testng.annotations.DataProvider;

public class TestNG_13_DataProviderData {       // We can save multiple dataproviderr dataset in single file
     @DataProvider(name="create")
    public Object[][] dataset(){
        return new Object[][]
                {
                        {"standard_user","secret_sauce"},
                        {"locked_out_user","secret_sauce"},
                        {"problem_user", "secret_sauce"},
                        {"performance_glitch_user","secret_sauce"},
                        {"error_user","secret_sauce"},
                        {"visual_user","secret_sauce"}
                };
    }
}
