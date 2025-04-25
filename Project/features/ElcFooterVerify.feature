Feature: Validating Page Links and URLs
	Scenario: Click through pages and confirm URL accuracy.
        Given I click on accept.
        When I click on contact Us.
        And I verify the contactUS URL.
        When I click on Delivery Option.
        And I verify the Deliery option URL.
        When I click on Product Safety Notices.
        And I verify the Product Safety URL.
        When I click on Returns.
        And I verify the Returns URL.
        When I click on Track your order.
        And I verify the Track your order URL.
        When I click on HelpCentre.
        And I verify the Help Centre URL.
        When I click on Privacy Policy.
        And I verify the Privacy Policy URL.
        When I click on How to complain.
        And I verify the How to complain URL.
        Then I verify About us.