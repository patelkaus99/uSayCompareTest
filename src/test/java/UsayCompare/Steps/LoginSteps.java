package UsayCompare.Steps;

import UsayCompare.Base.LoadProp;
import UsayCompare.Pages.AccountCreationPage;
import UsayCompare.Pages.AuthenticationPage;
import UsayCompare.Pages.HomePage;
import UsayCompare.Pages.MyAccountPage;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage = new HomePage();
    private AuthenticationPage authenticationPage = new AuthenticationPage();
    private AccountCreationPage accountCreationPage = new AccountCreationPage();
    private MyAccountPage myAccountPage = new MyAccountPage();

    @Given("^user is already registered$")
    public void userIsAlreadyRegistered() {
        homePage.clickOnSingInBtn();
        authenticationPage.enterEmailAddressForRegistration();
        authenticationPage.clickOnCreateAnAccountBtn();
        accountCreationPage.inputFirstName();
        accountCreationPage.inputLastName();
        accountCreationPage.inputPassword();
        accountCreationPage.inputAddress1();
        accountCreationPage.inputCity();
        accountCreationPage.selectState();
        accountCreationPage.inputZipCode();
        accountCreationPage.inputMobilePhone();
        accountCreationPage.clickOnRegisterBtn();
        myAccountPage.clickOnSignOutBtn();
    }

    @And("^user enter an email and password$")
    public void userEnterAnEmailAndPassword() {
        authenticationPage.enterEmailAddressForSignIn();
        authenticationPage.enterPasswordForSignIn();

    }

    @And("^user click on the Sing In button on authentication page$")
    public void userClickOnTheSingInButtonOnAuthenticationPage() {
        authenticationPage.clickOnSignInBtn();
    }

    @Then("^user should login successfully with welcome message \"([^\"]*)\"$")
    public void userShouldLoginSuccessfullyWithWelcomeMessage(String welcomeMessage) {
        Assert.assertTrue(myAccountPage.getWelcomeMsgText().contains(welcomeMessage));
        Assert.assertEquals("Invalid user name",
                new LoadProp().getProperty("firstName")+" "+new LoadProp().getProperty("lastName"),
                myAccountPage.getAccountNameText());
    }
}
