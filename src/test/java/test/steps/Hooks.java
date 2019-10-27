package test.steps;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.qameta.allure.Allure;
import utils.BasePage;

public class Hooks {

    @After
    public void afterScenario(Scenario scenario) {
        byte[] screenshootBytes = ((TakesScreenshot) BasePage.getDriver()).getScreenshotAs(OutputType.BYTES);
        InputStream screenshootStream = new ByteArrayInputStream(screenshootBytes);
        Allure.addAttachment(scenario.getName(), screenshootStream);
        BasePage.quitBrowser();
    }
}