package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class BaseMethods {

    public WebDriver driver;
    public WebDriverWait wait;

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
