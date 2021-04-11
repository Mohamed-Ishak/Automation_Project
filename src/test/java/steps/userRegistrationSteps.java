package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;
import tests.TestBase;

public class userRegistrationSteps extends TestBase {

    HomePage homeObject ;
    UserRegistrationPage userRegistrationObject ;
    CreateAccountPage createAccountObject ;
    MyAccountPage myAccountObject ;



    @Given("user in the home page")
    public void user_in_the_home_page() {
        homeObject = new HomePage(driver);
        homeObject.openSignInPage();

    }
    @When("user click on signIn button")
    public void user_click_on_sign_in_button() {

    }
    @When("enter valid {string} and click on create account")
    public void enter_valid_email_and_click_on_create_account(String email) {
        userRegistrationObject = new UserRegistrationPage(driver);
        userRegistrationObject.enterValidEmail(email);

    }
    @When("enter {string} & {string} & {string} and {string}")
    public void enter_firstname_lastname_password_address(String firstname, String lastname
                                  ,String password , String address) {
     createAccountObject = new CreateAccountPage(driver);
     createAccountObject.userCanCreateAccountPart1(firstname,lastname,password,address);
     createAccountObject.selectState();
    }

    @When("enter  {string} & {string} & {string} and {string}")
    public void enter_city_postalCode_mobile_refAddress(String city
              ,String postCode , String mobile , String refAddress){
        createAccountObject = new CreateAccountPage(driver);
        createAccountObject.userCanCreateAccountPart2(city,postCode,mobile,refAddress);

    }

    @Then("user register successfully")
    public void user_register_successfully() {

        myAccountObject = new MyAccountPage(driver);
       Assert.assertTrue(myAccountObject.welcomeMessage.isDisplayed());

    }
}
