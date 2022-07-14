Feature: User should be able to click Grid settings button
  @wip @truckdriver
  Scenario: Truck driver clicks Grid settings button

    Given user as a truck driver logs in vytrack
    When truck driver goes to fleet
    And navigates to Vehicle Fuel Logs
    Then driver should be able to click on grid settings button


