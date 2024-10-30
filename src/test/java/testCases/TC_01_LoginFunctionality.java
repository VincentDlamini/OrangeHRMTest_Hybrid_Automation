package testCases;

import org.testng.annotations.Test;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_01_LoginFunctionality extends BaseClass {

    @Test(priority = 1)
    public void login() throws InterruptedException {
        LoginPage loggon = new LoginPage(driver);

        Thread.sleep(2000);
        loggon.setTxtUsername(randomString().toUpperCase());
        loggon.setTxtPassword(randomString().toUpperCase());
        loggon.clickLoginBtn();

        driver.navigate().refresh();

        loggon.setTxtUsername("Admin");
        loggon.setTxtPassword("admin");
        loggon.clickLoginBtn();
    }
}
