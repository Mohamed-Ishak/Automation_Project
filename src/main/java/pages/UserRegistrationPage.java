package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase{


    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_create")
    WebElement emailTxt ;
    @FindBy(id = "SubmitCreate")
    WebElement createAccountBtn ;

    @FindBy(css = "h3.page-subheading")
    public WebElement createAccountTxt ;

    public void enterValidEmail(String email){

        setElementText(emailTxt,email);
        clickOnButton(createAccountBtn);
    }




}
