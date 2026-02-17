Feature: User Registration
	Description of feature file 
	
  Scenario: Register with mandatory fields
    Given user navigate to Register page
    When User enters firstname below details into fields
    |firstname      |Abhi|
    |lastname      |Thakre|
    |email      |Thakre|   
    |password      |Thakre|
    And User select privacy policy field  
    And click on continue button   
    Then Account should get successfully created
