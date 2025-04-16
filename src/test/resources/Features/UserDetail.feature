
Feature: Abarna_BBD_16APR_2025_Validate the current user details

  Scenario: Validate the current user details
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    When I navigate to my "Profile" page
   And I am on the settings or profile page
  When I view my user details
  Then I should see my full name, email, and contact number
  And the details should match the data stored in the system

 

