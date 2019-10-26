package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private static WebDriver driver;
    private static final long DEFAULT_TIME_WAIT = 50;

    public BasePage() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    protected void openUrl(String url) {
        driver.get(url);
    }

    public static void quitBrowser() {
        driver.quit();
    }

    protected WebElement waitElement(By locator) {
        return new WebDriverWait(driver, DEFAULT_TIME_WAIT).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected List<WebElement> waitElements(By locator) {
        return new WebDriverWait(driver, DEFAULT_TIME_WAIT)
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

    protected boolean isVisible(By locator) {
        this.waitElement(locator);
        return this.getElement(locator).isDisplayed();
    }

    protected String getText(By locator) {
        return this.getElement(locator).getText().trim();
    }

    protected String getText(WebElement element) {
        return element.getText().trim();
    }

    protected boolean isElementAttachedToHtml(By locator) {
        try {
            this.waitElement(locator);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected void pressTab(By locator) {
        this.isVisible(locator);
        this.getElement(locator).sendKeys(Keys.TAB);
    }

    protected void pressEnter(By locator) {
        this.isVisible(locator);
        this.getElement(locator).sendKeys(Keys.ENTER);
    }

    public static WebDriver getDriver() {
        return driver;
    }
}