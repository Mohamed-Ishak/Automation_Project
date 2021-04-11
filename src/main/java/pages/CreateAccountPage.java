package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends PageBase{
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(id = "id_gender1")
    WebElement radioBtn ;

    @FindBy(id = "customer_firstname")
    WebElement firstNameTxt ;

    @FindBy(id = "customer_lastname")
    WebElement lastNameTxt ;

    @FindBy(id = "passwd")
    WebElement passwordTxt ;

    @FindBy(id = "address1")
    WebElement addressTxt ;

    @FindBy(id = "city")
    WebElement cityTxt ;

    @FindBy(id = "id_state")
    WebElement stateTxt ;

    @FindBy (id = "postcode")
    WebElement postCodeTxt ;

    @FindBy (id = "phone_mobile")
    WebElement mobileNumberTxt ;

    @FindBy(id = "alias")
    WebElement aliasAddress ;

    @FindBy(id = "submitAccount")
    WebElement registerBtn ;

    @FindBy(css ="p.info-account")
   public WebElement SuccessfulMessage ;

    @FindBy(css = "h3.page-subheading")
    public WebElement setPersonalInfo ;


     public void userCanCreateAccountPart1(String firstname, String lastname
             ,String password , String address ) {

         clickOnButton(radioBtn);
         setElementText(firstNameTxt, firstname);
         setElementText(lastNameTxt, lastname);
         setElementText(passwordTxt, password);
         setElementText(addressTxt, address);


     }
     public void selectState() {
         select = new Select(stateTxt);
         select.selectByIndex(2);

     }

     public void userCanCreateAccountPart2(String city , String postCode,String mobile
              ,String refAddress)  {
         setElementText(cityTxt, city);
         setElementText(postCodeTxt,postCode);
         setElementText(mobileNumberTxt,mobile);
         setElementText(aliasAddress,refAddress);
         clickOnButton(registerBtn);

     }


}
