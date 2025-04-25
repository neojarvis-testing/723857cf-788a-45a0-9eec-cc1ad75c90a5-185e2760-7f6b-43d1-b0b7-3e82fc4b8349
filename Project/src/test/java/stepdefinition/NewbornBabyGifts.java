package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewbornBabyGiftsPage;
import utils.Screenshot;

public class NewbornBabyGifts {
    ExtentTest test=Hooks.report.createTest("Newborn Baby Gifts");
    NewbornBabyGiftsPage newbornBabyGiftsPage=new NewbornBabyGiftsPage(test);
    @Given("I click on Accept all Cookies.")
    public void i_click_on_accept_all_cookies() {
        newbornBabyGiftsPage.clickAcceptCookies();
    }
    @When("I hover on Shop by Age.")
    public void i_hover_on_shop_by_age() {
        newbornBabyGiftsPage.hoverShopByAge();
    }
    @When("I click on Newborn Gifts.")
    public void i_click_on_newborn_gifts() {
        newbornBabyGiftsPage.clickNewbornGifts();
    }
    @When("I verify url.")
    public void i_verify_url() {
        newbornBabyGiftsPage.verifyURL();
    }
    @When("I click on Show more.")
    public void i_click_on_show_more() {
        newbornBabyGiftsPage.clickShowMore();
    }
    @When("I click on Baby Activity Toys.")
    public void i_click_on_baby_activity_toys() {
        newbornBabyGiftsPage.clickBabyActivityToys();
    }
    @When("I click on Early Learning Centre.")
    public void i_click_on_early_learning_centre() {
        newbornBabyGiftsPage.clickEarlyLearningCentre();
    }
    @When("I click on Hand Eye Coordination.")
    public void i_click_on_hand_eye_coordination() {
        newbornBabyGiftsPage.clickHandEyeCoordination();
    }
    @When("I click on First Product.")
    public void i_click_on_first_product() {
        newbornBabyGiftsPage.clickFirstProduct();
    }
    @When("I verify Standard Delivery.")
    public void i_verify_standard_delivery() {
        newbornBabyGiftsPage.verifyStandardDelivery();
    }
    @When("I click on Add To Basket.")
    public void i_click_on_add_to_basket() {
        newbornBabyGiftsPage.clickAddToBasket();
    }
    @When("I click on Continue Shopping.")
    public void i_click_on_continue_shopping() {
        newbornBabyGiftsPage.clickContinueShopping();
    }
    @Then("I verify Home.")
    public void i_verify_home() {
        newbornBabyGiftsPage.verifyHome();
        Screenshot.captureScreenShot("Home");
    }   
}
