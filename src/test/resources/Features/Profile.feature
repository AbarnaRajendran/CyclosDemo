Feature: Abarna_BBD_17APR_2025_User Update their Profile
 Scenario: User Update their Profile
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    When I navigate to my "Profile" page
    And I get my personal information (e.g., name, contact info)
      And Finally i close the browser