package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import utils.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "io.qameta.allure.cucumberjvm.AllureCucumberJvm" }, features = {
        "src/test/resources/" }, glue = { "test/steps/definitions" }, tags = { "~@notImplemented" })

public class CucumberRunner {

    @BeforeClass
    public static void tearUp() {
    }

    @After
    public static void tearDown() {
        BasePage.quitBrowser();
    }
}