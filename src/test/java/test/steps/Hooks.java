package test.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.BasePage;

public class Hooks {

    @After
    public void afterScenario() {
        BasePage.quitBrowser();
    }
}