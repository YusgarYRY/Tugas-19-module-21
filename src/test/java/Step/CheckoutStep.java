package Step;

import Page.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStep extends driver{

    CheckoutPage checkoutPage;

    //    all test
    @When("User proceed checkout")
    public void userProceedCheckout() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.proceedCheckout();
    }

    @And("User click Continue dan finish")
    public void userClickContinueDanFinish() {
        checkoutPage.clickContinue();
        checkoutPage.clickFinish();

    }

    //positif and boundary
    @And("User input firstname{string}")
    public void userInputFirstname(String firstname) {
        checkoutPage.inputFirstName(firstname);
    }


    @And("User input lastname {string}")
    public void userInputLastname(String lastname) {
        checkoutPage.inputLastName(lastname);
    }

    @And("User input post code {string}")
    public void userInputPostCode(String postcode) {
        checkoutPage.inputPostCode(postcode);
    }


    @Then("user able to see thankyou massage {string}")
    public void userAbleToSeeThankyouMassage(String thankyouMassage) {
        checkoutPage.thankyouMassage(thankyouMassage);
    }

    //    negatif test

    @And("User not input firstname{string}")
    public void userNotInputFirstname(String firstName) {
        checkoutPage.userNotInputUsername("");
    }


    @And("User click Continue")
    public void userClickContinue() {
        checkoutPage.clickContinue();
    }

    @Then("user able to see error massage {string}")
    public void userAbleToSeeErrorMassage(String errorMassage) {
        checkoutPage.seeErrorMassage(errorMassage);
    }

}
