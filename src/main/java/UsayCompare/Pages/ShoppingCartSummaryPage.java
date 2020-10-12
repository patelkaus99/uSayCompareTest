package UsayCompare.Pages;

import UsayCompare.Base.Utils;
import org.openqa.selenium.By;

public class ShoppingCartSummaryPage extends Utils {

    //Page Elements
    private By _cartTitleText = By.id("cart_title");
    private By _productNameInCart = By.xpath("//table/tbody/tr/td[2]/p/a");

    //Getting cart title text for assertion
    public String getCartTitleText(){
        return getText(_cartTitleText);
    }

    //Get product name for assertion
    public String getProductNameTextFromCart(){
        return getText(_productNameInCart);
    }
}
