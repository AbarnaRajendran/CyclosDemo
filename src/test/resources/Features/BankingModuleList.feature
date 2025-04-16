Feature: Abarna_BBD_TC8_15APR_2025_Checking whether all banking module list

  Scenario: Banking Module in the Banking Field
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    Then I select the "Banking" feild
    Then I get the available balance from the current account in the Member Account
    And I get the limit Balance from the member account
    And Finally i close the browser