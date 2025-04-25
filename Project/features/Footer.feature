Feature: End-to-End HomePage and Checkout Functionality

  Scenario: User navigates through homepage, interacts with elements, adds product to cart, and checks out
    Given I navigate to the homepage
    When I accept cookies
    And I verify the homepage URL
    And I hover over the Learning Skills section
    And I click on Creativity
    And I verify the Creativity page URL
    And I click on Art & Craft
    And I apply the Creativity filter
    And I click on the first product
    And I verify the "minutes" text on the product page
    And I add the product to the basket
    And I proceed to checkout
    Then I should be navigated to the correct checkout page URL
    And a screenshot should be captured