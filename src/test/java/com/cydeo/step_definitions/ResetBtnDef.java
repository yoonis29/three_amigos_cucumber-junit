package com.cydeo.step_definitions;

import com.cydeo.pages.HomeVyTrack;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.VehiclesVyTrack;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResetBtnDef {

    WebDriver driver = Driver.getDriver();
    LoginPage loginVytrack = new LoginPage();
    HomeVyTrack homeVyTrack = new HomeVyTrack();
    VehiclesVyTrack vehiclesVyTrack = new VehiclesVyTrack();

    Actions action = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver,10);

    @Given("user is on vytrack login page")
    public void user_is_on_vytrack_login_page() {
        driver.get(ConfigurationReader.getProperty("env"));
    }

    @When("user logs in as {string}")
    public void user_logs_in_as(String userType) {
        String username = ConfigurationReader.getProperty(userType + "_username");
        String password = ConfigurationReader.getProperty(userType + "_password");
        loginVytrack.login(username, password);
    }

    @Then("user should see main dashboard")
    public void user_should_see_main_dashboard() {
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        Assert.assertEquals("Dashboard", driver.getTitle());
    }

    @Then("user clicks on vehicles")
    public void userClicksOnVehicles() {
        action.moveToElement(homeVyTrack.fleet).perform();
        homeVyTrack.vehicles.click();
        wait.until(ExpectedConditions.visibilityOf(vehiclesVyTrack.resetBtn));
    }

    @Then("user clicks on reset button")
    public void userClicksOnResetButton() throws InterruptedException {
        // press on next page button
        action.moveToElement(vehiclesVyTrack.nextPage).perform();
        vehiclesVyTrack.nextPage.click();
        wait.until(ExpectedConditions.attributeToBe(vehiclesVyTrack.pageNumber,"value","2"));
        Assert.assertEquals("2", vehiclesVyTrack.pageNumber.getAttribute("value"));
        action.moveToElement(vehiclesVyTrack.resetBtn);
        vehiclesVyTrack.resetBtn.click();
        wait.until(ExpectedConditions.attributeToBe(vehiclesVyTrack.pageNumber,"value","1"));
        Assert.assertEquals("1", vehiclesVyTrack.pageNumber.getAttribute("value"));
    }

    @Then("user should see required buttons")
    public void userShouldSeeRequiredButtons() {
        Assert.assertTrue(vehiclesVyTrack.exportGrid.isDisplayed());
        Assert.assertEquals("Refresh",vehiclesVyTrack.refreshBtn.getText());
        Assert.assertEquals("Reset", vehiclesVyTrack.resetBtn.getText());
        Assert.assertTrue(vehiclesVyTrack.gridSettings.isDisplayed());
        System.out.println("Asserted that all required buttons exist");
    }

}