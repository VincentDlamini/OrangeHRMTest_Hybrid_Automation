package testCases;

import org.testng.annotations.Test;
import pageObjects.LogoffPage;
import testBase.BaseMethods;

public class TC_05_LogOffFunctionality extends BaseMethods {

    @Test (priority = 5)
    public void logoff(){
        LogoffPage off = new LogoffPage(driver);

        off.selectDropDown();
        off.selectLogOff();
    }
}
