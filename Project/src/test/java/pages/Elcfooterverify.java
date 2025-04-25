package pages;



import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class Elcfooterverify {
    ExtentTest test;
    WebDriverHelper helper;
    public static final String sheetsName = "Sheet1";
    public static final String dirsPath = "/testData/ELCData.xlsx";
    public static final String userCommonPath ="user.dir" ;
    
    public Elcfooterverify(ExtentTest test){
        helper= new WebDriverHelper(Base.driver);
        this.test =test;
    }


    /*
     * a.Method Name: clickOnAccept
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the accept button to accept the cookies.
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnAccept(){
        try {
            helper.wait(HomePageLocators.accept);
            helper.clickOnElement(HomePageLocators.accept);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a.Method Name: clickOnContactUs
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the contact us button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnContactUs(){
        try {
            helper.scrollToFooter();
            Thread.sleep(500);
            helper.wait(HomePageLocators.contactUs);
            helper.clickOnElement(HomePageLocators.contactUs);
            LoggerHandler.info("Clicked on Contact us");
            test.log(Status.INFO, "Clicked on Contacts us");
        } catch (InterruptedException e) {
            LoggerHandler.error("Not able to click on Contact us");
            test.log(Status.FAIL, "Not able to clicks on Contact us");
        }
    }

    /*
     * a.Method Name: verifyCarUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current page URL matches the expected "Contact Us" article link..
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyContactUsUrl(){
        try {
            String str = Base.driver.getTitle();
            String x = Base.driver.getCurrentUrl();
            Assert.assertEquals(x,ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 10, 0));
            LoggerHandler.info("Verified ContactUs URL");
            test.log(Status.PASS, "Cars ContactUs URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify ContactUs URL");
            test.log(Status.FAIL, "ContactUs URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnDeliveryOption
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the Delivery Option button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnDeliveryOption(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.delivery);
            helper.clickOnElement(HomePageLocators.delivery);
            LoggerHandler.info("Clicked on Delivery options");
            test.log(Status.INFO, "Clicked on Delivery option");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Delivery option");
            test.log(Status.FAIL, "Not able to click on Delivery options");
        }
    }

    /*
     * a.Method Name: verifyDeliveryOptionUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current page URL matches the expected "Delivery Option" article link..
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyDeliveryOptionUrl(){
        try {
            String str = Base.driver.getTitle();
            String x = Base.driver.getCurrentUrl();
            Assert.assertEquals(x,ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 10, 1));
            LoggerHandler.info("Verified Delivery Options URL");
            test.log(Status.PASS, "Verified Delivery Option URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Delivery Options URL");
            test.log(Status.FAIL, "Delivery Option URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnproductSafetyNotices
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the Product safety notices button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnproductSafetyNotices(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.productSafety);
            helper.clickOnElement(HomePageLocators.productSafety);
            LoggerHandler.info("Clicked on Products Safety Notices");
            test.log(Status.INFO, "Clicked on Product Safety Notices");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Products Safety Notices");
            test.log(Status.FAIL, "Not able to click on Product Safety Notices");
        }
    }

    /*
     * a.Method Name: verifyProductSafetyUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current page URL matches the expected "Product Safety notices" article link.
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyProductSafetyUrl(){
        try {
            String str = Base.driver.getTitle();
            String x = Base.driver.getCurrentUrl();
            Assert.assertEquals(x,ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 10, 2));
            LoggerHandler.info("Verified Product Safety notices URL");
            test.log(Status.PASS, "Verified Product Safety notice URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Product Safety notices URL");
            test.log(Status.FAIL, "Product Safety notices URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnReturn
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the Returns button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnReturn(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.returns);
            helper.clickOnElement(HomePageLocators.returns);
            LoggerHandler.info("Clicked on Returns");
            test.log(Status.INFO, "Clicked on Return");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Returns");
            test.log(Status.FAIL, "Not able to click on Return");
        }
    }

    /*
     * a.Method Name: verifyReturnsUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description:Verifies that the current page URL matches the expected "Return" article link.
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyReturnsUrl(){
        try {
            String str = Base.driver.getTitle();
            String x = Base.driver.getCurrentUrl();
            Assert.assertEquals(x,ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 10, 3));
            LoggerHandler.info("Verified Returns URL");
            test.log(Status.PASS, "Verified Return URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Returns URL");
            test.log(Status.FAIL, "Returns URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnTrackYourOrder
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the Track your order button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnTrackYourOrder(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.trackYourOrder);
            helper.clickOnElement(HomePageLocators.trackYourOrder);
            LoggerHandler.info("Clicked on Track your Orders");
            test.log(Status.INFO, "Clicked on Track your Order");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Track your Orders");
            test.log(Status.FAIL, "Not able to click on Track your Order");
        }
    }

    /*
     * a.Method Name: verifyTrackYourOrderUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current page URL matches the expected "Track Your Order" article link.
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyTrackYourOrderUrl(){
        try {
            String str = Base.driver.getTitle();
            String x = Base.driver.getCurrentUrl();
            Assert.assertEquals(x,ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 10, 4));
            LoggerHandler.info("Verified Track your Order URL");
            test.log(Status.PASS, "Verified Track your Orders URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Track your Order URL");
            test.log(Status.FAIL, "Track your Order URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnHelpCentre
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the Help Centre button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnHelpCentre(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.helpCenter);
            helper.clickOnElement(HomePageLocators.helpCenter);
            LoggerHandler.info("Clicked on Help Centre");
            test.log(Status.INFO, "Clicked on Help Centres");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Help Centre");
            test.log(Status.FAIL, "Not able to click on Help Centres");
        }
    }

    /*
     * a.Method Name: verifyHelpCentreUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description:Verifies that the current page URL matches the expected "Help centre" article link.
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyHelpCentreUrl(){
        try {
            String str = Base.driver.getTitle();
            String x = Base.driver.getCurrentUrl();
            Assert.assertEquals(x,ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 10, 5));
            LoggerHandler.info("Verified Help Centre URL");
            test.log(Status.PASS, "Verified Help Centre URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Help Centre URL");
            test.log(Status.FAIL, "Help Centre URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnYourPrivacy
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the Your Privacy button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnYourPrivacy(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.privacyPolicy);
            helper.clickOnElement(HomePageLocators.privacyPolicy);
            LoggerHandler.info("Clicked on Your Privacy");
            test.log(Status.INFO, "Clicked on Your Privacy");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Your Privacy");
            test.log(Status.FAIL, "Not able to click on Your Privacy");
        }
    }

    /*
     * a.Method Name: verifyYourPrivacyUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current page URL matches the expected "Your Privacy" article link.
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyYourPrivacyUrl(){
        try {
            String str = Base.driver.getTitle();
            String x = Base.driver.getCurrentUrl();
            Assert.assertEquals(x,ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 10, 6));
            LoggerHandler.info("Verified Your Privacy URL");
            test.log(Status.PASS, "Verified Your Privacy URL");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Your Privacy URL");
            test.log(Status.FAIL, "Your Privacy URL not verified");
        }
    }

    /*
     * a.Method Name: clickOnHowToComplain
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the How to complain button in the footer
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnHowToComplain(){
        try {
            helper.scrollToFooter();
            helper.wait(HomePageLocators.howToComplain);
            helper.clickOnElement(HomePageLocators.howToComplain);
            LoggerHandler.info("Clicked on How to Complain");
            test.log(Status.INFO, "Clicked on How to Complain");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on How to Complain");
            test.log(Status.FAIL, "Not able to click on How to Complain");
        }
    }
       
    /*
     * a.Method Name: verifyHowToComplainUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current page URL matches the expected "How to Complain" article link.
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyHowToComplainUrl(){
        try {
            String str = Base.driver.getTitle();
            String x = Base.driver.getCurrentUrl();
            Assert.assertEquals(x,ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 10, 7));
            LoggerHandler.info("Verified How to complain URL");
            test.log(Status.PASS, "Verified How to complain URL");
            Base.driver.navigate().back();
            test.log(Status.PASS, "navigate back to home page");
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify How to complain URL");
            test.log(Status.FAIL, "How to complain URL not verified");
        }
    }
    /*
     * a.Method Name: verifyAboutUs
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies keyword "About us " present in the footer section.
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyAboutUs(){
        try {
            String str = helper.getText(HomePageLocators.about);
            Assert.assertEquals(str,ExcelReader.readData(System.getProperty(userCommonPath)+dirsPath, sheetsName, 10, 8));
            LoggerHandler.info("Verified Keyword 'About Us'");
            test.log(Status.PASS, "Verified Keyword 'About Us'");
            Base.driver.navigate().back();
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Keyword 'About Us'");
            test.log(Status.FAIL, "Keyword 'About Us' not verified");
        }
    }
    
}

