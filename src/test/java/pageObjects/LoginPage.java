package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement txtUsername;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement txtPassword;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btnLogin;
    //p[@class='oxd-text oxd-text--p oxd-alert-content-text']
    @FindBy(xpath = "//p[contains(@class,'oxd-alert-content-text')]")
    WebElement errorMessage;


    public void setTxtUsername(String username) throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(txtUsername));
        txtUsername.sendKeys(username);
    }

    public void setTxtPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void clickLoginBtn(){
        btnLogin.click();
    }

    //Add validation
    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
