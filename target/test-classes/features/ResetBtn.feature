@allUsersResetButton
Feature: vytrack app login feature
  User Story:As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: truck driver, store manager, sales manager

  Background:
    Given user is on vytrack login page

  @truckDriver
  Scenario: Login as a truck driver

    When user logs in as "truckdriver"
    And user should see main dashboard
    Then user clicks on vehicles
    Then user should see required buttons
    Then user clicks on reset button

  @storeManager
  Scenario: Login as a store manager

    When user logs in as "storemanager"
    And user should see main dashboard
    Then user clicks on vehicles
    Then user should see required buttons
    Then user clicks on reset button

  @salesManager
  Scenario: Login as a sales manager

    When user logs in as "salesmanager"
    And user should see main dashboard
    Then user clicks on vehicles
    Then user should see required buttons
    Then user clicks on reset button