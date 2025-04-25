package uistore;

import org.openqa.selenium.By;

public class ElcCarsHomePageLocator {
    private ElcCarsHomePageLocator(){}
    public static final By verifyCar = By.cssSelector("h1[class='plp-heading']");
    public static final By showMore = By.cssSelector("button[class='ais-Menu-showMore facet__more']");
    public static final By toyCars = By.cssSelector("a[href='https://www.elc.co.uk/search/?text=Cars&categories=Toy%20Cars']");
    public static final By imaginativePlay = By.xpath("//span[text()='Imaginative play']");
    public static final By fineMotorSkills = By.xpath("//span[text()='Fine motor skills']");
    public static final By selected = By.cssSelector("div[id='currentRefinements'] div[class='ais-Panel facet__panel']");
    public static final By firstProduct = By.cssSelector("div[class='details']>a[href='/shop-by-age/1-2-years/Early-Learning-Centre-Rosie-Rabbit-and-her-Motor-Car/p/559476']");

}
