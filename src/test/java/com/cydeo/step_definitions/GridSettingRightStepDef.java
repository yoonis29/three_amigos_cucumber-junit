package com.cydeo.step_definitions;

import com.cydeo.pages.GridSettingOnRightPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GridSettingRightStepDef {

    LoginPage loginPage = new LoginPage();
    GridSettingOnRightPage gridSettingOnRightPage = new GridSettingOnRightPage();
    Actions actions= new Actions(Driver.getDriver());


    @Given("user is logged in vytrack application")
    public void user_is_logged_in_vytrack_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));

        loginPage.login("user7","UserUser123");



    }
    @When("user hovers over fleet Module")
    public void user_hovers_over_fleet_module() {
        BrowserUtils.waitForClickablility(gridSettingOnRightPage.fleetHover,5);

        actions.moveToElement(gridSettingOnRightPage.fleetHover).perform();

    }
    @When("user clicks on vehicles options")
    public void user_clicks_on_vehicles_options() {
        gridSettingOnRightPage.vehicleTab.click();

    }
    @Then("user should be able to identify {string} is on the right side og page")
    public void user_should_be_able_to_identify_is_on_the_right_side_og_page(String expected) {

//        actions.moveToElement(gridSettingOnRightPage.gridSettingBtN).perform();
//        gridSettingOnRightPage.gridSettingBtN.click();
//
//        WebElement li = gridSettingOnRightPage.gridSettingBtN;
        WebElement actual = Driver.getDriver().findElement(By.xpath("//*[@title = \"Grid Settings\"]/../../../.."));
        String actuals = actual.getAttribute("class");

        Assert.assertTrue(actuals.contains("right"));





    }
}
