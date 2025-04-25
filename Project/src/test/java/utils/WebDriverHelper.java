package utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {
    public static WebDriver driver;

    /*
     * a.variable Name: list
     * b.Author Name: C Sai Kiran
     * c.Description:Stores window handle for browser tabs to facilitate tab switching
     * d.Initial value : Empty list (new ArrayList<>())
     */
    ArrayList<String>list = new ArrayList<String>();

     /*
     * a.Method Name: WebDriverHelper
     * b.Author Name: C Sai Kiran
     * c.Description: Initializes the webDriverHelper class and stores the intial window handle
     * d.Parameter: WebDriver driver - Webdriver instance
     * e.Return Type: None(constructor)
     */
    public WebDriverHelper(WebDriver driver){
        this.driver= driver;
        list.add(driver.getWindowHandle());
    }

    /*
     * a.Method Name: wait
     * b.Author Name: C Sai Kiran
     * c.Description: Wait for an element to be visible and clickable
     * d.Parameter: By path - Locator for the element
     * e.Return Type: void
     */
    public void wait(By path){
        try {
            WebDriverWait wat = new WebDriverWait(driver, Duration.ofSeconds(10));
            wat.until(ExpectedConditions.visibilityOfElementLocated(path));
            wat.until(ExpectedConditions.elementToBeClickable(path));
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    /*
     * a.Method Name: clickOnElement
     * b.Author Name: C Sai Kiran
     * c.Description: click on element identified by locator
     * d.Parameter: By path - Locator for the element
     * e.Return Type: void
     */
    public void clickOnElement(By path){
        try {
            driver.findElement(path).click();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    /*
     * a.Method Name: sendData
     * b.Author Name: C Sai Kiran
     * c.Description: Send input data to an element identified by locator
     * d.Parameter: By path - Locator for the element
     *              String value - Data to be sent
     * e.Return Type: void
     */
    public void sendData(By path,String value){
        try {
            driver.findElement(path).sendKeys(value);;
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    /*
     * a.Method Name: enterAction
     * b.Author Name: C Sai Kiran
     * c.Description: Pressing the Enter Key on an element
     * d.Parameter: By path - Locator for the element
     * e.Return Type: void
     */
    public void enterAction(By path){
        try {
            driver.findElement(path).sendKeys(Keys.ENTER);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    /*
     * a.Method Name: dropDown
     * b.Author Name: C Sai Kiran
     * c.Description: Selects a dropdown option based on visible text
     * d.Parameter: By path - Locator for the element
     *              String value - Visible text of the option to be selected
     * e.Return Type: void
     */
    public void dropDown(By path,String value){
        try {
            WebElement element = driver.findElement(path);
            Select select = new Select(element);
            select.selectByVisibleText(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a.Method Name: switchToFrame
     * b.Author Name: C Sai Kiran
     * c.Description: Switches to iframe identified by the locator
     * d.Parameter: By path - Locator for an element
     * e.Return Type: void
     */
    public void switchToFrame(By path){
        try {
            WebElement element = driver.findElement(path);
            driver.switchTo().frame(element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a.Method Name: switchBackToDefault
     * b.Author Name: C Sai Kiran
     * c.Description: Switches back to the default content from an iframe
     * d.Parameter: None
     * e.Return Type: void
     */
    public void switchBackToDefault(){
        try {
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a.Method Name: switchTab
     * b.Author Name: C Sai Kiran
     * c.Description: Switches to new browser tab after clicking an element
     * d.Parameter: None
     * e.Return Type: void
     */
    public void switchTab(){
        try {
            String parent = driver.getWindowHandle();
            Set<String>set = driver.getWindowHandles();
            for (String child : set) {
               if(!child.equals(parent) && !list.contains(child)){
                    list.add(child);
                    driver.switchTo().window(child);
                    break;
               } 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a.Method Name: switchTabBasedOnIndex
     * b.Author Name: C Sai Kiran
     * c.Description: Switching to an already openend tab using its index
     * d.Parameter: int i - Index of the tab in the stored list
     * e.Return Type: void
     */
    public void switchTabBasedOnIndex(int i){
        try {
            driver.switchTo().window(list.get(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a.Method Name: scrollToFooter
     * b.Author Name: C Sai Kiran
     * c.Description: Scrolls to the bottom of the page
     * d.Parameter: None
     * e.Return Type: void
     */
    public void scrollToFooter(){
        try {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a.Method Name: jsScroll
     * b.Author Name: C Sai Kiran
     * c.Description: Scroll the window by the specified x and y pixel values
     * d.Parameter: int x-Scroll amount
     *              int y-Scroll amount
     * e.Return Type: void
     */
    public void jsScroll(int x, int y){
        try {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(arguments[0],arguments[1]);",x,y);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a.Method Name: jsScrollIntoView
     * b.Author Name: C Sai Kiran
     * c.Description: Scrolls the page until the specified element is in view
     * d.Parameter: By path - Locator for the element
     * e.Return Type: void
     */
    public void jsScrollIntoView(By path){
        try {
            WebElement element = driver.findElement(path);
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].scrollIntoView();",element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a.Method Name: getText
     * b.Author Name: C Sai Kiran
     * c.Description: Retrieves the text content of an element
     * d.Parameter: By path - Locator for the element
     * e.Return Type: String
     */
    public String getText(By path){
        return driver.findElement(path).getText();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public String getPageTitle(){
        return driver.getTitle();
    }

    /*
     * a.Method Name: getElementsByXPath
     * b.Author Name: C Sai Kiran
     * c.Description: Returns a list of WebElements that match the given Xpath locator
     * d.Parameter: String path -XPath Locator
     * e.Return Type: List<WebElement>
     */
    public List<WebElement>getElementsByXPath(String path){
        return driver.findElements(By.xpath(path));
    }

    /*
     * a.Method Name: hoverOverElement
     * b.Author Name: C Sai Kiran
     * c.Description: Moves the mouse cursor over the specified element
     * d.Parameter: By path - Locator for the element
     * e.Return Type: void
     */
    public void hoverOverElement(By path)
    {
        try {
            Actions action = new Actions(driver);
            WebElement element = driver.findElement(path);
            action.moveToElement(element).build().perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a.Method Name: hoverOverElementAndClick
     * b.Author Name: C Sai Kiran
     * c.Description: Moves the mouse cursor over the element amd clicks it
     * d.Parameter: By path- Locator for an element
     * e.Return Type: void
     */
    public void hoverOverElementAndClick(By path){
        try {
            Actions action = new Actions(driver);
            WebElement element = driver.findElement(path);
            action.click(element).build().perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a.Method Name: switchBackToParent
     * b.Author Name: C Sai Kiran
     * c.Description: Switches back to the parent tab from other tab
     * d.Parameter:None
     * e.Return Type: void
     */

    public void switchBackToParent(){
        try {
            if (!list.isEmpty()) {
                String parentWindow = list.get(0); // Assuming the first stored window is the parent
                driver.switchTo().window(parentWindow);
            } else {
                System.out.println("No parent window found in the list.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void jsClick(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            //
            e.printStackTrace();
        }
    }
}