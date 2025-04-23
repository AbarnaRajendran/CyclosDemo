Feature: Abarna_BBD_17APR_2025_checking Ticket Status
 Scenario: checking Ticket Status
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    Then I select the "Banking" feild 
    Then I select the Ticket Tap 
    And check the status in the Ticket field
        And Finally i close the browser