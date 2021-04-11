package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;
import tests.TestBase;

public class PaymentSteps extends TestBase {



    MyAccountPage myAccountObject ;
    ProductPage productObject ;
    SummaryPage summaryObject ;
    AddressPage addressObject ;
    ShippingPage shippingAddress ;
    PaymentPage  paymentObject ;
    PaymentConfirmationPage paymentConfirmationObject ;


    @When("user click on women Tab page")
    public void user_click_on_women_tab_page() {
        myAccountObject = new MyAccountPage(driver);
        myAccountObject.openWomenPage();
    }

    @When("user choose item and add it to cart")
    public void user_choose_item_and_add_it_to_cart() throws InterruptedException {
        productObject = new ProductPage(driver);
        productObject.openShoppingCartPage();
    }

    @When("user complete check out")
    public void user_complete_check_out() throws InterruptedException {

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
    }

    @Then("user confirm order")
    public void user_confirm_order() {
        Assert.assertTrue(paymentConfirmationObject.
                SuccessMessage.isDisplayed());
        Assert.assertTrue(paymentConfirmationObject.successTex
                .getText().contains("Your order on My Store is complete."));
    }




}
