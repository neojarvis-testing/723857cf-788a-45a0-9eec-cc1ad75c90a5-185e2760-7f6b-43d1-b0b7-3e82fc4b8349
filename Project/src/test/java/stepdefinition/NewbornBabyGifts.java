package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewbornBabyGiftsPage;
import utils.Reporter;
import utils.Screenshot;

public class NewbornBabyGifts {
    ExtentTest test=Hooks.report.createTest("Newborn Baby Gifts");
    NewbornBabyGiftsPage newbornBabyGiftsPage=new NewbornBabyGiftsPage(test);

    /*
     * Method Name : i_click_on_accept_all_cookies
     * Author Name : Akki Manith
     * Description : clicked on the accept cookies button 
     * Return Type : void
     * Parameter list : none
     */
    @Given("I click on Accept all Cookies.")
    public void i_click_on_accept_all_cookies() {
        newbornBabyGiftsPage.clickAcceptCookies();
    }

    /*
     * Method Name : i_hover_on_shop_by_age
     * Author Name : Akki Manith
     * Description : hovered on shop by age 
     * Return Type : void
     * Parameter list : none
     */
    @When("I hover on Shop by Age.")
    public void i_hover_on_shop_by_age() {
        newbornBabyGiftsPage.hoverShopByAge();
    }

    /*
     * Method Name : i_click_on_newborn_gifts
     * Author Name : Akki Manith
     * Description : clicked on newborn gifts 
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on Newborn Gifts.")
    public void i_click_on_newborn_gifts() {
        newbornBabyGiftsPage.clickNewbornGifts();
    }

    /*
     * Method Name : i_verify_url
     * Author Name : Akki Manith
     * Description : verified url 
     * Return Type : void
     * Parameter list : none
     */
    @When("I verify url.")
    public void i_verify_url() {
        newbornBabyGiftsPage.verifyURL();
    }

    /*
     * Method Name : i_click_on_show_more
     * Author Name : Akki Manith
     * Description : clicked on show more 
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on Show more.")
    public void i_click_on_show_more() {
        newbornBabyGiftsPage.clickShowMore();
    }

    /*
     * Method Name : i_click_on_baby_activity_toys
     * Author Name : Akki Manith
     * Description : clicked on baby activity toys 
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on Baby Activity Toys.")
    public void i_click_on_baby_activity_toys() {
        newbornBabyGiftsPage.clickBabyActivityToys();
    }

    /*
     * Method Name : i_click_on_early_learning_centre
     * Author Name : Akki Manith
     * Description : clicked on early learning centre
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on Early Learning Centre.")
    public void i_click_on_early_learning_centre() {
        newbornBabyGiftsPage.clickEarlyLearningCentre();
    }
    /*
     * Method Name : i_click_on_hand_eye_coordination
     * Author Name : Akki Manith
     * Description : clicked on hand eye coordination
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on Hand Eye Coordination.")
    public void i_click_on_hand_eye_coordination() {
        newbornBabyGiftsPage.clickHandEyeCoordination();
    }

    /*
     * Method Name : i_click_on_first_product
     * Author Name : Akki Manith
     * Description : click on first product
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on First Product.")
    public void i_click_on_first_product() {
        newbornBabyGiftsPage.clickFirstProduct();
    }

    /*
     * Method Name : i_verify_standard_delivery
     * Author Name : Akki Manith
     * Description : verified standard delivery
     * Return Type : void
     * Parameter list : none
     */
    @When("I verify Standard Delivery.")
    public void i_verify_standard_delivery() {
        newbornBabyGiftsPage.verifyStandardDelivery();
    }

    /*
     * Method Name : i_click_on_add_to_basket
     * Author Name : Akki Manith
     * Description : clicked on add to basket
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on Add To Basket.")
    public void i_click_on_add_to_basket() {
        newbornBabyGiftsPage.clickAddToBasket();
    }

    /*
     * Method Name : i_click_on_continue_shopping
     * Author Name : Akki Manith
     * Description : clicked on continue shopping
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on Continue Shopping.")
    public void i_click_on_continue_shopping() {
        newbornBabyGiftsPage.clickContinueShopping();
    }

    /*
     * Method Name : i_verify_home
     * Author Name : Akki Manith
     * Description : verified home
     * Return Type : void
     * Parameter list : none
     */
    @Then("I verify Home.")
    public void i_verify_home() {
        newbornBabyGiftsPage.verifyHome();
        Screenshot.captureScreenShot("ELC");
        Reporter.attachScreenshotToReport("ELC", test, "ELC");
    }   
}
