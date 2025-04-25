package stepdefinitions;
 
import com.aventstack.extentreports.ExtentReports;
 
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Reporter;
 
public class Hooks extends Base {
    public static ExtentReports report;
    /*  
        A. Method name : generate
        B. Author name : C Sai Kiran
        C. Description : This method initializes the ExtentReports for generating the test report
        D. Return type : void
        E. Parameter : None   
    */
    @BeforeAll
    public static void genarate(){
        report=Reporter.generateExtentReport("ELC_Report");
    
    }
    /*  
        A. Method name : open
        B. Author name : C Sai Kiran
        C. Description : This method opens the browser before each test scenario execution
        D. Return type : void
        E. Parameter : None   
    */
    @Before
    public  void open(){
        openBrowser();
        Base.driver.navigate().refresh();
        driver.navigate().refresh();
    }
    /*  
        A. Method name : close
        B. Author name : C Sai Kiran
        C. Description : This method closes the browser after each test scenario execution
        D. Return type : void
        E. Parameter : None   
    */
    @After
    public void close(){
        driver.quit();
    }
    /*  
        A. Method name : flushing
        B. Author name : C Sai Kiran
        C. Description : This method flushes the ExtentReports to generate the final report after all test scenarios
        D. Return type : void
        E. Parameter : None   
    */
    @AfterAll
    public static void flushing(){
        report.flush();
    }
 
}