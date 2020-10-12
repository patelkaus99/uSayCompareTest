package UsayCompare.Pages;

import UsayCompare.Base.Utils;
import org.openqa.selenium.By;

public class HomePage extends Utils {

    //Page elements
    private By _signInBtn = By.cssSelector("div.header_user_info");
    private By _firstProduct = By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]");

    //Click on the Sing in button on the home page
    public void clickOnSingInBtn(){
        clickOnElement(_signInBtn);
    }

    //Click on the first product on the home page
    public void clickOnTheFirstProductOnHomePage(){
        clickOnElement(_firstProduct);
    }
}
