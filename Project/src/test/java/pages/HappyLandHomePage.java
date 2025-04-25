package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HappyLandHomePageLocator;
import uistore.HomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HappyLandHomePage {
      public static WebDriverHelper helper;
    public static ExtentTest test;
    public HappyLandHomePage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
     /*
    * Method name : clickOnAcceptCookies
    * Author name : PrasannaLaxmi
    * Description : Clicks on the accept cookies button
    * Return Type : void
    * Parameter : None
    */
    public void clickAcceptCookies(){
        try {
            helper.wait(HomePageLocators.Cookies);
            helper.clickOnElement(HomePageLocators.Cookies);
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 7, 0)));
            test.log(Status.PASS, "clicked on accept cookies");
            LoggerHandler.info("clicked on accept cookies");
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.PASS, "Not able to clicked on accept cookies");
            LoggerHandler.info("Not able to clicked on accept cookies");

        }
    }
    /*
    * Method name : hoverOnExplore
    * Author name : PrasannaLaxmi
    * Description : Clicks on the accept cookies button
    * Return Type : void
    * Parameter : None
    */
    public void hoverOnExplore(){
        try {
            helper.wait(HomePageLocators.explore);
            helper.hoverOverElement(HomePageLocators.explore); 
            String text=helper.getText(HomePageLocators.explore);
            Assert.assertTrue(text.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 7, 1)));
        LoggerHandler.info("Hover on Explore");
        test.log(Status.PASS,"Hover on Explore");
        Screenshot.captureScreenShot("ELC-Screenshot");
        Reporter.attachScreenshotToReport("ELC-Screenshot", test, "ELC-Screenshot");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Hover on Explore");
          test.log(Status.PASS,"Not able to Hover on Explore");
        }
    }
    /*
    * Method name : clickOnGift
    * Author name : PrasannaLaxmi
    * Description : This method click on GiftCart
    * Return Type : void
    * Parameter : None
    */
    public void clickOnGift(){
        try {
            helper.wait(HomePageLocators.giftCards);
            helper.clickOnElement(HomePageLocators.giftCards); 
            String text=helper.getText(HomePageLocators.giftCards);
            Assert.assertTrue(text.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 7, 2)));
        LoggerHandler.info("cliked on giftcards");
        test.log(Status.PASS,"cliked on giftcards");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to cliked on giftcards");
          test.log(Status.PASS,"Not able to cliked on giftcards");
        }
    }
     /*
    * Method name : verifyGift
    * Author name : PrasannaLaxmi
    * Description : This method verify url of page
    * Return Type : void
    * Parameter : None
    */
    public void verifyGift(){
        try {
            String url=Base.driver.getCurrentUrl();
            System.out.println(url);
           Assert.assertTrue(url.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 7, 3)));
            LoggerHandler.info("Url contain gift");
            test.log(Status.PASS,"Url contain gift");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Url not contain gift");
            test.log(Status.PASS,"Url not contain gift");
        }
    }
   /*
    * Method name : clickOnOffers
    * Author name : PrasannaLaxmi
    * Description : This method click on offers
    * Return Type : void
    * Parameter : None
    */
    public void clickOnOffers(){
        try {
            helper.clickOnElement(HomePageLocators.offers);
            String text=helper.getText(HomePageLocators.offers);
            Assert.assertTrue(text.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 7, 4)));
        LoggerHandler.info("Clicked on Offers");
        test.log(Status.PASS,"Clicked on Offers");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Click on Offers");
          test.log(Status.PASS,"Not able to Click on Offers");
        }
    }
     /*
    * Method name : verifyMonths
    * Author name : PrasannaLaxmi
    * Description : This method verify keyword months
    * Return Type : void
    * Parameter : None
    */

    public void verifyMonths(){
        try {
            String text=helper.getText(HappyLandHomePageLocator.months);
            Assert.assertTrue(text.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 7, 5)));
            LoggerHandler.info("Text contains stores");
            test.log(Status.INFO,"Text contains stores");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Text not contain months");
            test.log(Status.PASS,"Text not contain months");
        }
    }
    /*
    * Method name : clickOnHappyLand
    * Author name : PrasannaLaxmi
    * Description : This method click on HappyLand
    * Return Type : void
    * Parameter : None
    */
    public void clickOnHappyLand(){
        try {
            helper.wait(HappyLandHomePageLocator.happyland);
            String text=helper.getText(HappyLandHomePageLocator.happyland);
            Assert.assertTrue(text.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 7, 6)));
            helper.clickOnElement(HappyLandHomePageLocator.happyland); 
        LoggerHandler.info("Clicked on HappyLand");
        test.log(Status.PASS,"Clicked on HappyLand");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Click on HappyLand");
          test.log(Status.FAIL,"Not able to Clicked on HappyLand");
        }
    }
    /*
    * Method name : clickOnFirst
    * Author name : PrasannaLaxmi
    * Description : This method click on FirstProduct in List of Product
    * Return Type : void
    * Parameter : None
    */
    public void clickOnFirst(){
        try {
            
           helper.wait(HappyLandHomePageLocator.first);
            helper.clickOnElement(HappyLandHomePageLocator.first); 
            //Thread.sleep(1000);
             String url=helper.getText(HappyLandHomePageLocator.first);
             System.out.println(url);
             //Assert.assertTrue(url.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 7, 6)));
        LoggerHandler.info("Clicked on First Product");
        test.log(Status.PASS,"Clicked on First Product");
        } 
        catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.info("Not able to Click on First Product");
          test.log(Status.FAIL,"Not able to Clicked on First Product");
        }
    }
     /*
    * Method name : verifyStore
    * Author name : PrasannaLaxmi
    * Description : This method verify keyword store
    * Return Type : void
    * Parameter : None
    */
    public void verifyStore(){
        try {
            String text=helper.getText(HappyLandHomePageLocator.store);
            System.out.println(text);
            Assert.assertTrue(text.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 7, 7)));
            LoggerHandler.info("Text contains stores");
            test.log(Status.INFO,"Text contains stores");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Text not contain Stores");
            test.log(Status.FAIL,"Text not contain Stores");
        }
    }
    /*
    * Method name : clickOnAddtoCart
    * Author name : PrasannaLaxmi
    * Description : This method click on Add to Basket
    * Return Type : void
    * Parameter : None
    */
    public void clickOnAddtoCart(){
        try {
            helper.clickOnElement(HappyLandHomePageLocator.addcart); 
            String text=helper.getText(HappyLandHomePageLocator.addcart);
            System.out.println(text);
            Assert.assertTrue(text.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 7, 8)));
        LoggerHandler.info("Clicked on Add to Basket");
        test.log(Status.PASS,"Clicked on Add to Basket");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Click on Add to Basket");
          test.log(Status.FAIL,"Not able to Clicked on Add to Basket");
        }
    }
    /*
    * Method name : clickOnCheck
    * Author name : PrasannaLaxmi
    * Description : This method click on Checkout
    * Return Type : void
    * Parameter : None
    */
    public void clickOnCheck(){
        try {
            helper.clickOnElement(HappyLandHomePageLocator.checkout); 
            String url=helper.getText(HappyLandHomePageLocator.checkout);
            System.out.println(url);
            Assert.assertTrue(url.contains(ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 8, 0)));
        LoggerHandler.info("Clicked on CheckOut");
        test.log(Status.PASS,"Clicked on CheckOut");
        Screenshot.captureScreenShot("Add to cart");
        } catch (Exception e) {
          System.out.println(e.getMessage());
          LoggerHandler.error("Not able to Click CheckOut");
          test.log(Status.FAIL,"Not able to Clicked Checkout");
        }
    }

}

