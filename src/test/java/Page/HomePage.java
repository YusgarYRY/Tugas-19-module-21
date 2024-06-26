package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");
    By addBackpackitem = By.id("add-to-cart-sauce-labs-backpack");
    By addBikeLightItem = By.id("add-to-cart-sauce-labs-bike-light");
    By addBoldTshirtItem = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By addFleeceJacketItem = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By addOnesieItem = By.id("add-to-cart-sauce-labs-onesie");
    By addTshirtRedItem = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void goToHomepage (String username, String password ) {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(usernameInputText).sendKeys(username);
        driver.findElement(passwordInputText).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void addTwoItems(){
        driver.findElement(addBackpackitem).click();
        driver.findElement(addBikeLightItem).click();
    }

    public void addAllItems (){
        driver.findElement(addBackpackitem).click();
        driver.findElement(addBikeLightItem).click();
        driver.findElement(addBoldTshirtItem).click();
        driver.findElement(addFleeceJacketItem).click();
        driver.findElement(addOnesieItem).click();
        driver.findElement(addTshirtRedItem).click();
    }
}
