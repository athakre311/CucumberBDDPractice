Feature: Login page Automation of saucedemo App

#Background: 


  Scenario Outline: Check login is successful with valid credentials
    Given User is on login page
    When User enter valid "<email>" and "<password>"
    And Click on login button
    Then User is nevigate to home page
    And Close tha Browser

Examples:
   |email|password|
   |standard_user |secret_sauce   |
   |locked_out_user |secret_sauce   |
   |problem_user |secret_sauce   |
   |performance_glitch_user |secret_sauce   |
   
    
    #Scenario: Login with Invalid credentials
    #When User enter valid "test@test" and "test@123"
    #And Click on login button
    #Then User is nevigate to home page
    #And Close tha Browser