package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddEmergencyContactsPage extends BasePage{

    public AddEmergencyContactsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//a[normalize-space()='Emergency Contacts']")
    WebElement emergencyContactsLink;
    @FindBy(xpath = "//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/div[@class='orangehrm-action-header']/button[1]")
    WebElement addContactButton;
    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[1]//div[1]//div[2]//input[1]")
    WebElement contactNameInput;
    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[2]//div[1]//div[2]//input[1]")
    WebElement relationshipInput;
    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-content']//div[2]//div[1]//div[1]//div[1]//div[2]//input[1]")
    WebElement homePhoneInput;
    @FindBy(xpath = "//div[@class='orangehrm-edit-employee-content']//div[2]//div[1]//div[2]//div[1]//div[2]//input[1]")
    WebElement mobilePhoneInput;
    @FindBy(xpath = "//div[3]//div[1]//div[2]//input[1]")
    WebElement workPhoneInput;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButton;

    public void scrollToTop() {
        JavascriptExecutor js = null;
        js.executeScript("window.scrollTo(0, 0);");
    }

    public void openEmergencyContacts() {
        wait.until(ExpectedConditions.visibilityOf(emergencyContactsLink)).click();
    }

    public void clickAddContact() {
        wait.until(ExpectedConditions.visibilityOf(addContactButton)).click();
    }

    public void fillContactDetails(String name, String relationship, String phoneNumber) {
        contactNameInput.sendKeys(name);
        relationshipInput.sendKeys(relationship);
        homePhoneInput.sendKeys(phoneNumber);
        mobilePhoneInput.sendKeys(phoneNumber);
        workPhoneInput.sendKeys(phoneNumber);
    }

    public void saveContact() {
        saveButton.click();
    }
}
