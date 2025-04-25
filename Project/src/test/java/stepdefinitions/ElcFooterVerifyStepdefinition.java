package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Elcfooterverify;

public class ElcFooterVerifyStepdefinition {
    ExtentTest test = Hooks.report.createTest("Elc Footer Verification");
	Elcfooterverify footer = new Elcfooterverify(test);
    @Given("I click on accept.")
public void i_click_on_accept() {
    footer.clickOnAccept();
}
@When("I click on contact Us.")
public void i_click_on_contact_us() {
    footer.clickOnContactUs();
}
@When("I verify the contactUS URL.")
public void i_verify_the_contact_us_url() {
    footer.verifyContactUsUrl();
}
@When("I click on Delivery Option.")
public void i_click_on_delivery_option() {
    footer.clickOnDeliveryOption();
}
@When("I verify the Deliery option URL.")
public void i_verify_the_deliery_option_url() {
    footer.verifyDeliveryOptionUrl();
}
@When("I click on Product Safety Notices.")
public void i_click_on_product_safety_notices() {
    footer.clickOnproductSafetyNotices();
}
@When("I verify the Product Safety URL.")
public void i_verify_the_product_safety_url() {
    footer.verifyProductSafetyUrl();
}
@When("I click on Returns.")
public void i_click_on_returns() {
    footer.clickOnReturn();
}
@When("I verify the Returns URL.")
public void i_verify_the_returns_url() {
    footer.verifyReturnsUrl();
}
@When("I click on Track your order.")
public void i_click_on_track_your_order() {
    footer.clickOnTrackYourOrder();
}
@When("I verify the Track your order URL.")
public void i_verify_the_track_your_order_url() {
    footer.verifyTrackYourOrderUrl();
}
@When("I click on HelpCentre.")
public void i_click_on_help_centre() {
    footer.clickOnHelpCentre();
}
@When("I verify the Help Centre URL.")
public void i_verify_the_help_centre_url() {
    footer.verifyHelpCentreUrl();
}
@When("I click on Privacy Policy.")
public void i_click_on_privacy_policy() {
    footer.clickOnYourPrivacy();
}
@When("I verify the Privacy Policy URL.")
public void i_verify_the_privacy_policy_url() {
    footer.verifyYourPrivacyUrl();
}
@When("I click on How to complain.")
public void i_click_on_how_to_complain() {
    footer.clickOnHowToComplain();
}
@When("I verify the How to complain URL.")
public void i_verify_the_how_to_complain_url() {
    footer.verifyHowToComplainUrl();
}
@Then("I verify About us.")
public void i_verify_about_us() {
    footer.verifyAboutUs();
}
}
