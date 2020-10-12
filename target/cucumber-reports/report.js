$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/featureFiles/AddToCartProduct.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I should able to add the product into cart",
  "description": "",
  "id": "as-a-user-i-should-able-to-add-the-product-into-cart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 10874396800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "user should able to add product to cart",
  "description": "",
  "id": "as-a-user-i-should-able-to-add-the-product-into-cart;user-should-able-to-add-product-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@addToCart"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user select a product from home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user navigate to product page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on the Add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user on Proceed to checkout button on popup",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should navigate to cart summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user should see product added in the cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddProductToCartSteps.userSelectAProductFromHomePage()"
});
formatter.result({
  "duration": 301842600,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: Element \u003ca class\u003d\"product_img_link\" href\u003d\"http://automationpractice.com/index.php?id_product\u003d1\u0026controller\u003dproduct\"\u003e could not be scrolled into view\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027AD01273\u0027, ip: \u002710.30.9.20\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.5\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 80.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200831163820, moz:geckodriverVersion: 0.27.0, moz:headless: false, moz:processID: 22564, moz:profile: C:\\Users\\Prakash.Narola\\App..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 691e5ea8-fef3-4406-ac98-b8a162ce1987\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat UsayCompare.Base.Utils.clickOnElement(Utils.java:14)\r\n\tat UsayCompare.Pages.HomePage.clickOnTheFirstProductOnHomePage(HomePage.java:19)\r\n\tat UsayCompare.Steps.AddProductToCartSteps.userSelectAProductFromHomePage(AddProductToCartSteps.java:18)\r\n\tat ✽.When user select a product from home page(src/test/resources/featureFiles/AddToCartProduct.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddProductToCartSteps.userNavigateToProductPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddProductToCartSteps.userClickOnTheAddToCartButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddProductToCartSteps.userOnProceedToCheckoutButtonOnPopup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddProductToCartSteps.userShouldNavigateToCartSummaryPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddProductToCartSteps.userShouldSeeProductAddedInTheCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1409673700,
  "status": "passed"
});
formatter.uri("src/test/resources/featureFiles/login.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I should able to login with registered email address",
  "description": "",
  "id": "as-a-user-i-should-able-to-login-with-registered-email-address",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 9216955400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "user should able to login successful with registered email address",
  "description": "",
  "id": "as-a-user-i-should-able-to-login-with-registered-email-address;user-should-able-to-login-successful-with-registered-email-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is already registered",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on the Sign in button on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter an email and password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on the Sing In button on authentication page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should login successfully with welcome message \"Welcome\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.userIsAlreadyRegistered()"
});
formatter.result({
  "duration": 8076661600,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationSteps.user_click_on_the_Sign_in_button_on_the_home_page()"
});
formatter.result({
  "duration": 1465172100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userEnterAnEmailAndPassword()"
});
formatter.result({
  "duration": 214975400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userClickOnTheSingInButtonOnAuthenticationPage()"
});
formatter.result({
  "duration": 1452417200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 53
    }
  ],
  "location": "LoginSteps.userShouldLoginSuccessfullyWithWelcomeMessage(String)"
});
formatter.result({
  "duration": 98727400,
  "status": "passed"
});
formatter.after({
  "duration": 1213169000,
  "status": "passed"
});
formatter.uri("src/test/resources/featureFiles/registration.feature");
formatter.feature({
  "line": 2,
  "name": "User should able to register successfully with all mandatory detail on sign up page",
  "description": "so that user can access an account",
  "id": "user-should-able-to-register-successfully-with-all-mandatory-detail-on-sign-up-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 9490239400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should able create an account and sing in successfully",
  "description": "",
  "id": "user-should-able-to-register-successfully-with-all-mandatory-detail-on-sign-up-page;user-should-able-create-an-account-and-sing-in-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@registration"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user click on the Sign in button on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter an email address in email address field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on the create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user navigate to create an account page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enter all mandatory field data",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on the register button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should registered successfully with welcome message \"Welcome to your account.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountCreationSteps.user_click_on_the_Sign_in_button_on_the_home_page()"
});
formatter.result({
  "duration": 1571033400,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationSteps.user_enter_an_email_address_in_email_address_field()"
});
formatter.result({
  "duration": 113642900,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationSteps.user_click_on_the_create_an_account_button()"
});
formatter.result({
  "duration": 299601400,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationSteps.user_navigate_to_create_an_account_page()"
});
formatter.result({
  "duration": 1075493600,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationSteps.user_enter_all_mandatory_field_data()"
});
formatter.result({
  "duration": 1020987400,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationSteps.user_click_on_the_register_button()"
});
formatter.result({
  "duration": 1412826900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to your account.",
      "offset": 58
    }
  ],
  "location": "AccountCreationSteps.user_should_registered_successfully_with_welcome_message(String)"
});
formatter.result({
  "duration": 29002700,
  "status": "passed"
});
formatter.after({
  "duration": 1357898700,
  "status": "passed"
});
formatter.before({
  "duration": 8973356000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User should able to see an error for mandatory field on account creation page",
  "description": "",
  "id": "user-should-able-to-register-successfully-with-all-mandatory-detail-on-sign-up-page;user-should-able-to-see-an-error-for-mandatory-field-on-account-creation-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@errorValidation"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user click on the Sign in button on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user click on the create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user should see an error for email address mandatory field \"Invalid email address\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user enter an email address in email address field",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user click on the create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user click on the register button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user should see mandatory fields errors for first name \"firstname is required.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user should see mandatory fields errors for last name \"lastname is required.\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user should see mandatory fields errors for password \"passwd is required.\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user should see mandatory fields errors for address \"address1 is required.\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user should see mandatory fields errors for city \"city is required.\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user should see mandatory fields errors for state \"This country requires you to choose a State\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user should see mandatory fields errors for zip code \"The Zip/Postal code you\u0027ve entered is invalid. It must follow this format: 00000\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user should see mandatory fields errors for mobile phone \"You must register at least one phone number.\"",
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreationSteps.user_click_on_the_Sign_in_button_on_the_home_page()"
});
formatter.result({
  "duration": 1683596000,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationSteps.user_click_on_the_create_an_account_button()"
});
formatter.result({
  "duration": 266487800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid email address",
      "offset": 60
    }
  ],
  "location": "AccountCreationSteps.userShouldSeeAnErrorForEmailAddressMandatoryField(String)"
});
formatter.result({
  "duration": 661722200,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationSteps.user_enter_an_email_address_in_email_address_field()"
});
formatter.result({
  "duration": 173863000,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationSteps.user_click_on_the_create_an_account_button()"
});
formatter.result({
  "duration": 296941100,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationSteps.user_click_on_the_register_button()"
});
formatter.result({
  "duration": 1737244900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstname is required.",
      "offset": 56
    }
  ],
  "location": "AccountCreationSteps.userShouldSeeMandatoryFieldsErrorsForFirstName(String)"
});
formatter.result({
  "duration": 563645400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lastname is required.",
      "offset": 55
    }
  ],
  "location": "AccountCreationSteps.userShouldSeeMandatoryFieldsErrorsForLastName(String)"
});
formatter.result({
  "duration": 26772900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passwd is required.",
      "offset": 54
    }
  ],
  "location": "AccountCreationSteps.userShouldSeeMandatoryFieldsErrorsForPassword(String)"
});
formatter.result({
  "duration": 20317700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "address1 is required.",
      "offset": 53
    }
  ],
  "location": "AccountCreationSteps.userShouldSeeMandatoryFieldsErrorsForAddress(String)"
});
formatter.result({
  "duration": 30938400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "city is required.",
      "offset": 50
    }
  ],
  "location": "AccountCreationSteps.userShouldSeeMandatoryFieldsErrorsForCity(String)"
});
formatter.result({
  "duration": 45851700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This country requires you to choose a State",
      "offset": 51
    }
  ],
  "location": "AccountCreationSteps.userShouldSeeMandatoryFieldsErrorsForState(String)"
});
formatter.result({
  "duration": 26507100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The Zip/Postal code you\u0027ve entered is invalid. It must follow this format: 00000",
      "offset": 54
    }
  ],
  "location": "AccountCreationSteps.userShouldSeeMandatoryFieldsErrorsForZipCode(String)"
});
formatter.result({
  "duration": 13875500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You must register at least one phone number.",
      "offset": 58
    }
  ],
  "location": "AccountCreationSteps.userShouldSeeMandatoryFieldsErrorsForMobilePhone(String)"
});
formatter.result({
  "duration": 30562200,
  "status": "passed"
});
formatter.after({
  "duration": 1247463600,
  "status": "passed"
});
});