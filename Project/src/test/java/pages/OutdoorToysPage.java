package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.OutdoorPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class OutdoorToysPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;

    public OutdoorToysPage(ExtentTest test)
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
            e.printStackTrace();
        }
    }

      /*Method Name:verifyHomePageUrl
     * Author Name:Vipul Saxena
     * Description: This methods verifies home page url.
     * Parameters:None
     * return type:void
     */
    public void verifyHomePageUrl(){
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.equals(ExcelReader.readData(System.getProperty("user.dir")+"/testData/ELCData.xlsx", "Sheet1", 5, 0)));
            test.log(Status.PASS, "Verified HomePage Url");
            LoggerHandler.info("Verified HomePage Url");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Verified HomePage Url");
            LoggerHandler.info("Not Verified HomePage Url");
        }
    }

    /*Method Name:hoveronoutdoortoys
     * Author Name:Vipul Saxena
     * Description: This method hovers on outdoor toys.
     * Parameters:None
     * return type:void
     */
    public void hoveronoutdoortoys()
    {
        try {
            helper.wait(HomePageLocators.Outdoortoys);
            helper.hoverOverElement(HomePageLocators.Outdoortoys);
            test.log(Status.PASS, "Hovered on toys");
            LoggerHandler.info("Hovered on toys");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Hovered on toys");
            LoggerHandler.info("Not Hovered on toys");
        }

    }

    /*Method Name:clickonbikes
     * Author Name:Vipul Saxena
     * Description: This method click on bikes.
     * Parameters:None
     * return type:void
     */


    public void clickonbikes()
    {
        try {
            helper.wait(HomePageLocators.Bikes);
            helper.clickOnElement(HomePageLocators.Bikes);
            test.log(Status.PASS, "Clicked on bikes");
            LoggerHandler.info("Clicked on bikes");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on bikes");
            LoggerHandler.info("Not Clicked on bikes");
        }

    }

    /*Method Name:bikesurlverify
     * Author Name:Vipul Saxena
     * Description: This method verify bikes page url.
     * Parameters:None
     * return type:void
     */

    public void bikesurlverify()
    {
        try {
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testData/ELCData.xlsx", "Sheet1", 6, 2)));
            test.log(Status.PASS, "Contains bikes");
            LoggerHandler.info("Contains bikes");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Contains bikes");
            LoggerHandler.info("Not Contains bikes");
        }
    }

    /*Method Name:clickonhuffy
     * Author Name:Vipul Saxena
     * Description: This method click on huffy.
     * Parameters:None
     * return type:void
     */

    public void clickonhuffy()
    {
        try {
            helper.wait(OutdoorPageLocators.Huffy);
            helper.clickOnElement(OutdoorPageLocators.Huffy);
            test.log(Status.PASS, "Clicked on Huffy");
            LoggerHandler.info("Clicked on Huffy");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on Huffy");
            LoggerHandler.info("Not Clicked on Huffy");
        }

    }

    /*Method Name:ClickonToddlerBikes
     * Author Name:Vipul Saxena
     * Description: This methods click on toddler bikes.
     * Parameters:None
     * return type:void
     */

    public void ClickonToddlerBikes()
    {
        try {
            helper.wait(OutdoorPageLocators.ToddlerBike);
            helper.clickOnElement(OutdoorPageLocators.ToddlerBike);
            test.log(Status.PASS, "Clicked on ToddlerBike");
            LoggerHandler.info("Clicked on ToddlerBike");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on ToddlerBike");
            LoggerHandler.info("Not Clicked on ToddlerBike");
        }

    }

    /*Method Name:searchverify
     * Author Name:Vipul Saxena
     * Description: This methods verify text "search".
     * Parameters:None
     * return type:void
     */

    public void searchverify()
    {
        try {
            String text=helper.getText(OutdoorPageLocators.VerifySearch);
            Assert.assertTrue(text.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testData/ELCData.xlsx", "Sheet1", 6, 3)));
            test.log(Status.PASS, "Verified Search");
            LoggerHandler.info("Verified Search");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Verified Search");
            LoggerHandler.info("Not Verified Search");
        }
    }

    /*Method Name:Clickondisney
     * Author Name:Vipul Saxena
     * Description: This methods clicks on disney..
     * Parameters:None
     * return type:void
     */

    public void Clickondisney()
    {
        try {
            helper.wait(OutdoorPageLocators.Disney);
            helper.clickOnElement(OutdoorPageLocators.Disney);
            test.log(Status.PASS, "Clicked on Disney");
            LoggerHandler.info("Clicked on Disney");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on Disney");
            LoggerHandler.info("Not Clicked on Disney");
        }

    }

    /*Method Name:clickFirstProduct
     * Author Name:Vipul Saxena
     * Description: This methods clicks on first product..
     * Parameters:None
     * return type:void
     */

    public void clickFirstProduct()
    {
        try {
            helper.wait(OutdoorPageLocators.firstproduct);
            helper.clickOnElement(OutdoorPageLocators.firstproduct);
            test.log(Status.PASS, "Clicked on firstproduct");
            LoggerHandler.info("Clicked on firstproduct");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on firstproduct");
            LoggerHandler.info("Not Clicked on firstproduct");
        }

    }

    /*Method Name:clickaddtobasket
     * Author Name:Vipul Saxena
     * Description: This methods clicks on add to basket.
     * Parameters:None
     * return type:void
     */
    public void clickaddtobasket()
    {
        try {
            helper.wait(OutdoorPageLocators.addtobasket);
            helper.clickOnElement(OutdoorPageLocators.addtobasket);
            test.log(Status.PASS, "Clicked on addtobasket");
            LoggerHandler.info("Clicked on addtobasket");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on addtobasket");
            LoggerHandler.info("Not Clicked on addtobasket");
        }

    }

    /*Method Name:clickoncheckout
     * Author Name:Vipul Saxena
     * Description: This methods clicks on checkout.
     * Parameters:None
     * return type:void
     */
    public void clickoncheckout()
    {
        try {
            helper.wait(OutdoorPageLocators.checkout);
            helper.clickOnElement(OutdoorPageLocators.checkout);
            test.log(Status.PASS, "Clicked on checkout");
            LoggerHandler.info("Clicked on checkout");
            
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Clicked on checkout");
            LoggerHandler.info("Not Clicked on checkout");
        }

    }

    /*Method Name:verifycheckout
     * Author Name:Vipul Saxena
     * Description: This methods verify checkout.
     * Parameters:None
     * return type:void
     */

    public void verifycheckout()
    {
        try {
            String data=helper.getText(OutdoorPageLocators.checkout);
            Assert.assertTrue(data.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testData/ELCData.xlsx", "Sheet1", 5, 2)));
            test.log(Status.PASS, "Verified checkout");
            LoggerHandler.info("Verified checkout");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not Verified checkout");
            LoggerHandler.info("Not Verified checkout");
        }
    }

    /*Method Name:takescreenshot
     * Author Name:Vipul Saxena
     * Description: This methods hovers on outdoor toys.
     * Parameters:None
     * return type:void
     */

    public void takescreenshot()
    {
        Screenshot.captureScreenShot("Learning product");
    }
    

}
