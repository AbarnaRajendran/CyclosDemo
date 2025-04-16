Feature: Abarna_BBD_16APR_2025_User Settings Management
 Scenario:  User Settings Management
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    Then I select the "Dashboard" field
    When I navigate to the settings page
  Then I should see my current settings 
    And Finally i close the browser
    