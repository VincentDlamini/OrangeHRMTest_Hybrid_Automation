package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.Random;

public class BaseClass {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeTest
    @Parameters({"opSystem", "browser"})
    public void setup(String opSys, String browse){

        switch (browse){
            case "Chrome": driver = new ChromeDriver(); break;
            case "Edge": driver = new EdgeDriver(); break;
            default: System.out.println("Browser not supported."); return;
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    public String randomString(){
        String generatedString = RandomStringUtils.randomAlphabetic(7);
        return generatedString;
    }

    public String randomNumber(){
        String generatedNumber = RandomStringUtils.randomNumeric(10);
        return generatedNumber;
    }

    public String randomShortNum(){
        String randomShortNum = RandomStringUtils.randomNumeric(6);
        return randomShortNum;
    }

    public String randomAlphaNumeric(){
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        String generatedNumber = RandomStringUtils.randomNumeric(3);
        return (generatedString + "@" + generatedNumber);
    }

    public static String randomRelationship(){
        String[] relation = {"Mother", "Father", "Uncle", "Brother", "Wife", "Daughter", "Son", "Aunt"};
        Random random = new Random();
        return relation[random.nextInt(relation.length)];
    }
}
