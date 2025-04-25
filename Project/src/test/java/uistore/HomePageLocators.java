package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {
    //Pratham
    //testcase8
    public static final By accept = By.id("onetrust-accept-btn-handler");
    public static final By popup = By.cssSelector(".dy-lb-close");
    public static final By logo=By.cssSelector("img[title='Early Learning Centre']");
    public static final By searchBarHomePage = By.id("autocomplete-0-input");
    //testcase9 
    public static final By contactUs = By.cssSelector(" div[class='container-fluid'] a[href='https://theentertainer.zendesk.com/hc/en-gb/articles/6495305266833-Contact-Us']");
    public static final By delivery = By.cssSelector(" div[class='container-fluid'] a[title='Delivery Options']");
    public static final By productSafety = By.cssSelector(" div[class='container-fluid'] a[title='Product Safety Notices']");
    public static final By returns = By.cssSelector(" div[class='container-fluid'] a[title='Returns']");
    public static final By trackYourOrder = By.cssSelector("li[class='yCmsComponent footer__link']  a[href='/my-account/orders']");
    public static final By helpCenter = By.cssSelector("li[class='yCmsComponent footer__link']  a[title='Help Centre']");
    public static final By privacyPolicy = By.cssSelector("li[class='yCmsComponent footer__link']  a[title=' Your Privacy']");
    public static final By howToComplain = By.cssSelector("li[class='yCmsComponent footer__link']  a[title='How To Complain']");
    public static final By about = By.cssSelector("li[class='yCmsComponent footer__link']  a[title='About us']");
}
