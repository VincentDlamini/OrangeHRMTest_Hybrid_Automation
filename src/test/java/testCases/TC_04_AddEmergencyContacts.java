package testCases;

import org.testng.annotations.Test;
import pageObjects.AddEmergencyContactsPage;
import testBase.BaseMethods;

public class TC_04_AddEmergencyContacts extends BaseMethods {

    @Test (priority = 4)
    public void AddEmergencyContacts() throws InterruptedException {
        AddEmergencyContactsPage emContact = new AddEmergencyContactsPage(driver);

        Thread.sleep(2000); // Consider replacing with proper wait if needed
        emContact.scrollToTop();
        emContact.openEmergencyContacts();
        emContact.clickAddContact();
        emContact.fillContactDetails(randomString() + randomString(), randomRelationship(), randomNumber());
        emContact.saveContact();
    }
}
