package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OutdoorToysPage;

public class OutdoorStep {
    public static ExtentTest test=Hooks.report.createTest("Test Case 3");
    public OutdoorToysPage out=new OutdoorToysPage(test);

        @When("I hover over the Outdoor Toys section")
        public void i_hover_over_the_outdoor_toys_section() {
        out.clickOnAccept();
        out.verifyHomePageUrl();
        out.hoveronoutdoortoys();
        }
        @When("I click on Bikes")
        public void i_click_on_bikes() {
        out.clickonbikes();
        }
        @When("I verify the Bikes page URL")
        public void i_verify_the_bikes_page_url() {
        out.bikesurlverify();
        }
        @When("I click on Huffy")
        public void i_click_on_huffy() {
        out.clickonhuffy();
        }
        @When("I click on Toddler Bikes")
        public void i_click_on_toddler_bikes() {
        out.ClickonToddlerBikes();
        }
        @When("I verify the search functionality")
        public void i_verify_the_search_functionality() {
        out.searchverify();
        }
        @When("I click on Disney")
        public void i_click_on_disney() {
        out.Clickondisney();
        out.clickFirstProduct();
        out.clickaddtobasket();
        }
        @Then("I should be navigated to the correct checkout page")
        public void i_should_be_navigated_to_the_correct_checkout_page() {
        out.clickoncheckout();
        out.verifycheckout();
        out.takescreenshot();
        }

        }
