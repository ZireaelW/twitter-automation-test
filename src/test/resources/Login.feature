Feature: Login

  Scenario Outline: User is successfully logged in
    Given I navigate to twitter page
    When I navigate to login page
    And I enter user name as "<username>"
    And I enter password as "<password>"
    And I click login botton
    Then Login should be successful

    Examples:
      | username                 | password  |
      | 082139805022             | ririn1212 |
      | username2                | password2 |
      | ririn.nurmaica@gmail.com | password2 |