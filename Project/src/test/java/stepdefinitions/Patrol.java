package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PawPatrolHomePage;

public class Patrol {

    public static ExtentTest test = Hooks.report.createTest("testcase5");
    public static PawPatrolHomePage pawPatrolHomePage = new PawPatrolHomePage(test);
    /*
     * a.Method Name: i_click_on_accept_cookies
     * b.Author Name: karthik
     * c.Description: Clicks on the AcceptCookies.
     * d.Parameter: None
     * e.Return Type: void
     */
 
@Given("I click on Accept Cookies.")
public void i_click_on_accept_cookies() {
    pawPatrolHomePage.clickOnAcceptCookies();
}
 /*
     * a.Method Name: i_hover_over_the_brands_section
     * b.Author Name: karthik
     * c.Description: I hover over the Brands section
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I hover over the Brands section.")
public void i_hover_over_the_brands_section() {
    pawPatrolHomePage.hoverOnBrands();
}
 /*
     * a.Method Name: i_click_on_paw_patrol.
     * b.Author Name: karthik
     * c.Description: I click on Paw Patrol.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on Paw Patrol.")
public void i_click_on_paw_patrol() {
    pawPatrolHomePage.ClickOnPawPatrol();
    
}
 /*
     * a.Method Name: i_verify_the_url_matches_the_page
     * b.Author Name: karthik
     * c.Description: I verify the URL matches the page.
     * d.Parameter: None
     * e.Return Type: void
     */
@Then("I verify the URL matches the page.")
public void i_verify_the_url_matches_the_page() {
    pawPatrolHomePage.verifyurl();  
}
 /*
     * a.Method Name: i_click_on_playsets_action_figures
     * b.Author Name: karthik
     * c.Description: I click on Playsets & Action Figures.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on Playsets & Action Figures.")
public void i_click_on_playsets_action_figures() {
    pawPatrolHomePage.ClickonPlaysetsAction();  
}
 /*
     * a.Method Name: i_verify_the_filters_are_working_correctly
     * b.Author Name: karthik
     * c.Description: I verify the filters are working correctly.
     * d.Parameter: None
     * e.Return Type: void
     */
@Then("I verify the filters are working correctly.")
public void i_verify_the_filters_are_working_correctly() {
    pawPatrolHomePage.VerifyNarrow();  
}
 /*
     * a.Method Name: i_click_on_the_savings_section
     * b.Author Name: karthik
     * c.Description: I click on the Savings section.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on the Savings section.")
public void i_click_on_the_savings_section() {
    pawPatrolHomePage.ClickOnSavings();  
}
 /*
     * a.Method Name: i_click_on_a_specific_product
     * b.Author Name: karthik
     * c.Description: I click on a specific product.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on a specific product.")
public void i_click_on_a_specific_product() {
    pawPatrolHomePage.ClickOnProduct();
}
 /*
     * a.Method Name: i_verify_the_product_is_available
     * b.Author Name: karthik
     * c.Description: I verify the product is available.
     * d.Parameter: None
     * e.Return Type: void
     */
@Then("I verify the product is available.")
public void i_verify_the_product_is_available() {
    pawPatrolHomePage.VerifyAvailable();
}
 /*
     * a.Method Name: i_click_on_add_to_basket
     * b.Author Name: karthik
     * c.Description: I click on Add to Basket
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on Add to Basket.")
public void i_click_on_add_to_basket() {
    pawPatrolHomePage.ClickOnAddtoBasket();
    
}
 /*
     * a.Method Name:i_proceed_to_check_out
     * b.Author Name: karthik
     * c.Description: I proceed to Check Out
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I proceed to Check Out.")
public void i_proceed_to_check_out() {
    pawPatrolHomePage.ClickOnCheckOut();
    
}
 /*
     * a.Method Name: i_verify_the_basket_contains_the_selected_items
     * b.Author Name: karthik
     * c.Description: I verify the basket contains the selected items.
     * d.Parameter: None
     * e.Return Type: void
     */
@Then("I verify the basket contains the selected items.")
public void i_verify_the_basket_contains_the_selected_items() {
    pawPatrolHomePage.verifyBasket();
    
}



    
}
