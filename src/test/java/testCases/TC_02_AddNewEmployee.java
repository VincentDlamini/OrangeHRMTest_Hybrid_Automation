package testCases;

import org.testng.annotations.Test;
import pageObjects.AddNewEmployeePage;
import testBase.BaseMethods;

public class TC_02_AddNewEmployee extends BaseMethods {

    @Test(priority = 2)
    public void AddNewEmployee() throws InterruptedException {
        AddNewEmployeePage newEmp = new AddNewEmployeePage(driver);

        Thread.sleep(2000);
        newEmp.clickPMI();
        newEmp.clickAddEmp();

        newEmp.uploadFile("C:\\Users\\Lebo\\YPGJAVALessons\\YPGAutomation\\src\\test\\resources\\Avatar.png");
        newEmp.setTxtFirstName(randomString().toUpperCase());
        newEmp.setTxtLastName(randomString().toUpperCase());
        newEmp.clearFields();

        newEmp.setTextEmpID(randomShortNum());
        newEmp.clickEnableBtn();

        newEmp.setTextNewPassword(randomAlphaNumeric());
        newEmp.clickSaveBtn();
    }
}
