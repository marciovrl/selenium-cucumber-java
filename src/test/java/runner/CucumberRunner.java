package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/" }, glue = { "test/steps/definitions" }, tags = {
        "~@notImplemented" })

public class CucumberRunner {

    @BeforeClass
    public static void tearUp() {
    }

    @AfterClass
    public static void tearDown() {
        BasePage.quitBrowser();
    }
}