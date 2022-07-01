 @Regression
Feature: vytrack app login feature
  User Story:As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: truck driver, store manager, sale manager
  @truckDriver
  Scenario: Login as truck driver
    Given user is on vytrack login page
    When user enters truck driver username
    And user enters truck driver  password
    Then user should see dashboard


  Scenario: Login as store manager
    Given user is on vytrack login page
    When user enters store manager username
    And user enters store manager password
    Then user should see dashboard

  Scenario: Login as sales manager
    Given user is on vytrack login page
    When user enters sales manager username
    And user enters sales manager password
    Then user should see dashboard