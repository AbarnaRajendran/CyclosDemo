Feature: Abarna_BBD_Get the available balance in the Member Account 
 Scenario: Get the available balance in the Member Account
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    Then I select the "Banking" feild 
    Then I get the available balance from the current account in the Member Account
    And I get the limit Balance from the member account
    Then I download the details in the Banking Feild
    And Finally i close the browser
    
    
   
    
