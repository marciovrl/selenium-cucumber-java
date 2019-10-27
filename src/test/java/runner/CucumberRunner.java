package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/" }, plugin = {
        "io.qameta.allure.cucumberjvm.AllureCucumberJvm" }, glue = { "test/steps/" }, tags = { "~@notImplemented" })

public class CucumberRunner {

    @BeforeClass
    public static void tearUp() {
    }
}