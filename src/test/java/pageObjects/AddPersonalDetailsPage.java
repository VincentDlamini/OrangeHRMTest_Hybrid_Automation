package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AddPersonalDetailsPage extends BasePage {

    public AddPersonalDetailsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "(//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement txtOtherID;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
    WebElement txtDLicense;
    @FindBy(xpath = "(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")
    WebElement dateInput;
    @FindBy(xpath = "//li[@class='oxd-calendar-selector-month']//p")
    WebElement selectMth;
    @FindBy(xpath = "//div[@class='oxd-calendar-selector-year-selected']//p")
    WebElement selectYear;
    @FindBy(xpath = "//i[@class='oxd-icon bi-chevron-right']")
    WebElement fowardDateSearchButton;
    @FindBy(xpath = "//div[@class='oxd-calendar-date']")
    java.util.List<WebElement> allDates;
    //    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
//    WebElement ;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i")
    WebElement nationalityDropdownIcon;
    @FindBy(xpath = "//div[@role='listbox']//span")
    List<WebElement> nationalityOptions;
    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
    WebElement maritalStatusDropdownIcon;
    @FindBy(xpath = "//div[@role='listbox']//span")
    List<WebElement> maritalStatusOptions;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/i")
    WebElement dobDropdownIcon;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li[1]/div/p")
    WebElement dobMonth;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li[2]/div/p")
    WebElement dobYear;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/button[1]/i")
    WebElement backButton;
    @FindBy(xpath = "//div[@class='oxd-calendar-date']")
    List<WebElement> dobDates;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span")
    WebElement genderRadioButton;
    @FindBy(xpath = "//div[@class='orangehrm-custom-fields']//div[@class='orangehrm-card-container']//form[@class='oxd-form']//div[@class='oxd-form-row']//div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    WebElement bloodTypeDropdownIcon;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div")
    List<WebElement> bloodTypeOptions;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")
    WebElement saveButton;

    public void setTxtOtherID(String idInput){
        wait.until(ExpectedConditions.visibilityOf(txtOtherID));
        txtOtherID.sendKeys(idInput);
    }

    public void setTxtDLicense(String license){
        txtDLicense.sendKeys();
    }

    public void clickDate() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(dateInput));
        dateInput.click();
    }

    // Method to select the month and year
    public void selectMonthAndYear(String month, String year) {
        while (true) {
            String mnth = selectMth.getText();
            String yr = selectYear.getText();

            if (mnth.equals(month) && yr.equals(year)) {
                break;
            }

            fowardDateSearchButton.click(); // Click to move to the next month
        }
    }

    // Method to select the desired date
    public void selectDate(String day) {
        for (WebElement date : allDates) {
            if (date.getText().equals(day)) {
                date.click();
                break;
            }
        }
    }

    public void selectNationality(String nationality) {
        nationalityDropdownIcon.click();
        for (WebElement option : nationalityOptions) {
            if (option.getText().equals(nationality)) {
                option.click();
                break;
            }
        }
    }

    public void selectMaritalStatus(String status) {
        maritalStatusDropdownIcon.click();
        for (WebElement option : maritalStatusOptions) {
            if (option.getText().equals(status)) {
                option.click();
                break;
            }
        }
    }

    public void selectDateOfBirth(String month, String year, String day) {
        dobDropdownIcon.click();
        while (true) {
            if (dobMonth.getText().equals(month) && dobYear.getText().equals(year)) {
                break;
            }
            backButton.click();
        }
        for (WebElement date : dobDates) {
            if (date.getText().equals(day)) {
                date.click();
                break;
            }
        }
    }

    public void selectGender() {
        genderRadioButton.click();
    }

    public void selectBloodType(String bloodType) {
        bloodTypeDropdownIcon.click();
        for (WebElement type : bloodTypeOptions) {
            if (type.getText().equals(bloodType)) {
                type.click();
                break;
            }
        }
    }

    public void saveDetails() {
        saveButton.click();
    }

}
