package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends PageBase{


    public AddressPage(WebDriver driver) {
        super(driver);
        js =  (JavascriptExecutor) driver;
    }


    @FindBy(css = "button.button.btn.btn-default.button-medium")
    public WebElement continueToCheckOutBtn ;

    public void GoToShippingPage() {
        scrollToBottom();
        clickOnButton(continueToCheckOutBtn);
    }

}
