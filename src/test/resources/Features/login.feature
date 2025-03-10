Feature: Test login Functionality and Make Payment

  Scenario: Check LOgin with valid credentials
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    When I navigate to my "Profile" page
    And I get my personal information (e.g., name, contact info)
    Then I logged out the page
    And Finally i close the browser

  Scenario: Make a payment through Pay User
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    When I click on "Pay User" button
    Then I get the available balance from the current account
    And I select the user details
    Then I make a payment in the "Amount " field
    And I click the payment confirmation mode
    Then I should see a confirmation message saying "The payment was successfully processed"
