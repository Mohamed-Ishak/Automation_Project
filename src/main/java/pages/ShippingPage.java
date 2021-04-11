package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends PageBase{


    public ShippingPage(WebDriver driver) {
        super(driver);
        js =  (JavascriptExecutor) driver;
    }

    @FindBy(id = "cgv")
    public WebElement agreeTermsBtn ;

    @FindBy(css = "button.button.btn.btn-default.standard-checkout.button-medium")
    public WebElement continueProceedBtn ;


    public void openPaymentPage() throws InterruptedException {
        scrollToBottom();
        clickOnButton(agreeTermsBtn);
        clickOnButton(continueProceedBtn);
    }


}
