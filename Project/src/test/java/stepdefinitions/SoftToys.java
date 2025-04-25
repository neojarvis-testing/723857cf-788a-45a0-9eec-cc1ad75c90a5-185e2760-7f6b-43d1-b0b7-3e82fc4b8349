package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.SoftToysPage;
import utils.Reporter;
import utils.Screenshot;

public class SoftToys {
    ExtentTest test=Hooks.report.createTest("Soft Toys");
    SoftToysPage softToysPage=new SoftToysPage(test);

    /*
     * Method Name : i_click_on_accept_cookies
     * Author Name : Akki Manith
     * Description : clicked on accept cookies
     * Return Type : void
     * Parameter list : none
     */
    @Given("I click on Accept Cookies.")
    public void i_click_on_accept_cookies() {
        softToysPage.clickAcceptCookies();
    }

    /*
     * Method Name : i_hover_on_type_of_toy
     * Author Name : Akki Manith
     * Description : hovered on type of toy
     * Return Type : void
     * Parameter list : none
     */
    @When("I hover on Type Of Toy.")
    public void i_hover_on_type_of_toy() {
        softToysPage.hoverTypeOfToy();
    }

    /*
     * Method Name : i_click_on_soft_toys
     * Author Name : Akki Manith
     * Description : clicked on soft toys
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on Soft Toys.")
    public void i_click_on_soft_toys() {
        softToysPage.clickSoftToys();
    }

    /*
     * Method Name : i_verify_url
     * Author Name : Akki Manith
     * Description : verified url
     * Return Type : void
     * Parameter list : none
     */
    @When("I verify URL.")
    public void i_verify_url() {
        softToysPage.verifyURL();
    }

    /*
     * Method Name : i_click_on_dolls
     * Author Name : Akki Manith
     * Description : clicked on dolls
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on Dolls.")
    public void i_click_on_dolls() {
        softToysPage.clickDolls();
    }

    /*
     * Method Name : i_click_on_soft_toys_under_toy_type
     * Author Name : Akki Manith
     * Description : clicked on soft toys under toy type
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on Soft Toys Under Toy Type.")
    public void i_click_on_soft_toys_under_toy_type() {
        softToysPage.clickSoftToysUnderToyType();
    }

    /*
     * Method Name : i_verify_brands
     * Author Name : Akki Manith
     * Description : verified brands
     * Return Type : void
     * Parameter list : none
     */
    @When("I verify Brands.")
    public void i_verify_brands() {
        softToysPage.verifyBrands();
    }

    /*
     * Method Name : i_click_on_simulating_senses
     * Author Name : Akki Manith
     * Description : clicked on simulating senses
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on Simulating Senses.")
    public void i_click_on_simulating_senses() {
        softToysPage.clickSimulatingSenses();
    }

    /*
     * Method Name : i_click_on_first_product_soft_toys
     * Author Name : Akki Manith
     * Description : clicked on first product soft toys
     * Return Type : void
     * Parameter list : none
     */
    @When("I click on First Product Soft Toys.")
    public void i_click_on_first_product_soft_toys() {
        softToysPage.clickFirstProductSoftToys();
    }

    /*
     * Method Name : i_verify_home_delivery
     * Author Name : Akki Manith
     * Description : verified home delivery
     * Return Type : void
     * Parameter list : none
     */
    @When("I verify Home Delivery.")
    public void i_verify_home_delivery() {
        softToysPage.verifyHomeDelivery();
        Screenshot.captureScreenShot("ELC");
        Reporter.attachScreenshotToReport("ELC", test, "ELC");
    }
}
