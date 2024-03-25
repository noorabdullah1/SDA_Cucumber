Feature: Name of Feature

  @samsung
  Scenario: TC01_samsung
    Given user goes to google page
    When user searches for "samsung"
    Then tests that the page title contains the word "samsung"
    And closes

