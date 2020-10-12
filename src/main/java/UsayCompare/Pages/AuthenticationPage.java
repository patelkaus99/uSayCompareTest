package UsayCompare.Pages;

import UsayCompare.Base.LoadProp;
import UsayCompare.Base.Utils;
import org.openqa.selenium.By;

public class AuthenticationPage extends Utils {

    LoadProp loadProp = new LoadProp();

    //page elements
    private By _emailAddressField = By.id("email_create");
    private By _createAnAccountBtn = By.id("SubmitCreate");
    private By _emailAddressError = By.xpath("//div[@id='create_account_error']/ol/li");
    private By _emailAddressFieldSingIn = By.id("email");
    private By _passwordFieldSignIn = By.id("passwd");
    private By _signInBtn = By.id("SubmitLogin");

    //String variable for email address to store the email address to use for login
    public static String emailAddress;

    //Entering an email address on authentication page for to create an account
    public void enterEmailAddressForRegistration() {
        emailAddress = loadProp.getProperty("email") + timeStamp() + "@gmail.com";
        typeText(_emailAddressField, emailAddress);
    }

    //Click on Create an account button on the authentication page
    public void clickOnCreateAnAccountBtn() {
        clickOnElement(_createAnAccountBtn);
    }

    //Input email address for Sing in
    public void enterEmailAddressForSignIn() {
        typeText(_emailAddressFieldSingIn, emailAddress);
    }

    //Input Password for Sign in
    public void enterPasswordForSignIn() {
        typeText(_passwordFieldSignIn, loadProp.getProperty("password"));
    }

    //Click on Sin in button on authentication page
    public void clickOnSignInBtn() {
        clickOnElement(_signInBtn);

    }

    //Get email address error text
    public String getTextEmailAddressError() {
        return getText(_emailAddressError);
    }
}
