package UsayCompare.Pages;

import UsayCompare.Base.Utils;
import org.openqa.selenium.By;

public class MyAccountPage extends Utils {
    //Page elements
    private By _welcomeMessage = By.cssSelector(".info-account");
    private By _logOutBtn = By.className("logout");
    private By _accountName = By.className("account");

    //Welcome message on the my account page
    public String getWelcomeMsgText(){
        return getText(_welcomeMessage);
    }

    //Click on the logout button on the my account page
    public void clickOnSignOutBtn(){
        clickOnElement(_logOutBtn);
    }

    //Account name
    public String getAccountNameText(){
        return getText(_accountName);
    }

}
