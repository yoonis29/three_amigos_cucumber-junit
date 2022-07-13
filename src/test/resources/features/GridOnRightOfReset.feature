Feature: Grid setting button should be on the right side of the reset button

  user story: user should see the Grid setting button on the right side of the reset button

  @gridOnRight
  Scenario: Grid setting Button location verification
    Given user logged in
    When user navigates to Fleet module
    And user clicks Vehicles
    And user see the reset button
    Then user see the Grid setting on the right side of reset button