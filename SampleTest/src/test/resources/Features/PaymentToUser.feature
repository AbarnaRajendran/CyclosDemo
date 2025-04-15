Feature: Abarna_BBD_TC2_Make a payment through Pay User in Banking Field
 Scenario: Make a payment through Pay User in Banking Field
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    When I click on "Pay User" button
    Then I get the available balance 
    And I select the user detail
    Then I make a payment in the "Amount " field
    And I click the payment confirmation mode in the field
    Then I should see a confirmation message saying "The payment was successfully processed"
    