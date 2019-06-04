package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:reports/test-report" }, features = { "src/test/resources/" }, glue = {
        "test/steps/definitions" }, tags = { "~@notImplemented" })

public class CucumberRunner {

    @BeforeClass
    public static void tearUp() {
    }
}