Feature: Post Text And Image

  Scenario Outline: Post text and image in twitter
    Given I login aplication twitter
    When I insert user name as "<userid>"
    And I insert password as "<password>"
    And I click icon home
    And I insert post text as "<text>"
    And I click and select icon image as "<image>"
    And I click button tweet
    Then Data text and image success post in twitter

    Examples:
      | userid       | password  | text           | image                                  |
      | 082139805022 | ririn1212 | tesss ppostt 2 | /home/nodeflux/Pictures/view.jpeg      |
      | 082139805022 | ririn1212 | tesss ppostt 3 | /home/nodeflux/Pictures/testError.jpeg |

