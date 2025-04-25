package uistore;

import org.openqa.selenium.By;

public class SoftToysPageLocator {
    public static By dolls=By.cssSelector("a[href='https://www.elc.co.uk/c/soft-toys?categories=Dolls']");
    public static By softToysUnderToyType=By.cssSelector("a[href='https://www.elc.co.uk/c/soft-toys?categories=Soft%20Toys']");
    public static By brands=By.xpath("//div[contains(text(),' Brands ')]");
    public static By simulatingSenses=By.xpath("//span[text()='Stimulating senses']");
    public static By firstProductSoftToys=By.cssSelector("div[class='details'] > a[href='/soft-toys/animal-plush/Early-Learning-Centre-Plush-Toy---Triceratops-Soft-Toy/p/560323']");
    public static By homeDelivery=By.id("labelHomeDeliverySelected");
    public static By addToBasket=By.cssSelector("button[id='addToCartButton']");
    public static By continueShopping=By.cssSelector("a[href='javascript:window.location.reload(false)']");
    public static By home=By.cssSelector("li > a[href='/']");
}