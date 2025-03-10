Feature: Test login Functionality and Make Payment

  Scenario: Check LOgin with valid credentials
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    When I navigate to my "Profile" page
    And I get my personal information (e.g., name, contact info)
    Then I logged out the page 
    And Finally i close the browser

  