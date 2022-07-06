 @Regression
Feature: vytrack app login feature
  User Story:As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: truck driver, store manager, sale manager

  @truckdrvr
  Scenario: Login as truck driver
    Given user puts the credential  on vytrack login page
    Then user should see dashboard

  @slsMagr
  Scenario: Login as sales managers
    Given user put the credential  on vytrack login page
    Then user should able see dashboard


  @storeMgre
  Scenario: Login as store managers
    Given user puting the credential
    Then user should able to see dashboard

    @assert
    Scenario: Check refresh btn is left side of reset btn
      Given user locate the refresh btn
      Then user able to see the reset on the left side of the refresh