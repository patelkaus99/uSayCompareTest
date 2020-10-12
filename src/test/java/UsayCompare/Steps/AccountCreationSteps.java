package UsayCompare.Steps;

import UsayCompare.Pages.AccountCreationPage;
import UsayCompare.Pages.AuthenticationPage;
import UsayCompare.Pages.HomePage;
import UsayCompare.Pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AccountCreationSteps {

    private HomePage homePage = new HomePage();
    private AuthenticationPage authenticationPage = new AuthenticationPage();
    private AccountCreationPage accountCreationPage = new AccountCreationPage();
    private MyAccountPage myAccountPage = new MyAccountPage();

    @When("^user click on the Sign in button on the home page$")
    public void user_click_on_the_Sign_in_button_on_the_home_page() {
        homePage.clickOnSingInBtn();

    }

    @And("^user enter an email address in email address field$")
    public void user_enter_an_email_address_in_email_address_field() {
        authenticationPage.enterEmailAddressForRegistration();
    }

    @And("^user click on the create an account button$")
    public void user_click_on_the_create_an_account_button() {
        authenticationPage.clickOnCreateAnAccountBtn();
    }

    @Then("^user navigate to create an account page$")
    public void user_navigate_to_create_an_account_page() {
        Assert.assertEquals("User is not on account creation page",
                "YOUR PERSONAL INFORMATION", accountCreationPage.getYourPersonalInformationText());
    }

    @And("^user enter all mandatory field data$")
    public void user_enter_all_mandatory_field_data() {
        accountCreationPage.inputFirstName();
        accountCreationPage.inputLastName();
        accountCreationPage.inputPassword();
        accountCreationPage.inputAddress1();
        accountCreationPage.inputCity();
        accountCreationPage.selectState();
        accountCreationPage.inputZipCode();
        accountCreationPage.inputMobilePhone();

    }

    @And("^user click on the register button$")
    public void user_click_on_the_register_button() {
        accountCreationPage.clickOnRegisterBtn();
     }

    @Then("^user should registered successfully with welcome message \"([^\"]*)\"$")
    public void user_should_registered_successfully_with_welcome_message(String welcomeMessage) {
        Assert.assertTrue(myAccountPage.getWelcomeMsgText().contains(welcomeMessage));
    }

    @Then("^user should see an error for email address mandatory field \"([^\"]*)\"$")
    public void userShouldSeeAnErrorForEmailAddressMandatoryField(String emailAddressErrorMsg) {
        Assert.assertTrue(authenticationPage.getTextEmailAddressError().contains(emailAddressErrorMsg));
    }

    @Then("^user should see mandatory fields errors for first name \"([^\"]*)\"$")
    public void userShouldSeeMandatoryFieldsErrorsForFirstName(String firstNameError) {
        Assert.assertTrue(accountCreationPage.getTextFirstNameError().contains(firstNameError));
    }

    @And("^user should see mandatory fields errors for last name \"([^\"]*)\"$")
    public void userShouldSeeMandatoryFieldsErrorsForLastName(String lastNameError) {
        Assert.assertTrue(accountCreationPage.getTextLastNameError().contains(lastNameError));
    }

    @And("^user should see mandatory fields errors for password \"([^\"]*)\"$")
    public void userShouldSeeMandatoryFieldsErrorsForPassword(String passwordError) {
        Assert.assertTrue(accountCreationPage.getTextPasswordError().contains(passwordError));
    }

    @And("^user should see mandatory fields errors for address \"([^\"]*)\"$")
    public void userShouldSeeMandatoryFieldsErrorsForAddress(String AddressError) {
        Assert.assertTrue(accountCreationPage.getTextAddress1Error().contains(AddressError));
    }

    @And("^user should see mandatory fields errors for city \"([^\"]*)\"$")
    public void userShouldSeeMandatoryFieldsErrorsForCity(String cityError) {
        Assert.assertTrue(accountCreationPage.getTextCityError().contains(cityError));
    }

    @And("^user should see mandatory fields errors for state \"([^\"]*)\"$")
    public void userShouldSeeMandatoryFieldsErrorsForState(String stateError) {
        Assert.assertTrue(accountCreationPage.getTextStateError().contains(stateError));
    }

    @And("^user should see mandatory fields errors for zip code \"([^\"]*)\"$")
    public void userShouldSeeMandatoryFieldsErrorsForZipCode(String zipCodeError) {
        Assert.assertTrue(accountCreationPage.getTextZipCodeError().contains(zipCodeError));
    }

    @And("^user should see mandatory fields errors for mobile phone \"([^\"]*)\"$")
    public void userShouldSeeMandatoryFieldsErrorsForMobilePhone(String mobilePhoneError) {
        Assert.assertTrue(accountCreationPage.getTextMobilePhoneError().contains(mobilePhoneError));
    }
}
