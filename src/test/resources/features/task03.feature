Feature: Fill out form on testpages.eviltester.com

  Scenario Outline: Fill form with details - "<firstname>", "<username>", "<age>", "<country>"
    Given I navigate to the form page
    When I fill in the form with "<firstname>", "<username>", "<age>", "<country>"
    And I submit the form
    Then I should see a success message

    Examples:
      | firstname | username    | age | country |
      | Noor      | Noor123     | 25  | KSA     |
      | Abdullah  | Abdullah123 | 30  | UK      |
      | Walaa     | Walaa123    | 50  | US      |