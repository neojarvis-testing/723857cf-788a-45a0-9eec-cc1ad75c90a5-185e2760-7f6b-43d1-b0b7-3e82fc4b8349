package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HappyLandHomePage;

public class HappyLandPage {
      public static ExtentTest test=Hooks.report.createTest("happyland");  
      public static HappyLandHomePage p=new HappyLandHomePage(test);
       /*
    * Method name :  i_hover_on_explore
    * Author name : PrasannaLaxmi
    * Description : Clicks on the accept cookies button and hover on explore
    * Return Type : void
    * Parameter : None
    */
      @When("I Hover on Explore")
public void i_hover_on_explore() {
    p.clickAcceptCookies();
    p.hoverOnExplore();
}

 /*
    * Method name : i_click_gift_cards
    * Author name : PrasannaLaxmi
    * Description : Clicks on the Giftcards
    * Return Type : void
    * Parameter : None
    */

@When("I click Gift Cards")
public void i_click_gift_cards() {
    p.clickOnGift();
}
 /*
    * Method name :  i_verify_url_contain_the_keyword_gif
    * Author name : PrasannaLaxmi
    * Description : This method Verify url
    * Return Type : void
    * Parameter : None
    */
@When("I verify URL contain the keyword gift")
public void i_verify_url_contain_the_keyword_gift() {
   p.verifyGift();
}
 /*
    * Method name : i_click_on_offers
    * Author name : PrasannaLaxmi
    * Description : Clicks on the Offers
    * Return Type : void
    * Parameter : None
    */
@When("I click on Offers")
public void i_click_on_offers() {
  p.clickOnOffers();
}
 /*
    * Method name : i_verified_months
    * Author name : PrasannaLaxmi
    * Description : This method verify months
    * Return Type : void
    * Parameter : None
    */
@When("I verified months")
public void i_verified_months() {
   p.verifyMonths();
}
 /*
    * Method name : i_click_on_happyland
    * Author name : PrasannaLaxmi
    * Description : Clicks on the Happyland
    * Return Type : void
    * Parameter : None
    */
@When("I click on Happyland")
public void i_click_on_happyland() {
  p.clickOnHappyLand();
}
 /*
    * Method name : i_click_first_product
    * Author name : PrasannaLaxmi
    * Description : This method click on first product
    * Return Type : void
    * Parameter : None
    */
@When("I click first Product")
public void i_click_first_product() {
    p.clickOnFirst();
}
 /*
    * Method name : i_verify_store
    * Author name : PrasannaLaxmi
    * Description : this method verify store
    * Return Type : void
    * Parameter : None
    */
@When("I verify store")
public void i_verify_store() {
   // p.verifyStore();
}
 /*
    * Method name : i_click_add_to_basket
    * Author name : PrasannaLaxmi
    * Description : Clicks on the add to basket
    * Return Type : void
    * Parameter : None
    */
@When("I click Add to basket")
public void i_click_add_to_basket() {
   p.clickOnAddtoCart();
}
 /*
    * Method name : i_click_checkout
    * Author name : PrasannaLaxmi
    * Description : Clicks on the checkout
    * Return Type : void
    * Parameter : None
    */
@Then("I click checkout")
public void i_click_checkout() {
   p.clickOnCheck();
}

}
