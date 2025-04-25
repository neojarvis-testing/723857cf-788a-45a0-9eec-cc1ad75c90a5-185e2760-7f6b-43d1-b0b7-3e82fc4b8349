package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FooterPage;

public class Footer {
    public static ExtentTest test = Hooks.report.createTest("testcase10");
    public static FooterPage footerPage = new FooterPage(test);
     /*
     * a.Method Name: i_click_on_accept_cookie
     * b.Author Name: SaiKiran
     * c.Description: click on Accept Cookie.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on Accept Cookie.")
public void i_click_on_accept_cookie() {
    footerPage.clickOnAcceptCookies();

}
/*
     * a.Method Name: i_click_on_about_us
     * b.Author Name: SaiKiran
     * c.Description:  click on About Us.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on About Us.")
public void i_click_on_about_us() {
    footerPage.clickOnAboutUs();

}
/*
     * a.Method Name: i_verify_the_url_for_about_us
     * b.Author Name: SaiKiran
     * c.Description: verify the URL for About Us.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I verify the URL for About Us.")
public void i_verify_the_url_for_about_us() {
    footerPage.verifyAboutUsUrl();

}
/*
     * a.Method Name: i_click_on_store_finder
     * b.Author Name: SaiKiran
     * c.Description:  click on Store Finder.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on Store Finder.")
public void i_click_on_store_finder() {
    footerPage.clickOnStoreFinder();

}
/*
     * a.Method Name: i_verify_the_url_for_store_finder
     * b.Author Name: SaiKiran
     * c.Description: verify the URL for Store Finder
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I verify the URL for Store Finder.")
public void i_verify_the_url_for_store_finder() {
    footerPage.verifyStoreFindUrl();

}
/*
     * a.Method Name: i_click_on_weee_regulations
     * b.Author Name: SaiKiran
     * c.Description: click on WEEE Regulations.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on WEEE Regulations.")
public void i_click_on_weee_regulations() {
    footerPage.clickOnWEERegulations();

}
/*
     * a.Method Name: i_verify_the_url_for_weee_regulations
     * b.Author Name: SaiKiran
     * c.Description: verify the URL for WEEE Regulations
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I verify the URL for WEEE Regulations.")
public void i_verify_the_url_for_weee_regulations() {
    footerPage.verifyWEERegulationsUrl();

}
/*
     * a.Method Name: i_click_on_press
     * b.Author Name: SaiKiran
     * c.Description:  click on Press.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on Press.")
public void i_click_on_press() {
    footerPage.clickOnPress();

}
/*
     * a.Method Name: i_verify_the_url_for_press
     * b.Author Name: SaiKiran
     * c.Description: verify the URL for Press.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I verify the URL for Press.")
public void i_verify_the_url_for_press() {
    footerPage.verifyPressUrl();

}
/*
     * a.Method Name: i_click_on_affiliates
     * b.Author Name: SaiKiran
     * c.Description: I click on Affiliates
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on Affiliates.")
public void i_click_on_affiliates() {
    footerPage.clickOnAffilates();

}
/*
     * a.Method Name: i_verify_the_url_for_affiliates
     * b.Author Name: SaiKiran
     * c.Description: verify the URL for Affiliates.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I verify the URL for Affiliates.")
public void i_verify_the_url_for_affiliates() {
    footerPage.verifyAffilatesUrl();

}
/*
     * a.Method Name: i_click_on_careers
     * b.Author Name: SaiKiran
     * c.Description: click on Careers.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on Careers.")
public void i_click_on_careers() {
    footerPage.clickOnCareers();

}
/*
     * a.Method Name: i_verify_the_url_for_careers
     * b.Author Name: SaiKiran
     * c.Description: verify the URL for Careers.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I verify the URL for Careers.")
public void i_verify_the_url_for_careers() {
    footerPage.verifyCareersUrl();

}
/*
     * a.Method Name: i_click_on_gift_card
     * b.Author Name: SaiKiran
     * c.Description: click on Gift Card
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on Gift Card.")
public void i_click_on_gift_card() {
    footerPage.clickOnGiftCard();

}
/*
     * a.Method Name: i_verify_the_url_for_gift_card
     * b.Author Name: SaiKiran
     * c.Description: verify the URL for Gift Card.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I verify the URL for Gift Card.")
public void i_verify_the_url_for_gift_card() {
    footerPage.verifyGiftCardUrl();

}
/*
     * a.Method Name: i_click_on_klarna
     * b.Author Name: SaiKiran
     * c.Description: click on Klarna
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I click on Klarna.")
public void i_click_on_klarna() {
    footerPage.clickOnKlarna();

}
/*
     * a.Method Name: i_verify_the_url_for_klarna
     * b.Author Name: SaiKiran
     * c.Description: verify the URL for Klarna.
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I verify the URL for Klarna.")
public void i_verify_the_url_for_klarna() {
    footerPage.verifyKlarnaUrl();

}
/*
     * a.Method Name: i_verify_the_text_for_useful_links
     * b.Author Name: SaiKiran
     * c.Description: verify the text for Useful Links
     * d.Parameter: None
     * e.Return Type: void
     */
@When("I verify the text for Useful Links.")
public void i_verify_the_text_for_useful_links() {
    footerPage.verifyUsefulLinksText();

}
/*
     * a.Method Name: i_capture_the_website
     * b.Author Name: SaiKiran
     * c.Description: capture the website.
     * d.Parameter: None
     * e.Return Type: void
     */
@Then("I capture the website.")
public void i_capture_the_website() {
    footerPage.captureWebSite();

}
    

    

    

}
