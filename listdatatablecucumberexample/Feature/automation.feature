Feature: Calculate the total from the list of real numbers

Scenario: calculate summation of list of real numbers
Given a list of real numbers
|25.0|
|1500.0|
|580.0|
|600.0|
When I calculate sum of them
Then I will get 2705.0