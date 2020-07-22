Feature: Login 

Background:
Given I am on Login Page


Scenario: Verify Login with Valid Details


When I enter valid details
|email|samragi_27@yahoo.co.uk|
|password|Samragi1|

Then I should successfully log in

Scenario: Verify Login with Invalid Details


When I enter invalid details
|email|samragi_@yahoo.co.uk|
|password|Samri1|

Then I should see the error message
