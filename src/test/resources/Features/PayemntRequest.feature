Feature: Abarna_BBD_17APR_2025_User check Payment Request
 Scenario: User check Payment Request
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    Then I select the "Banking" feild 
    Then I get the available balance from the current account in the Member Account
    And I get the limit Balance from the member account
    Then I download the details in the Banking Feild
    Then I select the "File type" in the banking field
    And Finally i close the browser