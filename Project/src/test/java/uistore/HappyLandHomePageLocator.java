package uistore;

import org.openqa.selenium.By;

public class HappyLandHomePageLocator {
    public static By months=By.xpath("//span[text()='0 - 3 months']");
    public static By happyland=By.xpath("(//a[text()='Happyland'])[2]");
    //public static By first=By.xpath("//a[text()='Happyland Sunny Farm Red Playset']");
    public static By first=By.xpath("(//a[@class='name clickedObjectIDsAfterSearch'])[1]");
    public static By store=By.cssSelector("p[class='store-availability-text']");
    public static By addcart=By.id("addToCartButton");
    public static By checkout=By.cssSelector("a[class='btn btn-primary btn-block add-to-cart-button']");

    public static By showmore=By.cssSelector("button[class='ais-Menu-showMore facet__more']");
    public static By jigsaw=By.xpath("//span[text()='Jigsaw Puzzles']");
    public static By children=By.xpath("//span[contains(text(),'Children')]");
    //public static By discover=By.cssSelector("input[value='Discover the world']");
    public static By discover=By.xpath("//span[text()='Discover the world']");

    public static By second=By.xpath("//div[@class='details']/child::a[text()='Early Learning Centre Snap The Animals']");
    public static By wishlist=By.cssSelector("span[class='notInWishlist js-dy']");
    public static By learning=By.xpath("//h3[text()='Get more from Early Learning Centre']");

}
