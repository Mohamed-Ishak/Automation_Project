package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryPage extends PageBase{


    public SummaryPage(WebDriver driver) {
        super(driver);
        js =  (JavascriptExecutor) driver;
    }

    @FindBy (css = "a.button.btn.btn-default.standard-checkout.button-medium")
    public WebElement continueCheckBtn ;

    public void openAddressPage()  {
        scrollToBottom();
        clickOnButton(continueCheckBtn);
    }

}
