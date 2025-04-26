@Car
Feature: Exploring Car-Related Options
	Scenario:  Validate car-related actions and verify navigation workflow.
		Given I click on aceept.
		When I verify the logo.
		And I click on searchBar
		And I enter data on serachBar "Cars".
		And I verify cars Url.
		And I click on showmore.
		And I click on Toy cars.
		And I click on Imaginative play.
		And I click on Fine motor skills
		And I click on first Product
		Then I click on wishlist.
		And I Navigate back.