Feature: Example of background on cucumber

Background: lambdatest login
Given User is on lamdbatest login page

Scenario:
Login of first user
When User provides "sudarshang@hexaware.com" as username and "password1" as password
Then User moves to landing page

Scenario:
Login of second user
When User provides "gov.rajan@rediffmail.com" as username and "password1" as password
Then User moves to landing page

