package Step;

import Page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomeStep extends driver{

    HomePage homePage;

//   all test
    @Given("User login with valid username and password")
    public void userLoginWithValidUsernameAndPassword() {
        homePage = new HomePage(driver);
        homePage.goToHomepage("standard_user", "secret_sauce");
    }

    //    positif test and negatif
    @And("User add two item to the chart")
    public void userAddTwoItemToTheChart() {
        homePage.addTwoItems();
    }


    //boundary test
    @And("User add all item to the chart")
    public void userAddAllItemToTheChart() {
        homePage.addAllItems();
    }
}
