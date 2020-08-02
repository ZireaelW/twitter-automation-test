Feature: Login Twitter

  Scenario Outline: Login functionality for a social networking site.
    Given the user navigates to twitter
    When I click button login
    And I enter Username as "<username>"
    And I enter Password as "<password>"
    Then login should be successful

    Examples:
      | username                 | password  |
      | 082139805022             | ririn1212 |
      | username2                | password2 |
      | ririn.nurmaica@gmail.com | password2 |