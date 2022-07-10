package com.cydeo.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)    // cukes makes all run all my features and step definitions.
@CucumberOptions (
        plugin = "html:target/cucumber-reports.html",
//                 "me.jvt.cucumber.report.PrettyReports:target/cucumber" },
        features = "src/test/resources/features" , // path of feature file, give direction
        glue = "com/cydeo/step_definitions",  // implementation , step definitions package,,,,glue-step class definitions
        dryRun = false,   // don't run my step-definition but check if any step is missing snippet ...true= get snippet
        tags =  "@wip" // keyword of the feauture      @wip or @smoke         // @Regression  // @wip or @smoke
                                    //  @storeMgre         @truckdrvr    @slsMagr

        // keyword of the feauture
        // @Regression and not student  =( prints all regression but NOT student)
        // @librarian and student = will not run unless you have both tag in the feature
        // @librarian or student = runs both
        //
)
public class CukesRunner {


}