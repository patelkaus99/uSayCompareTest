package UsayCompare.Steps;

import UsayCompare.Pages.HomePage;
import UsayCompare.Pages.ProductPage;
import UsayCompare.Pages.ShoppingCartSummaryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AddProductToCartSteps {
    private HomePage homePage = new HomePage();
    private ProductPage productPage = new ProductPage();
    private ShoppingCartSummaryPage shoppingCartSummaryPage = new ShoppingCartSummaryPage();

    @When("^user select a product from home page$")
    public void userSelectAProductFromHomePage() {
        homePage.clickOnTheFirstProductOnHomePage();
    }

    @And("^user navigate to product page$")
    public void userNavigateToProductPage() {
        productPage.getProductNameText();
    }

    @And("^user click on the Add to cart button$")
    public void userClickOnTheAddToCartButton() {
        productPage.clickOnAddToCartBtn();
    }

    @And("^user on Proceed to checkout button on popup$")
    public void userOnProceedToCheckoutButtonOnPopup() {
        productPage.clickOnProceedToCheckoutBtn();
    }

    @Then("^user should navigate to cart summary page$")
    public void userShouldNavigateToCartSummaryPage() {
        Assert.assertTrue("User is not on the cart summary page"
                , shoppingCartSummaryPage.getCartTitleText().contains("SHOPPING-CART SUMMARY"));
    }

    @And("^user should see product added in the cart$")
    public void userShouldSeeProductAddedInTheCart() {
        Assert.assertEquals(shoppingCartSummaryPage.getProductNameTextFromCart(), productPage.productName);
    }
}
