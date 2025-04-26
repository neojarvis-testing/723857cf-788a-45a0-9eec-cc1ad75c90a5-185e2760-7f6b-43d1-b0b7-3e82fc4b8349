package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.When;
import pages.PuzzleHomePage;

public class PuzzlePage {
     public static ExtentTest test=Hooks.report.createTest("happyland");  
     public static PuzzleHomePage p=new PuzzleHomePage(test);
       /*
    * Method name :  i_hover_on_explore
    * Author name : PrasannaLaxmi
    * Description : Clicks on the accept cookies button and click on search
    * Return Type : void
    * Parameter : None
    */
     @When("I click search bar")
public void i_click_search_bar() {
    p.clickAcceptCookies();
    p.clickOnSearch();
}
  /*
    * Method name :  i_send_data
    * Author name : PrasannaLaxmi
    * Description : Clicks on send dat
    * Return Type : void
    * Parameter : None
    */
@When("I send data {string}")
public void i_send_data(String string) {
  p.sendadata(string);
}
/*
    * Method name : i_perform_enter
    * Author name : PrasannaLaxmi
    * Description : send data
    * Return Type : void
    * Parameter : None
    */

@When("I perform enter")
public void i_perform_enter() {
    p.performEnter();
}
/*
    * Method name : i_click_on_show_more
    * Author name : PrasannaLaxmi
    * Description : Clicks on showmore
    * Return Type : void
    * Parameter : None
    */
@When("I click on show more")
public void i_click_on_show_more() {
   p.clickOnShowmore();
}
/*
    * Method name :  i_click_jigsaw_puzzle
    * Author name : PrasannaLaxmi
    * Description : Clicks on jigsaw puzzle
    * Return Type : void
    * Parameter : None
    */
@When("I click jigsaw Puzzle")
public void i_click_jigsaw_puzzle() {
  p.clickOnJigsawPuzzle();
}
/*
    * Method name :  i_click_children_games
    * Author name : PrasannaLaxmi
    * Description : Clicks on children games
    * Return Type : void
    * Parameter : None
    */
@When("I click children games")
public void i_click_children_games() {
   p.clickOnChildren();
}
/*
    * Method name :  i_click_discover_world
    * Author name : PrasannaLaxmi
    * Description : Clicks on discover world
    * Return Type : void
    * Parameter : None
    */
@When("I click discover world")
public void i_click_discover_world() {
   p.clickOnDiscover();
}
/*
    * Method name :  i_click_on_first_product
    * Author name : PrasannaLaxmi
    * Description : Clicks on first product
    * Return Type : void
    * Parameter : None
    */
@When("I click on first product")
public void i_click_on_first_product() {
   p.clickOnFirst();
}
/*
    * Method name :  i_click_on_wishlist
    * Author name : PrasannaLaxmi
    * Description : Clicks on wishlist
    * Return Type : void
    * Parameter : None
    */
@When("I click on wishlist")
public void i_click_on_wishlist() {
  p.clickOnAddtoWishlist();
}
/*
    * Method name :  i_verify_learning
    * Author name : PrasannaLaxmi
    * Description : this method verify learning
    * Return Type : void
    * Parameter : None
    */
@When("I verify learning")
public void i_verify_learning() {
   p.verifyLearning();
}
}
