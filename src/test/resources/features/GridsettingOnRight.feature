Feature: Grid Setting Feature

  @yoyo
  Scenario: Locate Grid Setting on the right side of the page
    Given user is logged in vytrack application
    When user hovers over fleet Module
    And user clicks on vehicles options
    Then user should be able to identify "Grid Settings" is on the right side og page
