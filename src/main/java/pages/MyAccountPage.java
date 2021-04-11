package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{


    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "a.sf-with-ul")
    public WebElement womenTab ;


    @FindBy(css = "p.info-account")
    public WebElement welcomeMessage ;

    public void openWomenPage(){
        clickOnButton(womenTab);
    }

}
