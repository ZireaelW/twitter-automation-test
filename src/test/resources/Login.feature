Feature: Login

  Scenario Outline: User try to login
    Given I navigate to twitter page
    When I navigate to login page
    And I enter user name as "<username>"
    And I enter password as "<password>"
    And I click login botton
    Then Login should be "<result>"

    Examples:
      | username         | password      | result  |
      | 082139805022     | ririn1212     | Success |
      | 082139805022     | dummyPassword | Failed  |
      | unregisteredUser | dummyPassword | Failed  |
