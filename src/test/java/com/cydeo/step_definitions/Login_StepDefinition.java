package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinition {

    @Given("user is on vytrack login page")
    public void user_is_on_vytrack_login_page() {
        System.out.println("user is on vyTrack login page");

    }
    @When("user enters truck driver username")
    public void user_enters_truck_driver_username() {
        System.out.println("user enters username for truck driver");

    }
    @When("user enters truck driver  password")
    public void user_enters_truck_driver_password() {
        System.out.println("user enter password for truck driver");

    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("user should be able to navigate to vytrack home page");

    }

}
