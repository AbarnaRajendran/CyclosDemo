Feature: Abarna_BBD_17APR_2025_Transfer money to another user

  Scenario: Transfer money to another user
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    Then I select the "Banking" feild
    When the user navigates to "Make a Payment"
    And enters recipient john_doe and amount 100
    And confirms the transaction
    Then the payment should be processed successfully
    And a confirmation message should be shown
