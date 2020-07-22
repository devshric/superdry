Feature: End to End Functionality

@smoke
Scenario: 
Given I am on homepage
When I add products to the basket
And I click on checkout button
And I continue as a guest user
And I click on Buy now
Then I will be able to successfully place the order


