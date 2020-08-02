Feature: Post Text And Image

  Scenario Outline: Text and image is successfully posted
    Given I already logged in with "<username>" and "<password>"
    And I navigate to home page
    When I enter tweet text as "<text>"
    And I enter tweet image as "<image>"
    And I click tweet button
    Then Tweet should be posted

    Examples:
      | username     | password  | text           | image                                  |
      | 082139805022 | ririn1212 | tesss ppostt 2 | /home/nodeflux/Pictures/view.jpeg      |
      | 082139805022 | ririn1212 | tesss ppostt 3 | /home/nodeflux/Pictures/testError.jpeg |

