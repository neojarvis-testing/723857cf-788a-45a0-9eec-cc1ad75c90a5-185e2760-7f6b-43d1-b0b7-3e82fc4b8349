package pages;

import org.junit.Assert;

// import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import uistore.HomePageLocators;
import uistore.LearningPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class LearningPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;

    public LearningPage(ExtentTest test)
    {
        helper=new WebDriverHelper(Base.driver);
        this.test=test;


    }

    /*Method Name:clickOnAccept
     * Author Name:Vipul Saxena
     * Description: This methods clicks on accept cookies.
     * Parameters:None
     * return type:void
     */
    

    public void clickOnAccept(){
        try {
            helper.wait(HomePageLocators.accept);
            helper.clickOnElement(HomePageLocators.accept);
        } catch (Exception e) {
        }
    }
      
     /*Method Name:verifyHomePageUrl
     * Author Name:Vipul Saxena
     * Description: This methods verifies homepage url.
     * Parameters:None
     * return type:void
     */
      
    public void verifyHomePageUrl(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.equals(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 5, 0)));
            
            test.log(Status.PASS, "Verified HomePage Url");
            LoggerHandler.info("Verified HomePage Url");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Verified HomePage Url");
            LoggerHandler.info("Not Verified HomePage Url");
        }
    }

    /*Method Name:hoveronlearningskills
     * Author Name:Vipul Saxena
     * Description: This method hovers on learning skills.
     * Parameters:None
     * return type:void
     */

    public void hoveronlearningskills()
    {
        try {
            helper.wait(HomePageLocators.Learningskills);
            helper.hoverOverElement(HomePageLocators.Learningskills);
            test.log(Status.PASS, "Hovered Learningskills");
            LoggerHandler.info("Hovered Learningskills");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Hovered Learningskills");
            LoggerHandler.info("Not Hovered Learningskills");
        }

    }

    /*Method Name:clickoncreativity
     * Author Name:Vipul Saxena
     * Description: This methods clicks on creativity.
     * Parameters:None
     * return type:void
     */

    public void clickoncreativity()
    {
        try {
            helper.wait(HomePageLocators.creativity);
            helper.clickOnElement(HomePageLocators.creativity);
            test.log(Status.PASS, "Clicked on creativity");
            LoggerHandler.info("Clicked on creativity");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on creativity");
            LoggerHandler.info("Not Clicked on creativity");
        }

    }

    

    /*Method Name:creativityurlverify
     * Author Name:Vipul Saxena
     * Description: This methods verifies the creativity page url.
     * Parameters:None
     * return type:void
     */

 public void creativityurlverify()
    {
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 6, 0)));
            test.log(Status.PASS, "Contains creativity");
            LoggerHandler.info("Contains creativity");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Contains creativity");
            LoggerHandler.info("Not Contains creativity");
        }
    }

    /*Method Name:clickonartcraft
     * Author Name:Vipul Saxena
     * Description: This method clicks on art and craft.
     * Parameters:None
     * return type:void
     */

    public void clickonartcraft()
    {
        try {
            helper.wait(LearningPageLocators.artandcraft);
            helper.clickOnElement(LearningPageLocators.artandcraft);
            test.log(Status.PASS, "Clicked on artandcraft");
            LoggerHandler.info("Clicked on artandcraft");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on artandcraft");
            LoggerHandler.info("Not Clicked on artandcraft");
        }

    }

    /*Method Name:clickoncreativityfilter
     * Author Name:Vipul Saxena
     * Description: This method clicks on creativity filter.
     * Parameters:None
     * return type:void
     */

    public void clickoncreativityfilter()
    {
        try {
            helper.wait(LearningPageLocators.creativityfilter);
            helper.clickOnElement(LearningPageLocators.creativityfilter);
            test.log(Status.PASS, "Clicked on creativityfilter");
            LoggerHandler.info("Clicked on creativityfilter");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on creativityfilter");
            LoggerHandler.info("Not Clicked on creativityfilter");
        }

    }

    /*Method Name:clickonartfirstproduct
     * Author Name:Vipul Saxena
     * Description: This methods clicks on first product.
     * Parameters:None
     * return type:void
     */

    public void clickonartfirstproduct()
    {
        try {
            helper.wait(LearningPageLocators.artfirstproduct);
            helper.clickOnElement(LearningPageLocators.artfirstproduct);
            test.log(Status.PASS, "Clicked on artfirstproduct");
            LoggerHandler.info("Clicked on artfirstproduct");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on artfirstproduct");
            LoggerHandler.info("Not Clicked on artfirstproduct");
        }

    }

    /*Method Name:minutesverify
     * Author Name:Vipul Saxena
     * Description: This methods verify "minutes" text
     * Parameters:None
     * return type:void
     */

    public void minutesverify()
    {
        try {
            String text=helper.getText(LearningPageLocators.verifyminutes);
            Assert.assertTrue(text.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 6, 1)));
            test.log(Status.PASS, "Verified minutes");
            LoggerHandler.info("Verified minutes");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Verified minutes");
            LoggerHandler.info("Not Verified minutes");
        }
    }

    /*Method Name:clickartaddtocart
     * Author Name:Vipul Saxena
     * Description: This methods clicks on add to basket.
     * Parameters:None
     * return type:void
     */

    public void clickartaddtocart()
    {
        try {
            helper.wait(LearningPageLocators.addtobasket);
            helper.clickOnElement(LearningPageLocators.addtobasket);
            test.log(Status.PASS, "Clicked on addtobasket");
            LoggerHandler.info("Clicked on addtobasket");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on addtobasket");
            LoggerHandler.info("Not Clicked on addtobasket");
        }

    }

    /*Method Name:clickartcheckout
     * Author Name:Vipul Saxena
     * Description: This methods clicks on checkout.
     * Parameters:None
     * return type:void
     */

    public void clickartcheckout()
    {
        try {
            helper.wait(LearningPageLocators.checkout);
            helper.clickOnElement(LearningPageLocators.checkout);
            test.log(Status.PASS, "Clicked on checkout");
            LoggerHandler.info("Clicked on checkout");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on checkout");
            LoggerHandler.info("Not Clicked on checkout");
        }

    }
     /*Method Name:verifyChechoutPageUrl
     * Author Name:Vipul Saxena
     * Description: This methods verifies checkoutpage url.
     * Parameters:None
     * return type:void
     */
    public void verifyChechoutPageUrl(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.equals(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 5, 1)));
           
            test.log(Status.PASS, "Verified Creativity Page Url");
            LoggerHandler.info("Verified Creativity Page Url");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Verified Creativity Page Url");
            LoggerHandler.info("Not Verified Creativity Page Url");
        }
    }

    /*Method Name:takescreenshot
     * Author Name:Vipul Saxena
     * Description: This method takes screenshot.
     * Parameters:None
     * return type:void
     */

    public void takescreenshot()
    {
        Screenshot.captureScreenShot("Learning product");
    }

  

    
    





}
