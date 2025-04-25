package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.SoftToysPage;
import utils.Screenshot;

public class SoftToys {
    ExtentTest test=Hooks.report.createTest("Soft Toys");
    SoftToysPage softToysPage=new SoftToysPage(test);
    @Given("I click on Accept Cookies.")
    public void i_click_on_accept_cookies() {
        softToysPage.clickAcceptCookies();
    }
    @When("I hover on Type Of Toy.")
    public void i_hover_on_type_of_toy() {
        softToysPage.hoverTypeOfToy();
    }
    @When("I click on Soft Toys.")
    public void i_click_on_soft_toys() {
        softToysPage.clickSoftToys();
    }
    @When("I verify URL.")
    public void i_verify_url() {
        softToysPage.verifyURL();
    }
    @When("I click on Dolls.")
    public void i_click_on_dolls() {
        softToysPage.clickDolls();
    }
    @When("I click on Soft Toys Under Toy Type.")
    public void i_click_on_soft_toys_under_toy_type() {
        softToysPage.clickSoftToysUnderToyType();
    }
    @When("I verify Brands.")
    public void i_verify_brands() {
        softToysPage.verifyBrands();
    }
    @When("I click on Simulating Senses.")
    public void i_click_on_simulating_senses() {
        softToysPage.clickSimulatingSenses();
    }
    @When("I click on First Product Soft Toys.")
    public void i_click_on_first_product_soft_toys() {
        softToysPage.clickFirstProductSoftToys();
    }
    @When("I verify Home Delivery.")
    public void i_verify_home_delivery() {
        softToysPage.verifyHomeDelivery();
        Screenshot.captureScreenShot("Home");
    }
}
