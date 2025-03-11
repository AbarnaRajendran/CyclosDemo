Feature: Make a payment through Pay to System in Banking Field

@test1
Scenario: Make a payment through Pay to System in Banking Field
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    Then I select the "Banking" feild 
    When I click on "Payment to System" button in the Banking
    Then I get the available balance from the current account
    Then I make a payment in the "Amount " field in the banking
    And I click the payment confirmation mode
    Then I should see a confirmation message saying "The payment was successfully processed"
  