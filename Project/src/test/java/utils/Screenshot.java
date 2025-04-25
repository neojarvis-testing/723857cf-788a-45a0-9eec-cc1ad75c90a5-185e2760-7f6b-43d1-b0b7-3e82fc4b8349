package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class Screenshot extends Base{
    public static TakesScreenshot ts;
    /* 
     * MethodName:captureScreenshot
     * AuthorName:C Sai Kiran
     * Description:This method capture screenshot with timestamp
     * Parameters:filename
     * Returntype:void
    */
    public static void captureScreenShot(String filename){
        String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name=filename + timestamp + ".png";
        ts=(TakesScreenshot)driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        File screenshotDir=new File(System.getProperty("user.dir")+"/screenshots");
        if (!screenshotDir.exists()) {
         screenshotDir.mkdirs();
        }
        File target=new File(screenshotDir,name);
        try {
            Files.copy(file, target);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     /* 
     * MethodName:captureHighLightScreenShot
     * AuthorName:C Sai Kiran
     * Description:This method capture screenshot of Particular Element by Highlighting it and adding timestamp
     * Parameters:filename,locator
     * Returntype:void
    */
    public static void captureHighLightScreenShot(String filename,By locator){
        WebElement element=driver.findElement(locator);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='orange';",element);
        File file=ts.getScreenshotAs(OutputType.FILE);
        File screenshotDir=new File(System.getProperty("user.dir")+"/screenshots");
        if (!screenshotDir.exists()) {
            screenshotDir.mkdirs();
        }
        String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        File target=new File(screenshotDir,filename+timestamp+".png");
        js.executeScript("arguments[0].style.backgroundColor='';",element);
        try {
            Files.copy(file, target);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /* 
     * MethodName:captureSpecificElementScreenShot
     * AuthorName:C Sai Kiran
     * Description:This method capture screenshot of particular Element with timestamp
     * Parameters:filename,locator
     * Returntype:void
    */
        public static void captureSpecificElementScreenShot(String filename,By locator){
            WebElement element=driver.findElement(locator);
            String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String name=filename + timestamp + ".png";
            File file=element.getScreenshotAs(OutputType.FILE);
            File screenshotDir=new File(System.getProperty("user.dir")+"/screenshots");
            if (!screenshotDir.exists()) {
             screenshotDir.mkdirs();
            }
            File target=new File(screenshotDir,name);
            try {
                Files.copy(file, target);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }