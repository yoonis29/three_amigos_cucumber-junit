package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Login_StepDefinition {

    LoginPage loginPage = new LoginPage();


    // login to the pagee......As Track Driver
    @Given("user puts the credential  on vytrack login page")
    public void userPutsTheCredentialOnVytrackLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");

        loginPage.login(username, password);
        BrowserUtils.waitFor(3);

          }

    // login to the vehicle board   .....Fleet >>> Vehicle
    @Then("user should see dashboard")
    public void userShouldSeeDashboard() {
        Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-1\"])[1]")).click();
        Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-2\"])[1]")).click();

    }

        // as sales manager
    @Given("user put the credential  on vytrack login page")
    public void userPutTheCredentialOnVytrackLoginPage() {  ////////////  ...As Sales Manager

        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
        String username = ConfigurationReader.getProperty("sales_manager_username");
        String password = ConfigurationReader.getProperty("sales_manager_password");
        loginPage.login(username, password);
        BrowserUtils.waitFor(3);
    }

    @Then("user should able see dashboard")
    public void userShouldAbleSeeDashboard() {
        Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-1\"])[2]")).click();
        Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-2\"])[9]")).click();
    }

    // as store manager
    @Given("user puting the credential")
    public void userPutingTheCredential() {  /// As Store Manager

        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
        String username = ConfigurationReader.getProperty("store_man_username");
        String password = ConfigurationReader.getProperty("store_man_password");
        loginPage.login(username, password);
        BrowserUtils.waitFor(3);

    }
    @Then("user should able to see dashboard")
    public void userShouldAbleToSeeDashboard() {
        Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-1\"])[2]")).click();
        Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-2\"])[9]")).click();
        BrowserUtils.waitFor(3);

//       Driver.getDriver().findElement(By.xpath("//a[@href=\"Reset\"]")).click();    // reset buttton
////        Driver.getDriver().findElement(By.xpath("//i[@class=\"fa-cog hide-text\"]")).click();    // grid setting
    }

    // Assertion - refresh Vs Reset
    @Given("user locate the refresh btn")
    public void userLocateTheRefreshBtn() {

        WebElement refreshbtn = Driver.getDriver().findElement(By.xpath("//a[@title=\"Refresh\"]//following-sibling::a"));
        WebElement resetbtn = Driver.getDriver().findElement(By.xpath("(//a[@title=\"Reset\"]//preceding-sibling::a)[2]"));

        BrowserUtils.waitFor(3);
        refreshbtn.click();
        resetbtn.click();
        BrowserUtils.waitFor(3);
//        Driver.getDriver().findElement(By.xpath("//i[@class=\"fa-cog hide-text\"]")).click();    // grid setting


    }

    // Able to see the Assertions
    @Then("user able to see the reset on the left side of the refresh")
    public void userAbleToSeeTheResetOnTheLeftSideOfTheRefresh() {

        WebElement refreshbtn = Driver.getDriver().findElement(By.xpath("//a[@title=\"Refresh\"]//following-sibling::a"));
        WebElement resetbtn = Driver.getDriver().findElement(By.xpath("(//a[@title=\"Reset\"]//preceding-sibling::a)[2]"));

        System.out.println("refreshToResetBetter.isDisplayed() = " + refreshbtn.isDisplayed());
        System.out.println("resetToRefreshBetter.isDisplayed() = " + resetbtn.isDisplayed());


        Driver.getDriver().findElement(By.xpath("(//button[@data-toggle=\"dropdown\"])[1]")).click();     // 10~ 50 ~ 100
        Driver.getDriver().findElement(By.xpath("(((//ul[@class=\"dropdown-menu pull-right\"])[2]/li))[1]")).click();     // 10s
        BrowserUtils.waitFor(3);
//        Driver.getDriver().findElement(By.xpath("(((//ul[@class=\"dropdown-menu pull-right\"])[2]/li))[2]")).click();     // 20s
        Driver.getDriver().findElement(By.xpath("(//button[@data-toggle=\"dropdown\"])[1]")).click();     // 10~ 50 ~ 100
        BrowserUtils.waitFor(3);
        Driver.getDriver().findElement(By.xpath("(((//ul[@class=\"dropdown-menu pull-right\"])[2]/li))[3]")).click();     // 50s
        BrowserUtils.waitFor(3);
        Driver.getDriver().findElement(By.xpath("//i[@class=\"fa-cog hide-text\"]")).click();    // grid setting





    }
}