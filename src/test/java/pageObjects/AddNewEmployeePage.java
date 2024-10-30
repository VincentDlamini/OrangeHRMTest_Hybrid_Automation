package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddNewEmployeePage extends BasePage{

    public AddNewEmployeePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")
    WebElement pmi;
    @FindBy(xpath = "//a[normalize-space()='Add Employee']")
    WebElement addEmp;

    @FindBy(xpath = "//i[@class='oxd-icon bi-plus']")
    WebElement uploadIcon;
    @FindBy(xpath = "//input[@type='file']")
    WebElement fileInput;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement txtFirstName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement txtLastName;
    @FindBy(xpath = "//div[contains(@class, 'oxd-input-group')]//input[contains(@class, 'oxd-input--active')]")
    WebElement clearTxt;
    @FindBy(xpath = "//div[contains(@class, 'oxd-input-group')]//input[contains(@class, 'oxd-input--active')]")
    WebElement empID;
    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    WebElement slidBtn;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    WebElement newUserName;
    @FindBy(xpath = "//label[normalize-space()='Enabled']")
    WebElement enableBtn;
    @FindBy(xpath = "(//input[@type='password'])[1]") WebElement newPassword1;
    @FindBy(xpath = "(//input[@type='password'])[2]") WebElement newPassword2;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveBtn;

    public void clickPMI() throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(pmi));
        pmi.click();
    }

    public void clickAddEmp(){
        wait.until(ExpectedConditions.visibilityOf(addEmp));
        addEmp.click();
    }

    public void uploadFile(String filePath) {
        try {
            Thread.sleep(5000); // Replace with proper wait, if possible
            wait.until(ExpectedConditions.visibilityOf(uploadIcon));
            uploadIcon.click();

            wait.until(ExpectedConditions.visibilityOf(fileInput));
            fileInput.sendKeys(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Image not loaded.");
        }
    }

    public void setTxtFirstName(String firstName){
        txtFirstName.sendKeys(firstName);
    }

    public void setTxtLastName(String lastName){
        txtLastName.sendKeys(lastName);
    }

    public void clearFields(){
        clearTxt.clear();
    }

    public void setTextEmpID(String employeeID){
        empID.sendKeys(employeeID);
    }

    public void clickSlideBtn(){
        slidBtn.clear();
    }

    public void setTextNewUserName(String newUser){
        newUserName.sendKeys(newUser);
    }

    public void clickEnableBtn(){
        enableBtn.click();
    }

    public void setTextNewPassword(String newPswd){
        newPassword1.sendKeys(newPswd);
        newPassword2.sendKeys(newPswd);
    }

    public void clickSaveBtn(){
        saveBtn.click();
    }
}
