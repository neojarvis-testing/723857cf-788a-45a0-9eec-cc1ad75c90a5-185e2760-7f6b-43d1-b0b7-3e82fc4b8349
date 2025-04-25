package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.NewbornBabyGiftsPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class NewbornBabyGiftsPage {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public NewbornBabyGiftsPage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
    /*
     * Method Name : clickAcceptCookies
     * Author Name : Akki Manith
     * Description : To click on Accept cookies
     * Return Type : void
     * Parameter list : none
     */
    public void clickAcceptCookies(){
        try {
            helper.wait(HomePageLocators.acceptAllCookies);
            helper.clickOnElement(HomePageLocators.acceptAllCookies);
            test.log(Status.PASS, "Clicked on Accept Cookies");
            LoggerHandler.info("Clicked on Accept Cookies");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Accept Cookies");
            LoggerHandler.error("Not clicked on Accept Cookies");
        }
    }
    /*
     * Method Name : hoverShopByAge
     * Author Name : Akki Manith
     * Description : To hover Shop by age
     * Return Type : void
     * Parameter list : none
     */
    public void hoverShopByAge(){
        try {
            helper.wait(HomePageLocators.shopByAge);
            helper.hoverOverElement(HomePageLocators.shopByAge);
            test.log(Status.PASS, "Hovered on Shop by age in the navigation bar");
            LoggerHandler.info("Hovered on Shop by age in the navigation bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not hovered on Shop by age in the navigation bar");
            LoggerHandler.error("Not hovered on Shop by age in the navigation bar");
        }
    }
    /*
     * Method Name : clickNewbornGifts
     * Author Name : Akki Manith
     * Description : To click on Newborn Gifts
     * Return Type : void
     * Parameter list : none
     */
    public void clickNewbornGifts(){
        try {
            helper.wait(HomePageLocators.newBornGifts);
            helper.clickOnElement(HomePageLocators.newBornGifts);
            test.log(Status.PASS, "Clicked on Newborn Gifts");
            LoggerHandler.info("Clicked Newborn Gifts");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Newborn Gifts");
            LoggerHandler.error("Not clicked Newborn Gifts");
        }
    }
    /*
     * Method Name : verifyURL
     * Author Name : Akki Manith
     * Description : To verify the url contains "new-born-baby-gift-ideas"
     * Return Type : void
     * Parameter list : none
     */
    public void verifyURL(){
        try {
            String url=Base.driver.getCurrentUrl();
            String data=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 2, 0);
            Assert.assertTrue(url.contains(data));
            test.log(Status.PASS, "Verified URL contains new-born-baby-gift-ideas");
            LoggerHandler.info("Verified URL contains new-born-baby-gift-ideas");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified URL contains new-born-baby-gift-ideas");
            LoggerHandler.error("Not verified URL contains new-born-baby-gift-ideas");
        }
    }
    /*
     * Method Name : clickShowMore
     * Author Name : Akki Manith
     * Description : To click on Show more under Toy type
     * Return Type : void
     * Parameter list : none
     */
    public void clickShowMore(){
        try {
            // helper.jsScrollIntoView(NewbornBabyGiftsPageLocator.showMore);
            helper.wait(NewbornBabyGiftsPageLocator.showMore);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.showMore);
            test.log(Status.PASS, "Clicked on Show More under Toy type");
            LoggerHandler.info("Clicked on Show More under Toy type");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Show More under Toy type");
            LoggerHandler.error("Not clicked on Show More under Toy type");
        }
    }
    /*
     * Method Name : clickBabyActivityToys
     * Author Name : Akki Manith
     * Description : To click on Baby Activity Toys
     * Return Type : void
     * Parameter list : none
     */
    public void clickBabyActivityToys(){
        try {
            // helper.jsScrollIntoView(NewbornBabyGiftsPageLocator.babyActivityToys);
            helper.wait(NewbornBabyGiftsPageLocator.babyActivityToys);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.babyActivityToys);
            test.log(Status.PASS, "Clicked on Baby Activity Toys");
            LoggerHandler.info("Clicked on Baby Activity Toys");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Baby Activity Toys");
            LoggerHandler.error("Not clicked on Baby Activity Toys");
        }
    }
    /*
     * Method Name : clickEarlyLearningCentre
     * Author Name : Akki Manith
     * Description : To click on Early Learning Centre under Brands
     * Return Type : void
     * Parameter list : none
     */
    public void clickEarlyLearningCentre(){
        try {
            helper.jsScrollIntoView(NewbornBabyGiftsPageLocator.earlyLearningCenter);
            helper.wait(NewbornBabyGiftsPageLocator.earlyLearningCenter);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.earlyLearningCenter);
            test.log(Status.PASS, "Clicked on Early Learning Centre under Brands");
            LoggerHandler.info("Clicked on Early Learning Centre under Brands");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Early Learning Centre under Brands");
            LoggerHandler.error("Not clicked on Early Learning Centre under Brands");
        }
    }
    /*
     * Method Name : clickHandEyeCoordination
     * Author Name : Akki Manith
     * Description : To click on Handeye Coordination under Learning skills
     * Return Type : void
     * Parameter list : none
     */
    public void clickHandEyeCoordination(){
        try {
            helper.jsScrollIntoView(NewbornBabyGiftsPageLocator.handEyeCoordination);
            helper.wait(NewbornBabyGiftsPageLocator.handEyeCoordination);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.handEyeCoordination);
            test.log(Status.PASS, "Clicked on Hand eye coordination under Learning skills");
            LoggerHandler.info("Clicked on Hand eye coordination under Learning skills");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Hand eye coordination under Learning skills");
            LoggerHandler.error("Not clicked on Hand eye coordination under Learning skills");
        }
    }
    /*
     * Method Name : clickFirstProduct
     * Author Name : Akki Manith
     * Description : To click on the first product
     * Return Type : void
     * Parameter list : none
     */
    public void clickFirstProduct(){
        try {
            helper.wait(NewbornBabyGiftsPageLocator.firstProduct);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.firstProduct);
            test.log(Status.PASS, "Clicked on First product");
            LoggerHandler.info("Clicked on First product");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on First product");
            LoggerHandler.error("Not clicked on First product");
        }
    }
    /*
     * Method Name : verifyStandardDelivery
     * Author Name : Akki Manith
     * Description : To verify the text Standard Delivery
     * Return Type : void
     * Parameter list : none
     */
    public void verifyStandardDelivery(){
        try {
            String value=helper.getText(NewbornBabyGiftsPageLocator.standardDelivery);
            String data=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 2, 1);
            Assert.assertTrue(value.contains(data));
            test.log(Status.PASS, "Verified text Standard Deliver");
            LoggerHandler.info("Verified text Standard Delivery");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified text Standard Deliver");
            LoggerHandler.error("Not verified text Standard Delivery");
        }
    }
    /*
     * Method Name : clickAddToBasket
     * Author Name : Akki Manith
     * Description : To click on Add to Basket
     * Return Type : void
     * Parameter list : none
     */
    public void clickAddToBasket(){
        try {
            helper.wait(NewbornBabyGiftsPageLocator.addToBasket);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.addToBasket);
            test.log(Status.PASS, "Clicked on Add to Basket");
            LoggerHandler.info("Clicked on Add to Basket");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Add to Basket");
            LoggerHandler.error("Not clicked on Add to Basket");
        }
    }
    /*
     * Method Name : clickContinueShopping
     * Author Name : Akki Manith
     * Description : To click on Continue Shopping
     * Return Type : void
     * Parameter list : none
     */
    public void clickContinueShopping(){
        try {
            helper.wait(NewbornBabyGiftsPageLocator.continueShopping);
            helper.clickOnElement(NewbornBabyGiftsPageLocator.continueShopping);
            test.log(Status.PASS, "Clicked on Continue Shopping");
            LoggerHandler.info("Clicked on Continue Shopping");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Continue Shopping");
            LoggerHandler.error("Not clicked on Continue Shopping");
        }
    }
    /*
     * Method Name : verifyHome
     * Author Name : Akki Manith
     * Description : To verify the text Home
     * Return Type : void
     * Parameter list : none
     */
    public void verifyHome(){
        try {
            String value=helper.getText(NewbornBabyGiftsPageLocator.home);
            String data=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 2, 2);
            Assert.assertTrue(value.contains(data));
            test.log(Status.PASS, "Verified text Home");
            LoggerHandler.info("Verified text Standard Home");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified text Home");
            LoggerHandler.error("Not verified text Home");
        }
    }
}