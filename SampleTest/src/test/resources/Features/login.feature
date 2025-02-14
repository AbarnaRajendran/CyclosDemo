Feature: Test login Functionality

  Scenario: Check LOgin with valid credentials
    Given user is on login page
    When user enterusername and password
    And Verify Dashboard page
    Then close the website
  
  