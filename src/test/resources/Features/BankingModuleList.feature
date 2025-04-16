Feature: Abarna_BBD_TC8_15APR_2025_Checking whether all banking module list 
 Scenario: Banking Module in the Banking Field
     Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    Then I select the "Banking" feild 
    Then I get the available balance from the current account
    And I get the limit Balance 
    Then I download the details
    Then I select the "File type" in the banking field
    And Finally i close the browser
    