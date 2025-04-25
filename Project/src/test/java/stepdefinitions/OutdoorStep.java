package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OutdoorToysPage;

public class OutdoorStep {
    public static ExtentTest test=Hooks.report.createTest("Test Case 3");
    public OutdoorToysPage out=new OutdoorToysPage(test);
       


        /* Method Name: i_hover_over_the_outdoor_toys_section
     * Author Name: Vipul Saxena
     * Description: This method hovers over the Outdoor Toys section.
     * Parameters: None
     * Return type: void
     */
        @When("I hover over the Outdoor Toys section")
        public void i_hover_over_the_outdoor_toys_section() {
        out.clickOnAccept();
        // out.verifyHomePageUrl();
        out.hoveronoutdoortoys();
        }

     /* Method Name: i_click_on_bikes
     * Author Name: Vipul Saxena
     * Description: This method clicks on the Bikes section.
     * Parameters: None
     * Return type: void
     */
        @When("I click on Bikes")
        public void i_click_on_bikes() {
        out.clickonbikes();
        }

    /* Method Name: i_verify_the_bikes_page_url
     * Author Name: Vipul Saxena
     * Description: This method verifies the Bikes page URL.
     * Parameters: None
     * Return type: void
     */
        @When("I verify the Bikes page URL")
        public void i_verify_the_bikes_page_url() {
        // out.bikesurlverify();
        }

       
    /* Method Name: i_click_on_huffy
     * Author Name: Vipul Saxena
     * Description: This method clicks on the Huffy section.
     * Parameters: None
     * Return type: void
     */
        @When("I click on Huffy")
        public void i_click_on_huffy() {
        out.clickonhuffy();
        }

      
    /* Method Name: i_click_on_toddler_bikes
     * Author Name: Vipul Saxena
     * Description: This method clicks on Toddler Bikes.
     * Parameters: None
     * Return type: void
     */

        @When("I click on Toddler Bikes")
        public void i_click_on_toddler_bikes() {
        out.ClickonToddlerBikes();
        }

    /*Method Name:i_verify_the_search_functionality
     * Author Name:Vipul Saxena
     * Description: This methods verifies search.
     * Parameters:None
     * return type:void
    */


        @When("I verify the search functionality")
        public void i_verify_the_search_functionality() {
        // out.searchverify();
        }

    /* Method Name: i_click_on_disney
     * Author Name: Vipul Saxena
     * Description: This method clicks on Disney and adds a product to the basket.
     * Parameters: None
     * Return type: void
     */

        @When("I click on Disney")
        public void i_click_on_disney() {
        out.Clickondisney();
        out.clickFirstProduct();
        out.clickaddtobasket();
        }

       
    /* Method Name: i_should_be_navigated_to_the_correct_checkout_page
     * Author Name: Vipul Saxena
     * Description: This method navigates to the correct checkout page and takes a screenshot.
     * Parameters: None
     * Return type: void
     */

        @Then("I should be navigated to the correct checkout page")
        public void i_should_be_navigated_to_the_correct_checkout_page() {
        out.clickoncheckout();
        // out.verifycheckout();
        out.takescreenshot();
        }

        }




   