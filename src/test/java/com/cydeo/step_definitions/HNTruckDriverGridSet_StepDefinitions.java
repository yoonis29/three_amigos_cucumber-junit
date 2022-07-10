package com.cydeo.step_definitions;

import com.cydeo.pages.HNTruckDriverGridPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HNTruckDriverGridSet_StepDefinitions {

    HNTruckDriverGridPage hnTruckDriverGridPage=new HNTruckDriverGridPage();
    LoginPage loginPage=new LoginPage();



    @Given("user as a truck driver logs in vytrack")
    public void user_as_a_truck_driver_logs_in_vytrack() {

        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
     //   loginPage.loginInput.sendKeys("user7");
        loginPage.loginInput.sendKeys(ConfigurationReader.getProperty("truckDriver"));
      //  loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("driver_password"));
        loginPage.submitBtn.click();

    }
    @When("truck driver goes to fleet")
    public void truck_driver_goes_to_fleet() {
        hnTruckDriverGridPage.fleet.click();
    }
    @When("navigates to Vehicle Fuel Logs")
    public void navigates_to_vehicle_fuel_logs() {
        hnTruckDriverGridPage.vehicleFuelLog.click();

    }
    @Then("driver should be able to click on grid settings button")
    public void driver_should_be_able_to_click_on_grid_settings_button() {

        hnTruckDriverGridPage.gridSettingsbtn.click();

        Assert.assertTrue(hnTruckDriverGridPage.gridSet.isDisplayed());


//        String expected="Grid Settings";
       // Assert.assertEquals(hnTruckDriverGridPage.gridSet.getText(),expected);


    }

}
