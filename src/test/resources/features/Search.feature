Feature: Search functionality
	Description of feature file 
	
  Scenario: Search for valid product
    Given user open application
    When User enters valid product into search field
    And user click on search button   
    Then valid product get displayed in the search results
