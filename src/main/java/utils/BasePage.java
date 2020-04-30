package utils;

import static utils.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private static final long DEFAULT_TIME_WAIT = 50;

    public BasePage() {
    }

    protected void openUrl(String url) {
        getDriver().get(url);
    }

    protected WebElement waitElement(By locator) {
        return new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected List<WebElement> waitElements(By locator) {
        return new WebDriverWait(getDriver(), DEFAULT_TIME_WAIT)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    protected WebElement getElement(By locator) {
        return this.waitElement(locator);
    }

    protected List<WebElement> getElements(By locator) {
        return this.waitElements(locator);
    }

    protected void click(By locator) {
        this.waitElement(locator);
        this.getElement(locator).click();
    }

    protected void sendKeys(By locator, String text) {
        this.waitElement(locator);
        this.getElement(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        return this.getElement(locator).getText().trim();
    }

    protected void pressTab(By locator) {
        this.getElement(locator).sendKeys(Keys.TAB);
    }

    protected void pressEnter(By locator) {
        this.getElement(locator).sendKeys(Keys.ENTER);
    }
}