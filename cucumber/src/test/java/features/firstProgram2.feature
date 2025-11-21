Feature: netbanking and mortagage login application

Background:
Given Chrome browser is avaialbale
When user clicks on the chrome browser
Then chrome browser is launched.


@RegressionTest @Netbanking
Scenario: check netbanking admin login
Given user landed on loginpage
When user login into to application with "admin" and password "12345"
Then user landed on the home page

@Mortagae @RegressionTest

Scenario: check mortaguage user login
Given user landed on loginpage
When user login into to application with "user1" and password "1234535656"
Then user landed on the home page


