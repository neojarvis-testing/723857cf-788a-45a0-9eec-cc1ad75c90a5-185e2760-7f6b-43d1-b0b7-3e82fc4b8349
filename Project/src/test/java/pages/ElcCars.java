package pages;



import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ElcCarsFirstProductLocator;
import uistore.ElcCarsHomePageLocator;
import uistore.HomePageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ElcCars {
    ExtentTest test;
    WebDriverHelper helper;
    public static final String sheetName="Sheet1";
    public static final String dirPath ="/testData/ELCData.xlsx";
    public static final String commonPath = "user.dir";
    public ElcCars(ExtentTest test){
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
     * a.Method Name: verifyLogo
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies the logo
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyLogo(){
        try {
            String text = Base.driver.findElement(HomePageLocators.logo).getDomAttribute("title");
            Assert.assertEquals(text,ExcelReader.readData(System.getProperty(commonPath)+dirPath, sheetName, 9, 6));
            LoggerHandler.info("Logo verified");
            test.log(Status.PASS,"Logo Verified");
        } catch (AssertionError e) {
            LoggerHandler.error("Logo not verified");
            test.log(Status.FAIL,"Logo not Verified");
        }
    }

    /*
     * a.Method Name: clickOnSearchBar
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the search bar to initiate a search
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnSearchBar(){
        try {
            helper.wait(HomePageLocators.searchBarHomePage);
            helper.clickOnElement(HomePageLocators.searchBarHomePage);
            LoggerHandler.info("Clicked on searchBar");
            test.log(Status.INFO, "Clicked on searchBar");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on searchBar");
            test.log(Status.FAIL, "Not able to click on searchBar");
        }
    }

    /*
     * a.Method Name: enterDataOnSearchBar
     * b.Author Name: Pratham Maheshwari
     * c.Description: Enters the serach term "Cars" in the search bar and perform search action
     * d.Parameter: None
     * e.Return Type: void
     */
    public void enterDataOnSearchBar(){
        try {
            helper.wait(HomePageLocators.searchBarHomePage);
            helper.sendData(HomePageLocators.searchBarHomePage,ExcelReader.readData(System.getProperty(commonPath)+dirPath, sheetName, 0, 0));
            Thread.sleep(500);
            helper.enterAction(HomePageLocators.searchBarHomePage);
            String x = helper.getText(ElcCarsHomePageLocator.verifyCar);
            Assert.assertTrue(x.contains(ExcelReader.readData(System.getProperty(commonPath)+dirPath, sheetName, 0, 0)));
            LoggerHandler.info("Data entered on searchBar");
            test.log(Status.PASS, "Data entered on searchBar");
        } catch (AssertionError | InterruptedException e) {
            LoggerHandler.error("Not able to enter data on searchBar");
            test.log(Status.FAIL, "Not able to enter data on searchBar");
        }
    }

    /*
     * a.Method Name: verifyCarUrl
     * b.Author Name: Pratham Maheshwari
     * c.Description: Verifies that the current URL contains the expected keyword "Cars".
     * d.Parameter: None
     * e.Return Type: void
     */
    public void verifyCarUrl(){
        try {
            String x = Base.driver.getCurrentUrl();
            Assert.assertTrue(x.contains(ExcelReader.readData(System.getProperty(commonPath)+dirPath, sheetName, 9, 0)));
            LoggerHandler.info("Verified Cars");
            test.log(Status.INFO, "Cars verified");
        } catch (AssertionError e) {
            LoggerHandler.error("Not able to verify Cars");
            test.log(Status.FAIL, "Cars not verified");
        }
    }

    /*
     * a.Method Name: clickOnShowMore
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks the Show More button to display additional car categories
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnShowMore(){
        try {
            helper.wait(ElcCarsHomePageLocator.showMore);
            helper.clickOnElement(ElcCarsHomePageLocator.showMore);
            String x = helper.getText(ElcCarsHomePageLocator.toyCars);
            Assert.assertTrue(x.contains(ExcelReader.readData(System.getProperty(commonPath)+dirPath, sheetName, 9, 1)));
            LoggerHandler.info("Clicked on show more");
            test.log(Status.INFO, "Clicked on show more");
        } catch (AssertionError | Exception e) {
            LoggerHandler.error("Not able to click on show more");
            test.log(Status.FAIL, "Not able to click on show more");
        } 
    }

    /*
     * a.Method Name: clickOnToyCars
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the Toy cars category and verifies navigation
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnToyCars(){
        try {
            helper.wait(ElcCarsHomePageLocator.toyCars);
            helper.clickOnElement(ElcCarsHomePageLocator.toyCars);
            String x = helper.getText(ElcCarsHomePageLocator.imaginativePlay);
            Assert.assertTrue(x.contains(ExcelReader.readData(System.getProperty(commonPath)+dirPath, sheetName, 9, 2)));
            LoggerHandler.info("Clicked on Toy Cars");
            test.log(Status.PASS, "Clicked on Toy Cars");
        } catch (AssertionError | Exception e) {
            LoggerHandler.error("Not able to click on Toy Cars");
            test.log(Status.FAIL, "Not able to click on Toy Cars");
        } 
    }

    /*
     * a.Method Name: clickOnImaginativePlay
     * b.Author Name: Pratham Maheshwari
     * c.Description:  clicks on the Imaginative Play category and verifies navigation
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnImaginativePlay(){
        try {
            helper.wait(ElcCarsHomePageLocator.imaginativePlay);
            helper.clickOnElement(ElcCarsHomePageLocator.imaginativePlay);
            String x = helper.getText(ElcCarsHomePageLocator.fineMotorSkills);
            Assert.assertTrue(x.contains(ExcelReader.readData(System.getProperty(commonPath)+dirPath, sheetName, 9, 3)));
            LoggerHandler.info("Clicked on Imaginative Play");
            test.log(Status.PASS, "Clicked on Imaginative Play");
        } catch (AssertionError | Exception e) {
            LoggerHandler.error("Not able to click on Imaginative Play");
            test.log(Status.FAIL, "Not able to click on Imaginative Play");
        } 
    }

    /*
     * a.Method Name: clickOnFineMotorSkills
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the Fine Motor skills category and verifies navigation
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnFineMotorSkills(){
        try {
            helper.wait(ElcCarsHomePageLocator.fineMotorSkills);
            helper.clickOnElement(ElcCarsHomePageLocator.fineMotorSkills);
            String x = helper.getText(ElcCarsHomePageLocator.selected);
            Assert.assertTrue(x.contains(ExcelReader.readData(System.getProperty(commonPath)+dirPath, sheetName, 9, 4)));
            LoggerHandler.info("Clicked on Fine Motor Skill");
            test.log(Status.PASS, "Clicked on Fine Motor Skill");
        } catch (AssertionError | Exception e) {
            LoggerHandler.error("Not able to click on Fine Motor Skill");
            test.log(Status.FAIL, "Not able to click on Fine Motor Skill");
        } 
    }

    /*
     * a.Method Name: clickOnFirstProduct
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the first listed product and verifies its details
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnFirstProduct(){
        try {
            helper.jsScroll(0, -1500);
            helper.wait(ElcCarsHomePageLocator.firstProduct);
            helper.clickOnElement(ElcCarsHomePageLocator.firstProduct);
            String x = helper.getText(ElcCarsFirstProductLocator.wishlist);
            Assert.assertTrue(x.contains(ExcelReader.readData(System.getProperty(commonPath)+dirPath, sheetName, 9, 5)));
            LoggerHandler.info("Clicked on First Product");
            test.log(Status.INFO, "Clicked on First Product");
        } catch (AssertionError | Exception e) {
            LoggerHandler.error("Not able to click on First Product");
            test.log(Status.FAIL, "Not able to click on First Product");
        } 
    }

    /*
     * a.Method Name: clickOnWishList
     * b.Author Name: Pratham Maheshwari
     * c.Description: clicks on the wishlist button to add the selected product to the wishlist
     * d.Parameter: None
     * e.Return Type: void
     */
    public void clickOnWishList(){
        try {
            helper.wait(ElcCarsFirstProductLocator.wishlist);
            helper.clickOnElement(ElcCarsFirstProductLocator.wishlist);
            LoggerHandler.info("Clicked on Wishlist");
            test.log(Status.PASS, "Clicked on Wishlist");
        } catch (Exception e) {
            LoggerHandler.error("Not able to click on Wishlist");
            test.log(Status.FAIL, "Not able to click on Wishlist");
        } 
    }

    /*
     * a.Method Name: back
     * b.Author Name: Pratham Maheshwari
     * c.Description:Navigate back to the previous page
     * d.Parameter: None
     * e.Return Type: void
     */
    public void back(){
        try {
            Base.driver.navigate().back();
        } catch (Exception e) {
            LoggerHandler.error("Not able to move back");
            test.log(Status.FAIL, "Not able to move back");
        }
    }

}
