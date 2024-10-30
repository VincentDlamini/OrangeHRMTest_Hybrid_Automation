package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoffPage extends BasePage{

    public LogoffPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    WebElement clickDropDown;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement clickLogOff;

    public void selectDropDown(){
        clickDropDown.click();
    }

    public void selectLogOff(){
        clickLogOff.click();
    }
}
