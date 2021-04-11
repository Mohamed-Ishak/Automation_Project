package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PageBase {

    protected WebDriver driver ;
    public Select select ;
    public JavascriptExecutor js ;
    public Actions actions ;

    public PageBase(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    protected static void clickOnButton(WebElement button){
                 button.click();
    }

    protected static void setElementText(WebElement text, String value){
        text.sendKeys(value);
    }

    public void scrollToBottom()  {

        js.executeScript("scrollBy(0,1000)");

    }
}
