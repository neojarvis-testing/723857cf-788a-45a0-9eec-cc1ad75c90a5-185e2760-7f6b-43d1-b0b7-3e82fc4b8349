
Feature: Functionality in Toys Website

Scenario: Purchasing a toy

Given I click on Accept Cookies.

When I hover over the Brands section.

And I click on Paw Patrol.

Then I verify the URL matches the page.

When I click on Playsets & Action Figures.

Then I verify the filters are working correctly.

When I click on the Savings section.

And I click on a specific product.

Then I verify the product is available.

When I click on Add to Basket.

And I proceed to Check Out.

Then I verify the basket contains the selected items.
