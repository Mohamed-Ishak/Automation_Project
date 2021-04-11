package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentConfirmationPage extends PageBase{


    public PaymentConfirmationPage(WebDriver driver) {
        super(driver);
        js =  (JavascriptExecutor) driver;
    }


    @FindBy(css = "button.button.btn.btn-default.button-medium")
    public WebElement confirmOrderBtn ;

    @FindBy(css = "div.box")
    public WebElement SuccessMessage ;

    @FindBy(css="p.cheque-indent")
    public WebElement successTex ;


    public void confirmPaymentOrder() {
        scrollToBottom();
        clickOnButton(confirmOrderBtn);
    }
}
