Feature: Registration into the edx website

Scenario: Register to edx website
Given User is on edx registration page
When User enter details
|email|sample2019@gmail.com|
|fullname|sampleexample|
|username|sample2019|
|password|Pa$$w0rd1|
|country|IN|
Then user gets registered