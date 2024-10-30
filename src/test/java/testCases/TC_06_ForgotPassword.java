package testCases;

import org.testng.annotations.Test;
import pageObjects.ForgotPasswordPage;
import testBase.BaseMethods;

public class TC_06_ForgotPassword extends BaseMethods {

    @Test (priority = 6)
    public void forgotPswd(){

        ForgotPasswordPage forgot = new ForgotPasswordPage(driver);

        forgot.clickForgotPassword();
        forgot.enterUsername(randomAlphaNumeric());
        forgot.clickResetPassword();

        if (forgot.isResetPasswordSuccessful()) {
            System.out.println("Password reset link sent on email.");
        } else {
            System.out.println("Failed to send password reset link.");
        }
    }
}
