Feature: Cucumber can convert Gherkin table to map

Scenario: Price List Per item
Given the price list of the coffee shop
|coffee|1|
|donut|2|
When I order 1 "coffee"
When I order 1 "donut"
Then price is 3