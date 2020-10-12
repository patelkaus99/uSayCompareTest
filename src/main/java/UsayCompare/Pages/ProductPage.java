package UsayCompare.Pages;

import UsayCompare.Base.Utils;
import org.openqa.selenium.By;

public class ProductPage extends Utils {

    //Page elements
    private By _productNameText = By.xpath("//div[@id='center_column']/div/div/div[3]/h1");
    private By _addToCartBtn = By.id("add_to_cart");
    private By _proceedToCheckoutBtn = By.xpath("//div[@id='layer_cart']/div[1]/div[2]/div[4]/a");

    //product name variable for to add the product name from product page after adding to cart
    public String productName;

    //Get product name from product page
    public void getProductNameText(){
        productName = getText(_productNameText);
    }

    //click on the Add to cart button
    public void clickOnAddToCartBtn(){
        clickOnElement(_addToCartBtn);
    }

    //click on proceed to checkout button on the popup
    public void clickOnProceedToCheckoutBtn(){
        clickOnElement(_proceedToCheckoutBtn);
    }
}
