package uistore;

import org.openqa.selenium.By;

public class NewbornBabyGiftsPageLocator {
    // public static By acceptAllCookies=By.cssSelector("button[id='onetrust-accept-btn-handler']");
    // public static By logo=By.cssSelector("img[title='Early Learning Centre']");
    // public static By shopByAge=By.cssSelector("a[title='Shop by age']");
    // public static By newBornGifts=By.cssSelector("a[title='Newborn Gifts']");
    // public static By showMore=By.cssSelector("a[title='Newborn Gifts']");
    public static By showMore=By.xpath("//button[@class='ais-Menu-showMore facet__more']");
    // public static By babyActivityToys=By.cssSelector("a[href='https://www.elc.co.uk/c/shop-by-age/new-born-baby-gift-ideas?categories=Baby%20Activity%20Toys']");
    public static By babyActivityToys=By.xpath("//span[text()='Baby Activity Toys']");
    public static By earlyLearningCenter=By.xpath("//span[text()='Early Learning Centre']");
    public static By handEyeCoordination=By.xpath("//span[text()='Hand eye coordination']");
    public static By firstProduct=By.cssSelector("div[class='details'] > a[href='/baby-pre-school/rattles-and-teethers/Early-Learning-Centre-Octopus-Highchair-Spinner/p/554516']");
    public static By standardDelivery=By.xpath("//p[contains(text(),'Standard Delivery')]");
    public static By addToBasket=By.cssSelector("button[id='addToCartButton']");
    public static By continueShopping=By.cssSelector("a[href='javascript:window.location.reload(false)']");
    public static By home=By.cssSelector("li > a[href='/']");

}