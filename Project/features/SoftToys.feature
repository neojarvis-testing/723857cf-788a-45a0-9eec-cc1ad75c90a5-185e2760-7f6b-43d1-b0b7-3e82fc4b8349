Feature: Soft Toys
    Scenario: To add the Soft Toys product to the basket
        Given I click on Accept Cookies.
        When I hover on Type Of Toy.
        And I click on Soft Toys.
        And I verify URL.
        And I click on Dolls.
        And I click on Soft Toys Under Toy Type.
        And I verify Brands.
        And I click on Simulating Senses.
        And I click on First Product Soft Toys.
        And I verify Home Delivery.
        And I click on Add To Basket.
        And I click on Continue Shopping.
        Then I verify Home.