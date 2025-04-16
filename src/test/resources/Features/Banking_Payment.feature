Feature: Abarna_BBD_Banking Module
 Scenario: Select the banking Modulue
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    Then I select the "Banking" feild 
     And Finally i close the browser