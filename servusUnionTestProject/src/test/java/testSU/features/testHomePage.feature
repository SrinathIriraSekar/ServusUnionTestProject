@testSU
Feature: Test Home Page

  @login
  Scenario Outline: login and navigate to home page Test 1
    Given Navigate to home page
    Then Check whether username, password and login button is present
    And Input email address <EmailAddress> and password <password> into the respective fields

    Examples: 
      | EmailAddress  | password |
      | sri@gmail.com | password |

  	Scenario: Listgroup check Test 2
    Given Navigate to home page
    When Check whether there are three values in the listgroup
    And check the second list item's value is set to "List Item 2"
    Then Check whether the second list item's badge value is 6

     Scenario: Listgroup check Test 3
    Given Navigate to home page
    When Check Option 1 is the default selected value
    Then Select Option 3 from the select list
     
        
      Scenario: Listgroup check Test 4
    Given Navigate to home page
    Then Check that the first button is enabled and that the second button is disabled
    
    
      Scenario: Listgroup check Test 5
    Given Navigate to home page
    When Click on the button once it's displayed
    And Once you've clicked the button, check that a success message is displayed
    Then Check that the button is now disabled
    
    
      Scenario: Listgroup check Test 6
    Given Navigate to home page
    When Find the value of any cell on the grid
    And Find the value of the cell at coordinates 2, 2
    Then Check whether the value of the cell is "Ventosanzap"
    
    