package uistore;

import org.openqa.selenium.By;

public class OutdoorPageLocators {
     public static By Huffy=By.cssSelector("a[title='Huffy']");
    public static By ToddlerBike=By.cssSelector("span[class='facet__text']");
    public static By Disney=By.xpath("//span[@class='facet__list__text'and text()='Disney']");
    
    public static By VerifySearch=By.cssSelector("a[href='/brands']");
    public static By VerifySearc=By.xpath("//h1[@class='category-title']");
    //public static By firstproduct=By.cssSelector("div[class='details'] a[href='/online-only/Huffy-Disney-Frozen-12%22-Bike/p/573553'] ");
    //public static By firstproduct=By.xpath("//img[@title='Huffy Disney Frozen 12']");
    public static By firstproduct=By.xpath("//a[@class='name clickedObjectIDsAfterSearch' and @href='/online-only/Huffy-Disney-Frozen-12%22-Bike/p/573553']");

    
    public static By clickcollect=By.id("labelCCUnavailable");
    public static By addtocart=By.id("addToCartButton");
    public static By checkout=By.cssSelector("a[class='btn btn-primary btn-block add-to-cart-button']");
    public static By verifycheckout=By.xpath("//div[@class='col-xs-12 col-sm-12 col-sm-offset-0 col-md-offset-5 col-md-7 col-lg-7']/child::button[contains(text(),'Check out')]");
    public static By addtobasket=By.cssSelector("#addToCartButton");
}
