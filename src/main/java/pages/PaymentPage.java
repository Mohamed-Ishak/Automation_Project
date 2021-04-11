package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends PageBase{


    public PaymentPage(WebDriver driver) {
        super(driver);
        js =  (JavascriptExecutor) driver;
    }


    @FindBy(css = "a.bankwire")
    public WebElement payWithBankBtn ;

    public void selectPayWithBankOrder() throws InterruptedException {
        scrollToBottom();
        clickOnButton(payWithBankBtn);
    }
}
