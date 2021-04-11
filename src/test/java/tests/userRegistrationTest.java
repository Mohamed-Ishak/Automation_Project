package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.PageBase;
import pages.UserRegistrationPage;

public class userRegistrationTest extends PageBase {

    HomePage homeObject ;
    UserRegistrationPage userRegistrationObject ;
    CreateAccountPage createAccountObject ;

    public userRegistrationTest(WebDriver driver) {
        super(driver);
    }

    @Test (priority = 1)
    public void userCanEnterValidEmailSuccessfully(){
        homeObject = new HomePage(driver);
        homeObject.openSignInPage();
        userRegistrationObject = new UserRegistrationPage(driver);
        userRegistrationObject.enterValidEmail("mohamed8826er97@gmail.com");

    }

    @Test(priority = 2)
    public void userCanCreateAccountWithValidEmail() throws InterruptedException {

     createAccountObject = new CreateAccountPage(driver);
        createAccountObject.userCanCreateAccountPart1
          ("Kamel","dfaffds","123@4562",
                  "hfghfhjgf");
        Thread.sleep(2000);
        createAccountObject.selectState();
        createAccountObject.userCanCreateAccountPart2("sadfa","12354"
                              ,"123354843153","sdaffds");
        Assert.assertTrue(createAccountObject.SuccessfulMessage.getText()
                .contains("Welcome to your account. Here you can manage all of your personal information and orders."));
    }





}
