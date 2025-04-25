package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LearningPage;

public class LearningStep {
    public static ExtentTest test=Hooks.report.createTest("Test Case 4");
    public LearningPage learn=new LearningPage(test);

        @Given("I navigate to the homepage")
        public void i_navigate_to_the_homepage() {
      
        }
        @When("I accept cookies")
        public void i_accept_cookies() {
            learn.clickOnAccept();
        }
        @When("I verify the homepage URL")
        public void i_verify_the_homepage_url() {
        learn.verifyHomePageUrl();
        }
        @When("I hover over the Learning Skills section")
        public void i_hover_over_the_learning_skills_section() {
        learn.hoveronlearningskills();
        }
        @When("I click on Creativity")
        public void i_click_on_creativity() {
        learn.clickoncreativity();
        }
        @When("I verify the Creativity page URL")
        public void i_verify_the_creativity_page_url() {
        learn.creativityurlverify();
        }
        @When("I click on Art & Craft")
        public void i_click_on_art_craft() {
        learn.clickonartcraft();
        }
        @When("I apply the Creativity filter")
        public void i_apply_the_creativity_filter() {
        learn.clickoncreativityfilter();
        }
        @When("I click on the first product")
        public void i_click_on_the_first_product() {
        learn.clickonartfirstproduct();
        }
        @When("I verify the {string} text on the product page")
        public void i_verify_the_text_on_the_product_page(String string) {
        learn.minutesverify();
        }
        @When("I add the product to the basket")
        public void i_add_the_product_to_the_basket() {
        learn.clickartaddtocart();
        }
        @When("I proceed to checkout")
        public void i_proceed_to_checkout() {
        learn.clickartcheckout();
        }
        @Then("I should be navigated to the correct checkout page URL")
        public void i_should_be_navigated_to_the_correct_checkout_page_url() {
        learn.verifyChechoutPageUrl();
        }
        @Then("a screenshot should be captured")
        public void a_screenshot_should_be_captured() {
        learn.takescreenshot();
        }
        }
