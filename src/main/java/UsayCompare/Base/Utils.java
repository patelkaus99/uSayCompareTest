package UsayCompare.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    //Reusable method for to click on web element.
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //Reusable method for send keys
    public static void typeText(By by, String textValue) {
        driver.findElement(by).sendKeys(textValue);
    }

    //Reusable method for get text
    public static String getText(By by) {
        return driver.findElement(by).getText();
    }

    //Reusable method for DateStamp
    public static String timeStamp() {
        DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
        //get current date time with Date()
        Date date = new Date();
        // Now format the date
        return dateFormat.format(date);
    }

    //Reusable method for Select
    public static void selectValueFromDropDown(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }

}
