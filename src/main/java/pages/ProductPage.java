package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase {


    public ProductPage(WebDriver driver) {
        super(driver);
        js =  (JavascriptExecutor) driver;
        actions = new Actions(driver);
    }

    @FindBy(css = "div.right-block")
    public WebElement hoverOnDiv ;

    @FindBy(linkText = "Proceed to checkout")
    public WebElement proceedToCheckOutBtn ;

    @FindBy(css = "a.button.ajax_add_to_cart_button.btn.btn-default")
    public WebElement hoverOnCartBtn ;



    public void openShoppingCartPage() throws InterruptedException {

        scrollToBottom();
        actions.moveToElement(hoverOnDiv).moveToElement(hoverOnCartBtn)
                .click().build().perform();
        clickOnButton(proceedToCheckOutBtn);

    }

}
