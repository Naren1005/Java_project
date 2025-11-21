Feature: login application

Background:
Given Chrome browser is avaialbale
When user clicks on the chrome browser
Then chrome browser is launched.


@RegressionTest
Scenario: check admin login
Given user landed on loginpage
When user login into to application with "admin" and password "12345"
Then user landed on the home page

@UnitTest
Scenario: check user login
Given user landed on loginpage
When user login into to application with "user1" and password "1234535656"
Then user landed on the home page

#parametarising
@RegressionTest
Scenario Outline: check user login with multiple data sets
Given user landed on loginpage
When user login into to application with "<username>" and password "<password>" 
Then user landed on the home page

Examples:
| username | password |
| naren	| 1234@d |
|vindhya | 1234$e |

@RegressionTest @UnitTest
#sending parameters in the when statement
Scenario: user signing up
Given user is on signup page
When  capture the details  
| Naren |
| 43 |
| narendra.av@gmail.com |
| 522001 |
Then signed up popup is displayed


