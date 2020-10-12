package UsayCompare.Pages;

import UsayCompare.Base.LoadProp;
import UsayCompare.Base.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreationPage extends Utils {

    private LoadProp loadProp = new LoadProp();

    //Page elements
    private By _yourPersonalInfoText = By.xpath("//form[@id='account-creation_form']/div[1]/h3");
    private By _firstName = By.id("customer_firstname");
    private By _lastName = By.id("customer_lastname");
    private By _password = By.id("passwd");
    private By _address1 = By.id("address1");
    private By _city = By.id("city");
    private By _state = By.id("id_state");
    private By _zipCode = By.id("postcode");
    private By _mobilePhone = By.id("phone_mobile");
    private By _registerBtn = By.id("submitAccount");
    private By _firstNameError = By.xpath("//div[@id='center_column']/div/ol/li[3]");
    private By _lastNameError = By.xpath("//div[@id='center_column']/div/ol/li[2]");
    private By _passwordError = By.xpath("//div[@id='center_column']/div/ol/li[4]");
    private By _address1Error = By.xpath("//div[@id='center_column']/div/ol/li[5]");
    private By _cityError = By.xpath("//div[@id='center_column']/div/ol/li[6]");
    private By _stateError = By.xpath("//div[@id='center_column']/div/ol/li[8]");
    private By _zipCodeError = By.xpath("//div[@id='center_column']/div/ol/li[7]");
    private By _mobilePhoneError = By.xpath("//div[@id='center_column']/div/ol/li[1]");

    //Getting personal information text from registration page
    public String getYourPersonalInformationText() {
        return getText(_yourPersonalInfoText);
    }

    /**
     * Inputs methods for all mandatory fields on the registration page
     */
    public void inputFirstName() {
        typeText(_firstName, loadProp.getProperty("firstName"));
    }

    public void inputLastName() {
        typeText(_lastName, loadProp.getProperty("lastName"));
    }

    public void inputPassword() {
        typeText(_password, loadProp.getProperty("password"));
    }

    public void inputAddress1() {
        typeText(_address1, loadProp.getProperty("address"));
    }

    public void inputCity() {
        typeText(_city, loadProp.getProperty("city"));
    }

    public void selectState() {
        selectValueFromDropDown(_state, loadProp.getProperty("city"));
    }

    public void inputZipCode() {
        typeText(_zipCode, loadProp.getProperty("zipCode"));
    }

    public void inputMobilePhone() {
        typeText(_mobilePhone, loadProp.getProperty("mobilePhone"));
    }

    public void clickOnRegisterBtn() {
        clickOnElement(_registerBtn);
    }

    //Get first name error text
    public String getTextFirstNameError(){
        return getText(_firstNameError);
    }

    //Get last name error text
    public String getTextLastNameError(){
        return getText(_lastNameError);
    }

    //Get password error text
    public String getTextPasswordError(){
        return getText(_passwordError);
    }

    //Get Address1 error text
    public String getTextAddress1Error(){
        return getText(_address1Error);
    }

    //Get city error text
    public String getTextCityError(){
        return getText(_cityError);
    }

    //Get state error text
    public String getTextStateError(){
        return getText(_stateError);
    }

    //Get zip code error text
    public String getTextZipCodeError(){
        return getText(_zipCodeError);
    }

    //Get mobile phone error text
    public String getTextMobilePhoneError(){
        return getText(_mobilePhoneError);
    }



}
