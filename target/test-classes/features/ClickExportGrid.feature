
Feature: User should be able to click Export Grid dropdown




  Scenario:User as truck driver can click Export Grid dropdown
    When user puts the credential  on vytrack login page
    When user  clicks Vehicles under Fleet on driver page
    Then user should be able  click Export Grid
    And user should see Export Grid menu on driver page



  @exportGrid

  Scenario: SalesManager StoreManager can click Export Grid dropdown

    When user  clicks VehiclesForSm under FleetForSm
    Then user should be able  click Export Grid
    And user should see Export Grid Dropdown menu
