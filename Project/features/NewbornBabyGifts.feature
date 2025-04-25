Feature: Newborn Baby Gifts Toys
    Scenario: To buy a Newborn Baby Gifts Toy and Add to Basket
        Given I click on Accept all Cookies.
        When I hover on Shop by Age.
        And I click on Newborn Gifts.
        And I verify url.
        And I click on Show more.
        And I click on Baby Activity Toys.
        And I click on Early Learning Centre.
        And I click on Hand Eye Coordination.
        And I click on First Product.
        And I verify Standard Delivery.
        And I click on Add To Basket.
        And I click on Continue Shopping.
        Then I verify Home.