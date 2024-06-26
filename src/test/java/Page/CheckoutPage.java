package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class CheckoutPage {

   private WebDriver driver;

   By clickChartIcon = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
   By clickCheckout = By.id("checkout");
   By inputFirstName = By.id("first-name");
   By inputLastName = By.id("last-name");
   By inputPostCode = By.id("postal-code");
   By clikContinue = By.id("continue");
   By clikFinish = By.id("finish");

   public CheckoutPage (WebDriver driver){
       this.driver = driver;
   }

   public void proceedCheckout(){
       driver.findElement(clickChartIcon).click();
       driver.findElement(clickCheckout).click();
   }
   public void inputFirstName (String firstName){
       driver.findElement(inputFirstName).sendKeys(firstName);
   }
   public void inputLastName (String lastName) {
       driver.findElement(inputLastName).sendKeys(lastName);
   }
   public void inputPostCode (String postCode){
       driver.findElement(inputPostCode).sendKeys(postCode);
   }
   public void clickContinue (){
       driver.findElement(clikContinue).click();
   }
   public void clickFinish(){
       driver.findElement(clikFinish).click();
   }
   public  void thankyouMassage (String thankyouMessage){
       String actualMessage = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
       assertTrue(actualMessage.contains(thankyouMessage));
   }
   public void seeErrorMassage (String errorMessage){
       assertTrue(driver.getPageSource().contains(errorMessage));
   }
   public void userNotInputUsername(String firstName){
       driver.findElement(inputFirstName).sendKeys(firstName);
   }
}
