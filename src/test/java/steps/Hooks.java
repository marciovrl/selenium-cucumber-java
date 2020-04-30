package steps;

import cucumber.api.java.After;
import utils.DriverFactory;

public class Hooks {
    @After
    public static void tearDown() {
        DriverFactory.closeDriver();
    }
}