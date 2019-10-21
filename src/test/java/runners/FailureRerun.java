package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "@rerun/failed_scenarios.txt", monochrome = true, 
        plugin = {
        "pretty", "html:target/cucumber-report/single",
        "json:target/cucumber-report/single/cucumber.json",
        "rerun:rerun/failed_scenarios.txt"},
        glue = "steps"
        )
public class FailureRerun extends AbstractTestNGCucumberTests {} 