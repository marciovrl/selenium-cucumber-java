package test.steps;

import cucumber.api.java.After;
import utils.BasePage;

public class Hooks {

    @After
    public void tearDown() {
        BasePage.quitBrowser();
    }
}