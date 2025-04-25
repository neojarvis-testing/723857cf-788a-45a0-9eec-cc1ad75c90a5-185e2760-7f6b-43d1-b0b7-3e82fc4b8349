Feature: End-to-End Outdoor Toys Navigation and Checkout

  Scenario: User navigates through homepage, interacts with elements, adds a bike to the cart, and completes checkout
    Given I navigate to the homepage
    When I accept cookies
    And I verify the homepage URL
    And I hover over the Outdoor Toys section
    And I click on Bikes
    And I verify the Bikes page URL
    And I click on Huffy
    And I click on Toddler Bikes
    And I verify the search functionality
    And I click on Disney
    And I click on the first product
    And I add the product to the basket
    And I proceed to checkout
    Then I should be navigated to the correct checkout page
    And a screenshot should be captured