package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ElcCars;
import utils.Screenshot;

public class ElcCarsStepdefinition {
    ExtentTest test = Hooks.report.createTest("Elc Cars");
	ElcCars car = new ElcCars(test);
    /* 
     * a.Method Name: i_click_on_aceept 
     * b.Author Name: Pratham Maheshwari
     * c.Description: Accepts the terms by clicking on the accept button.
     * d.Parameter: None
     * e.Return Type: void
     */
    @Given("I click on aceept.")
    public void i_click_on_aceept() {
        car.clickOnAccept();
    }

    /* 
     * a.Method Name: i_verify_the_logo 
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies the presence and correctness of the logo on the page.
     * d.Parameter: None
     * e.Return Type: void
     */
    @When("I verify the logo.")
    public void i_verify_the_logo() {
        car.verifyLogo();
    }

    /* 
     * a.Method Name: i_click_on_search_bar 
     * b.Author Name: Pratham Maheshwari
     * c.Description: Clicks on the search bar to enable it for data input.
     * d.Parameter: None
     * e.Return Type: void
     */
    @When("I click on searchBar")
    public void i_click_on_search_bar() {
        car.clickOnSearchBar();
    }

    /* 
     * a.Method Name: i_enter_data_on_serach_bar 
     * b.Author Name: Pratham Maheshwari
     * c.Description: Enters data into the search bar for querying.
     * d.Parameter: None
     * e.Return Type: void
     */
    @When("I enter data on serachBar.")
    public void i_enter_data_on_serach_bar() {
        car.enterDataOnSearchBar();
    }

    /* 
     * a.Method Name: i_verify_cars_url 
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies the URL for the cars section of the site.
     * d.Parameter: None
     * e.Return Type: void
     */
    @When("I verify cars Url.")
    public void i_verify_cars_url() {
        car.verifyCarUrl();
    }

    /* 
     * a.Method Name: i_click_on_showmore 
     * b.Author Name: Pratham Maheshwari
     * c.Description: Clicks on the 'Show More' button to display additional options.
     * d.Parameter: None
     * e.Return Type: void
     */
    @When("I click on showmore.")
    public void i_click_on_showmore() {
        car.clickOnShowMore();
    }

    /* 
     * a.Method Name: i_click_on_toy_cars 
     * b.Author Name: Pratham Maheshwari
     * c.Description: Clicks on the Toy cars category and verifies navigation.
     * d.Parameter: None
     * e.Return Type: void
     */
    @When("I click on Toy cars.")
    public void i_click_on_toy_cars() {
        car.clickOnToyCars();
    }

    /* 
     * a.Method Name: i_click_on_imaginative_play 
     * b.Author Name: Pratham Maheshwari
     * c.Description: Clicks on the Imaginative Play section and verifies navigation.
     * d.Parameter: None
     * e.Return Type: void
     */
    @When("I click on Imaginative play.")
    public void i_click_on_imaginative_play() {
        car.clickOnImaginativePlay();
    }

    /* 
     * a.Method Name: i_click_on_fine_motor_skills 
     * b.Author Name: Pratham Maheshwari
     * c.Description: Clicks on the Fine Motor Skills category and verifies navigation.
     * d.Parameter: None
     * e.Return Type: void
     */
    @When("I click on Fine motor skills")
    public void i_click_on_fine_motor_skills() {
        car.clickOnFineMotorSkills();
    }

    /* 
     * a.Method Name: i_click_on_first_product 
     * b.Author Name: Pratham Maheshwari
     * c.Description: Clicks on the first product displayed in the category.
     * d.Parameter: None
     * e.Return Type: void
     */
    @When("I click on first Product")
    public void i_click_on_first_product() {
        car.clickOnFirstProduct();
    }

    /* 
     * a.Method Name: i_click_on_wishlist 
     * b.Author Name: Pratham Maheshwari
     * c.Description: Adds the selected product to the wishlist.
     * d.Parameter: None
     * e.Return Type: void
     */
    @Then("I click on wishlist.")
    public void i_click_on_wishlist() {
        car.clickOnWishList();
    }

    /* 
     * a.Method Name: i_navigate_back 
     * b.Author Name: Pratham Maheshwari
     * c.Description: Navigates back to the previous page and captures a screenshot.
     * d.Parameter: None
     * e.Return Type: void
     */
    @Then("I Navigate back.")
    public void i_navigate_back() {
        car.back();
        Screenshot.captureScreenShot("Elc Cars");
    }
}
