package testCases;

import org.testng.annotations.Test;
import pageObjects.AddPersonalDetailsPage;
import testBase.BaseMethods;

public class TC_03_AddPersonalDetails extends BaseMethods {

    @Test(priority = 3)
    public void AddPersonalDetails() throws InterruptedException {
        AddPersonalDetailsPage personal = new AddPersonalDetailsPage(driver);

        personal.setTxtOtherID(randomShortNum());
        personal.setTxtDLicense(randomNumber());

        //Calendar section
        Thread.sleep(2000);
        personal.clickDate();

        // Select month and year
        String month = "July";
        String year = "2030";
        personal.selectMonthAndYear(month, year);

        // Select a specific date
        String day = "31";
        personal.selectDate(day);

        personal.selectNationality("Brazilian");
        personal.selectMaritalStatus("Married");
        personal.selectDateOfBirth("August", "2018", "15");
        personal.selectGender();
        personal.selectBloodType("B-");
        personal.saveDetails();
    }
}
