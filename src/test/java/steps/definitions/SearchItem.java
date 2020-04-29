package steps.definitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class SearchItem {

    private static WebDriver driver;

    @Before
    public static void tearUp() {
        driver = new ChromeDriver();
    }

    @After
    public static void tearDown() {
        driver.close();
    }

    @Given("^that it is on the homepage of Mercado Livre$")
    public void thatItIsOnTheHomepageOfMercadoLivre() throws Throwable {
        driver.get("https://www.mercadolivre.com.br/");
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String item) throws Throwable {
        driver.findElement(By.name("as_word")).sendKeys(item);
        driver.findElement(By.className("nav-search-btn")).click();
    }

    @Then("^I view items according to my search$")
    public void iViewItemsAccordingToMySearch() throws Throwable {
        Thread.currentThread().sleep(2000);

        String result = driver.findElement(By.cssSelector("h1.breadcrumb__title")).getText();

        assertTrue(result.contains("golf"));

    }
}