package com.cydeo.step_definitions;

import com.cydeo.pages.FleetManagementPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.VehiclesVyTrack;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GridOnRightOfReset {

    LoginPage base = new LoginPage();
    FleetManagementPage fleet = new FleetManagementPage();
    VehiclesVyTrack vehiclesPage = new VehiclesVyTrack();


    @Given("user logged in")
    public void user_logged_in() {
        base.loginAsDriver();
//        Driver.getDriver().get(ConfigurationReader.getProperty("url.login.page"));
//        base.usernameBox.sendKeys(ConfigurationReader.getProperty("driver.username"));
//        base.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
//        base.loginBut.click();
    }

    @When("user navigates to Fleet module")
    public void userNavigatesToFleetModule() {
        fleet.fleet_for_driver.click();
    }

    @When("user clicks Vehicles")
    public void userClicksVehicles() {
        fleet.vehicles_for_driver.click();
    }

    @When("user see the reset button")
    public void user_see_the_reset_button() {
        Assert.assertTrue(vehiclesPage.resetBtn.isDisplayed());
    }

    @Then("user see the Grid setting on the right side of reset button")
    public void user_see_the_grid_setting_on_the_right_side_of_reset_button() {
        Assert.assertTrue(vehiclesPage.gridSettings.isDisplayed());
    }

}
