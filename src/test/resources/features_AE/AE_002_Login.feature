Feature: Verify login functionality 

Scenario: Verify login with valid credentails

Given User is on login_Register page
When User enter valid userName "test1@test" and password "12345"
And user click on login button
Then User should redirect to dashboard
And Dashboard welcome message should be displayed
 