package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestPaymentCycle extends TestBase{

    HomePage homeObject ;
    UserRegistrationPage userRegistrationObject ;
    CreateAccountPage  createAccountObject ;
    MyAccountPage myAccountObject ;
    ProductPage productObject ;
    SummaryPage summaryObject ;
    AddressPage addressObject ;
    ShippingPage shippingAddress ;
    PaymentPage  paymentObject ;
    PaymentConfirmationPage paymentConfirmationObject ;



    @Test(priority = 1)
    public void userCanEnterValidEmailSuccessfully(){
        homeObject = new HomePage(driver);
        homeObject.openSignInPage();
        userRegistrationObject = new UserRegistrationPage(driver);
        userRegistrationObject.enterValidEmail("Zmadoral9@gmail.com");

    }

    @Test(priority = 2)
    public void userCanCreateAccountWithValidEmail() throws InterruptedException {

        createAccountObject = new CreateAccountPage(driver);
        createAccountObject.userCanCreateAccountPart1
                ("kamaley","dfaffds","123#46662",
                        "hfghfhjgf");
        Thread.sleep(2000);
        createAccountObject.selectState();
        createAccountObject.userCanCreateAccountPart2("sadfa","12354"
                ,"1233548646548","sdaffds");
        Assert.assertTrue(createAccountObject.SuccessfulMessage.getText()
                .contains("Welcome to your account. Here you can manage all of your personal information and orders."));
    }

    @Test(priority = 3)

    public void UserCanCompletePaymentCycleSuccessfully() throws InterruptedException {

        myAccountObject = new MyAccountPage(driver);
        myAccountObject.openWomenPage();

        productObject = new ProductPage(driver);
        productObject.openShoppingCartPage();

        summaryObject = new SummaryPage(driver);
        summaryObject.openAddressPage();
        addressObject = new AddressPage(driver);
        addressObject.GoToShippingPage();
        shippingAddress = new ShippingPage(driver);
        shippingAddress.openPaymentPage();
        Thread.sleep(2000);
        paymentObject =new PaymentPage(driver);
        paymentObject.selectPayWithBankOrder();
        paymentConfirmationObject = new PaymentConfirmationPage(driver);
        paymentConfirmationObject.confirmPaymentOrder();
        Assert.assertTrue(paymentConfirmationObject.
                SuccessMessage.isDisplayed());
        Assert.assertTrue(paymentConfirmationObject.successTex
                .getText().contains("Your order on My Store is complete."));

    }












}
