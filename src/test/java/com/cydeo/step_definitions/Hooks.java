package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    // @Before is coming from cucumber. It is running before scenarios is running
    @Before
    public void setUpScenario() {
        System.out.println("---> It is coming from @Before in Hooks");
    }

    // @After is coming from cucumber. It is running after scenarios is running
    @After
    public void teatDownScenario(Scenario scenario) {
        System.out.println("---> It is coming from @After in Hooks");

        if (scenario.isFailed()) {  /// screenshot is avalable when there is problem or debug


            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());   // embed

            Driver.closeDriver();
        }
    }
}


