package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LearningPage;

public class LearningStep {
    public static ExtentTest test=Hooks.report.createTest("Test Case 4");
    public LearningPage learn=new LearningPage(test);


    /*Method Name:i_navigate_to_the_homepage
     * Author Name:Vipul Saxena
     * Description: Navigates to home page by default.
     * Parameters:None
     * return type:void
     */
        @Given("I navigate to the homepage")
        public void i_navigate_to_the_homepage() {
      
        }

 
    /* Method Name: i_accept_cookies
     * Author Name: Vipul Saxena
     * Description: This method accepts cookies on the homepage.
     * Parameters: None
     * Return type: void
     */



        @When("I accept cookies")
        public void i_accept_cookies() {
            learn.clickOnAccept();
        }

    /* Method Name: i_verify_the_homepage_url
     * Author Name: Vipul Saxena
     * Description: This method verifies the homepage URL.
     * Parameters: None
     * Return type: void
     */


        @When("I verify the homepage URL")
        public void i_verify_the_homepage_url() {
        // learn.verifyHomePageUrl();
        }

    /* Method Name: i_hover_over_the_learning_skills_section
     * Author Name: Vipul Saxena
     * Description: This method hovers over the Learning Skills section.
     * Parameters: None
     * Return type: void
     */

        @When("I hover over the Learning Skills section")
        public void i_hover_over_the_learning_skills_section() {
        learn.hoveronlearningskills();
        }

   /* Method Name: i_click_on_creativity
     * Author Name: Vipul Saxena
     * Description: This method clicks on the Creativity section.
     * Parameters: None
     * Return type: void
     */

        @When("I click on Creativity")
        public void i_click_on_creativity() {
        learn.clickoncreativity();
        }

    /* Method Name: i_verify_the_creativity_page_url
     * Author Name: Vipul Saxena
     * Description: This method verifies the Creativity page URL.
     * Parameters: None
     * Return type: void
     */

        @When("I verify the Creativity page URL")
        public void i_verify_the_creativity_page_url() {
        learn.creativityurlverify();
        }

    /* Method Name: i_click_on_art_craft
     * Author Name: Vipul Saxena
     * Description: This method clicks on Art & Craft.
     * Parameters: None
     * Return type: void
     */

        @When("I click on Art & Craft")
        public void i_click_on_art_craft() {
        learn.clickonartcraft();
        }

    /* Method Name: i_apply_the_creativity_filter
     * Author Name: Vipul Saxena
     * Description: This method applies the Creativity filter.
     * Parameters: None
     * Return type: void
     */

        @When("I apply the Creativity filter")
        public void i_apply_the_creativity_filter() {
        learn.clickoncreativityfilter();
        }


    /* Method Name: i_click_on_the_first_product
     * Author Name: Vipul Saxena
     * Description: This method clicks on the first product in the list.
     * Parameters: None
     * Return type: void
     */

        @When("I click on the first product")
        public void i_click_on_the_first_product() {
        learn.clickonartfirstproduct();
        }


    /* Method Name: i_verify_the_text_on_the_product_page
     * Author Name: Vipul Saxena
     * Description: This method verifies the given text on the product page.
     * Parameters: String
     * Return type: void
     */

        @When("I verify the {string} text on the product page")
        public void i_verify_the_text_on_the_product_page(String string) {
        // learn.minutesverify();
        }

    /* Method Name: i_add_the_product_to_the_basket
     * Author Name: Vipul Saxena
     * Description: This method adds the product to the basket.
     * Parameters: None
     * Return type: void
     */

        @When("I add the product to the basket")
        public void i_add_the_product_to_the_basket() {
        learn.clickartaddtocart();
        }

  /* Method Name: i_proceed_to_checkout
     * Author Name: Vipul Saxena
     * Description: This method proceeds to the checkout page.
     * Parameters: None
     * Return type: void
     */


        @When("I proceed to checkout")
        public void i_proceed_to_checkout() {
        learn.clickartcheckout();
        }

    
    /* Method Name: i_should_be_navigated_to_the_correct_checkout_page_url
     * Author Name: Vipul Saxena
     * Description: This method verifies navigation to the correct checkout page URL.
     * Parameters: None
     * Return type: void
     */

        @Then("I should be navigated to the correct checkout page URL")
        public void i_should_be_navigated_to_the_correct_checkout_page_url() {
        // learn.verifyChechoutPageUrl();
        }

        /*Method Name:takescreenshot
     * Author Name:Vipul Saxena
     * Description: This methods hovers on outdoor toys.
     * Parameters:None
     * return type:void
     */

        @Then("a screenshot should be captured")
        public void a_screenshot_should_be_captured() {
        learn.takescreenshot();
            }
        }



           















  

  