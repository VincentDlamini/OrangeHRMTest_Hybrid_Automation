package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ForgotPasswordPage extends BasePage{

    public ForgotPasswordPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotPasswordLink;

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement usernameInput;

    @FindBy(xpath = "//button[normalize-space()='Reset Password']")
    WebElement resetPasswordButton;

    @FindBy(xpath = "//h6[normalize-space()='Reset Password link sent successfully']")
    WebElement resetSuccessMessage;

    public void clickForgotPassword() {
        wait.until(ExpectedConditions.visibilityOf(forgotPasswordLink)).click();
    }

    public void enterUsername(String userName) {
        wait.until(ExpectedConditions.visibilityOf(usernameInput)).sendKeys(userName);
    }

    public void clickResetPassword() {
        wait.until(ExpectedConditions.visibilityOf(resetPasswordButton)).click();
    }

    public boolean isResetPasswordSuccessful() {
        String successMessage = wait.until(ExpectedConditions.visibilityOf(resetSuccessMessage)).getText();
        return successMessage.equals("Reset Password link sent successfully");
    }
}
