Feature: Abarna_BBD_TC4_Get the available balance in the Member Account 
 Scenario: Get the available balance in the Member Account
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    Then I select the "Banking" feild 
    Then I get the available balance from the current account
    And I get the limit Balance 
    Then I download the details
    And Finally i close the browser
    
    
   
    
