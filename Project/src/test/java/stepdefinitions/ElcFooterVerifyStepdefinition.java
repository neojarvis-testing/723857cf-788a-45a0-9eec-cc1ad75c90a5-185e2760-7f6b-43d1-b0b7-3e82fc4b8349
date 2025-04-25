package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Elcfooterverify;

public class ElcFooterVerifyStepdefinition {
    ExtentTest test = Hooks.report.createTest("Elc Footer Verification");
	Elcfooterverify footer = new Elcfooterverify(test);
    /* 
        * a.Method Name: i_click_on_accept 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Accepts the terms by clicking on the accept button.
        * d.Parameter: None
        * e.Return Type: void
    */
    @Given("I click on accept.")
    public void i_click_on_accept() {
        footer.clickOnAccept();
}

    /* 
        * a.Method Name: i_click_on_contact_us 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Navigates to the "Contact Us" page by clicking on the respective button.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I click on contact Us.")
    public void i_click_on_contact_us() {
        footer.clickOnContactUs();
    }

    /* 
        * a.Method Name: i_verify_the_contact_us_url 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Verifies the URL of the "Contact Us" page for accuracy.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I verify the contactUS URL.")
    public void i_verify_the_contact_us_url() {
        footer.verifyContactUsUrl();
    }

    /* 
        * a.Method Name: i_click_on_delivery_option 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Navigates to the "Delivery Option" page by clicking on the respective link.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I click on Delivery Option.")
    public void i_click_on_delivery_option() {
        footer.clickOnDeliveryOption();
    }

    /* 
        * a.Method Name: i_verify_the_deliery_option_url 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Verifies the URL of the "Delivery Option" page for accuracy.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I verify the Deliery option URL.")
    public void i_verify_the_deliery_option_url() {
        footer.verifyDeliveryOptionUrl();
    }

    /* 
        * a.Method Name: i_click_on_product_safety_notices 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Navigates to the "Product Safety Notices" page by clicking on the respective link.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I click on Product Safety Notices.")
    public void i_click_on_product_safety_notices() {
        footer.clickOnproductSafetyNotices();
    }

    /* 
        * a.Method Name: i_verify_the_product_safety_url 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Verifies the URL of the "Product Safety Notices" page for accuracy.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I verify the Product Safety URL.")
    public void i_verify_the_product_safety_url() {
        footer.verifyProductSafetyUrl();
    }

    /* 
        * a.Method Name: i_click_on_returns 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Navigates to the "Returns" page by clicking on the respective link.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I click on Returns.")
    public void i_click_on_returns() {
        footer.clickOnReturn();
    }

    /* 
        * a.Method Name: i_verify_the_returns_url 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Verifies the URL of the "Returns" page for accuracy.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I verify the Returns URL.")
    public void i_verify_the_returns_url() {
        footer.verifyReturnsUrl();
    }

    /* 
        * a.Method Name: i_click_on_track_your_order 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Navigates to the "Track Your Order" page by clicking on the respective link.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I click on Track your order.")
    public void i_click_on_track_your_order() {
        footer.clickOnTrackYourOrder();
    }

    /* 
        * a.Method Name: i_verify_the_track_your_order_url 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Verifies the URL of the "Track Your Order" page for accuracy.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I verify the Track your order URL.")
    public void i_verify_the_track_your_order_url() {
        footer.verifyTrackYourOrderUrl();
    }

    /* 
        * a.Method Name: i_click_on_help_centre 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Navigates to the "Help Centre" page by clicking on the respective link.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I click on HelpCentre.")
    public void i_click_on_help_centre() {
        footer.clickOnHelpCentre();
    }

    /* 
        * a.Method Name: i_verify_the_help_centre_url 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Verifies the URL of the "Help Centre" page for accuracy.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I verify the Help Centre URL.")
    public void i_verify_the_help_centre_url() {
        footer.verifyHelpCentreUrl();
    }

    /* 
        * a.Method Name: i_click_on_privacy_policy 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Navigates to the "Privacy Policy" page by clicking on the respective link.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I click on Privacy Policy.")
    public void i_click_on_privacy_policy() {
        footer.clickOnYourPrivacy();
    }

    /* 
        * a.Method Name: i_verify_the_privacy_policy_url 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Verifies the URL of the "Privacy Policy" page for accuracy.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I verify the Privacy Policy URL.")
    public void i_verify_the_privacy_policy_url() {
        footer.verifyYourPrivacyUrl();
    }

    /* 
        * a.Method Name: i_click_on_how_to_complain 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Navigates to the "How to Complain" page by clicking on the respective link.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I click on How to complain.")
    public void i_click_on_how_to_complain() {
        footer.clickOnHowToComplain();
    }

    /* 
        * a.Method Name: i_verify_the_how_to_complain_url 
        * b.Author Name: Pratham Maheshwari
        * c.Description: Verifies the URL of the "How to Complain" page for accuracy.
        * d.Parameter: None
        * e.Return Type: void
    */
    @When("I verify the How to complain URL.")
    public void i_verify_the_how_to_complain_url() {
        footer.verifyHowToComplainUrl();
    }

    /* 
    * a.Method Name: i_verify_about_us 
    * b.Author Name: Pratham Maheshwari
    * c.Description: Verifies the content and URL of the "About Us" page.
    * d.Parameter: None
    * e.Return Type: void
    */
    @Then("I verify About us.")
    public void i_verify_about_us() {
        footer.verifyAboutUs();
    }
}
