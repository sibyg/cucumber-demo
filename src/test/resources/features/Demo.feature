Feature: search on google page

  Scenario: search
    Given I am on the website 'http://www.google.com'
    When I submit the search term 'opencms'
    And I accept the first search result
    Then I should be on the page 'http://www.opencms.org/en/'