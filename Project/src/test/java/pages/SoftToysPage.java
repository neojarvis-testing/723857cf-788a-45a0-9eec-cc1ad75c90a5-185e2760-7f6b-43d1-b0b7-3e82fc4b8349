package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.SoftToysPageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class SoftToysPage {
    public static ExtentTest test;
    public static WebDriverHelper helper;
    public SoftToysPage(ExtentTest test){
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
     * Method Name : hoverTypeOfToy
     * Author Name : Akki Manith
     * Description : To hover on Type of Toy
     * Return Type : void
     * Parameter list : none
     */
    public void hoverTypeOfToy(){
        try {
            helper.wait(HomePageLocators.typeOfToy);
            helper.hoverOverElement(HomePageLocators.typeOfToy);
            test.log(Status.PASS, "Hovered on Type of Toy in the navigation bar");
            LoggerHandler.info("Hovered on Type of Toy in the navigation bar");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not hovered on Type of Toy in the navigation bar");
            LoggerHandler.error("Not hovered on Type of Toy in the navigation bar");
        }
    }
    /*
     * Method Name : clickSoftToys
     * Author Name : Akki Manith
     * Description : To click on Soft toy
     * Return Type : void
     * Parameter list : none
     */
    public void clickSoftToys(){
        try {
            helper.wait(HomePageLocators.softToys);
            helper.clickOnElement(HomePageLocators.softToys);
            test.log(Status.PASS, "Clicked on Soft toys");
            LoggerHandler.info("Clicked Soft toys");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Soft toys");
            LoggerHandler.error("Not clicked Soft toys");
        }
    }
    /*
     * Method Name : verifyURL
     * Author Name : Akki Manith
     * Description : To verify the url contains "soft-toys"
     * Return Type : void
     * Parameter list : none
     */
    public void verifyURL(){
        try {
            String url=Base.driver.getCurrentUrl();
            String data=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 3, 0);
            Assert.assertTrue(url.contains(data));
            test.log(Status.PASS, "Verified URL contains soft-toys");
            LoggerHandler.info("Verified URL contains soft-toys");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified URL contains");
            LoggerHandler.error("Not verified URL contains");
        }
    }
    /*
     * Method Name : clickDolls
     * Author Name : Akki Manith
     * Description : To click on Dolls under Toy type
     * Return Type : void
     * Parameter list : none
     */
    public void clickDolls(){
        try {
            helper.wait(SoftToysPageLocator.dolls);
            helper.clickOnElement(SoftToysPageLocator.dolls);
            test.log(Status.PASS, "Clicked on Dolls under Toy type");
            LoggerHandler.info("Clicked on Dolls under Toy type");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Dolls under Toy type");
            LoggerHandler.error("Not clicked on Dolls under Toy type");
        }
    }
    /*
     * Method Name : clickSoftToysUnderToyType
     * Author Name : Akki Manith
     * Description : To click on Soft Toys under Toy type
     * Return Type : void
     * Parameter list : none
     */
    public void clickSoftToysUnderToyType(){
        try {
            helper.jsScrollIntoView(SoftToysPageLocator.softToysUnderToyType);
            helper.wait(SoftToysPageLocator.softToysUnderToyType);
            helper.clickOnElement(SoftToysPageLocator.softToysUnderToyType);
            test.log(Status.PASS, "Clicked on Soft Toys");
            LoggerHandler.info("Clicked on Soft Toys");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Soft Toys");
            LoggerHandler.error("Not clicked on Soft Toys");
        }
    }
    /*
     * Method Name : verifyBrands
     * Author Name : Akki Manith
     * Description : To verify the text Brands
     * Return Type : void
     * Parameter list : none
     */
    public void verifyBrands(){
        try {
            String value=helper.getText(SoftToysPageLocator.brands);
            String data=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 3, 1);
            Assert.assertTrue(value.contains(data));
            test.log(Status.PASS, "Verified text Brands");
            LoggerHandler.info("Verified text Brands");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified text Brands");
            LoggerHandler.error("Not verified text Brands");
        }
    }
    /*
     * Method Name : clickSimulatingSenses
     * Author Name : Akki Manith
     * Description : To click on Simulating Senses under Learning skills
     * Return Type : void
     * Parameter list : none
     */
    public void clickSimulatingSenses(){
        try {
            helper.jsScrollIntoView(SoftToysPageLocator.simulatingSenses);
            helper.wait(SoftToysPageLocator.simulatingSenses);
            helper.clickOnElement(SoftToysPageLocator.simulatingSenses);
            test.log(Status.PASS, "Clicked on Simulating Senses under Learning skills");
            LoggerHandler.info("Clicked on Simulating Senses under Learning skills");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on Simulating Senses under Learning skills");
            LoggerHandler.error("Not clicked on Simulating Senses under Learning skills");
        }
    }
    /*
     * Method Name : clickFirstProductSoftToys
     * Author Name : Akki Manith
     * Description : To click on the first product in Soft Toys
     * Return Type : void
     * Parameter list : none
     */
    public void clickFirstProductSoftToys(){
        try {
            helper.wait(SoftToysPageLocator.firstProductSoftToys);
            helper.clickOnElement(SoftToysPageLocator.firstProductSoftToys);
            test.log(Status.PASS, "Clicked on First product");
            LoggerHandler.info("Clicked on First product");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not clicked on First product");
            LoggerHandler.error("Not clicked on First product");
        }
    }
    /*
     * Method Name : verifyHomeDelivery
     * Author Name : Akki Manith
     * Description : To verify the text Home Delivery
     * Return Type : void
     * Parameter list : none
     */
    public void verifyHomeDelivery(){
        try {
            String value=helper.getText(SoftToysPageLocator.homeDelivery);
            String data=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 3, 2);
            Assert.assertTrue(value.contains(data));
            test.log(Status.PASS, "Verified text Home Delivery");
            LoggerHandler.info("Verified text Home Delivery");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified text Home Delivery");
            LoggerHandler.error("Not verified text Home Delivery");
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
            helper.wait(SoftToysPageLocator.addToBasket);
            helper.clickOnElement(SoftToysPageLocator.addToBasket);
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
            helper.wait(SoftToysPageLocator.continueShopping);
            helper.clickOnElement(SoftToysPageLocator.continueShopping);
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
            String value=helper.getText(SoftToysPageLocator.home);
            String data=ExcelReader.readData(System.getProperty("user.dir")+"/testdata/ELCData.xlsx", "Sheet1", 3, 3);
            Assert.assertTrue(value.contains(data));
            test.log(Status.PASS, "Verified text Home");
            LoggerHandler.info("Verified text Standard Home");
        } catch (Exception e) {
            test.log(Status.FAIL, "Not verified text Home");
            LoggerHandler.error("Not verified text Home");
        }
    }
}