Feature: Abarna_BBD_16APR_2025_Download the bank deatials in the Banking Feild
 Scenario: Download the bank deatials in the Banking Feild
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    Then I select the "Banking" feild 
    Then I get the available balance from the current account in the Member Account
    And I get the limit Balance from the member account
    Then I download the details in the Banking Feild
    Then I select the "File type" in the banking field
    And Finally i close the browser
    
    