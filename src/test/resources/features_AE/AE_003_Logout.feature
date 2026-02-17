Feature: Logout functionality

Scenario: Successful login and logout with valid credentials
Given User is on login_Register page
When User enter valid userName "test1@test" and password "12345"
And user click on login button
Then verify "Logged in as test" should be visible
When user clicks on Logout button
Then Verify user should be navigated to login page