Feature: Search Functionality

Scenario Outline: to verify search with valid data

Given I am on Home Page
When I enter the valid "<search>" details
Then I should see related search products

Examples: 
|search|
|shorts|
|joggers|
|159431|

Scenario Outline: to verify search with invalid data

Given I am on Home Page
When I enter the invalid "<search>" details
Then I should see a message

Examples: 
|search|
|dgdgdfgdfg|
|834798375983759|
|mr246gdhns|

Scenario: Verify Search with auto suggestions

Given I am on Home Page
When I enter first few characters in Search field
Then Auto suggestion should be displayed



