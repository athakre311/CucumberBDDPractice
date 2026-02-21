Feature: User Registration and Account Deletion

#Scenario: Verify user register 
#Given User is on login_Register page
#When User enters name and email address
#And User clicks on Signup button
#Then then user able to register and success message display

  Scenario: Register a new user and delete the account successfully

    Given User is on login_Register page
    #Then "New User Signup!" text should be visible

    When User enters name and email address
    And User clicks on Signup button
    #Then "ENTER ACCOUNT INFORMATION" text should be visible

    When User fills account details:
      | Title    | Mr                |
      | Name     | TestUser          |
      | Email    | testuser@test.com |
      | Password | Test@123          |
      | Day      | 10                |
      | Month    | May               |
      | Year     | 1995              |

    And User selects checkbox "Sign up for our newsletter!"
    And User selects checkbox "Receive special offers from our partners!"

    And User fills address details:
      | FirstName | Test        |
      | LastName  | User        |
      | Company   | ABC Pvt Ltd |
      | Address   | Street 1    |
      | Address2  | Area 51     |
      | Country   | India       |
      | State     | Maharashtra |
      | City      | Pune        |
      | Zipcode   | 411001      |
      | Mobile    | 9876543210  |

    And User clicks on "Create Account" button
    #Then "ACCOUNT CREATED!" text should be visible

    When User clicks on Continue button
    #Then "Logged in as username" should be visible

    When User clicks on Delete Account button
    #Then "ACCOUNT DELETED!" text should be visible
    #And User clicks on Continue button