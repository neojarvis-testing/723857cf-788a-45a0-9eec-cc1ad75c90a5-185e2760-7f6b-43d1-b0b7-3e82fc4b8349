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
    @Given("I click on aceept.")
    public void i_click_on_aceept() {
        car.clickOnAccept();
    }
    @When("I verify the logo.")
    public void i_verify_the_logo() {
        car.verifyLogo();
    }
    @When("I click on searchBar")
    public void i_click_on_search_bar() {
        car.clickOnSearchBar();
    }
    @When("I enter data on serachBar.")
    public void i_enter_data_on_serach_bar() {
        car.enterDataOnSearchBar();
    }
    @When("I verify cars Url.")
    public void i_verify_cars_url() {
        car.verifyCarUrl();
    }
    @When("I click on showmore.")
    public void i_click_on_showmore() {
        car.clickOnShowMore();
    }
    @When("I click on Toy cars.")
    public void i_click_on_toy_cars() {
        car.clickOnToyCars();
    }
    @When("I click on Imaginative play.")
    public void i_click_on_imaginative_play() {
        car.clickOnImaginativePlay();
    }
    @When("I click on Fine motor skills")
    public void i_click_on_fine_motor_skills() {
        car.clickOnFineMotorSkills();
    }
    @When("I click on first Product")
    public void i_click_on_first_product() {
        car.clickOnFirstProduct();
    }
    @Then("I click on wishlist.")
    public void i_click_on_wishlist() {
        car.clickOnWishList();
    }
    @Then("I Navigate back.")
    public void i_navigate_back() {
        car.back();
        Screenshot.captureScreenShot("Elc Cars");
    }
}
