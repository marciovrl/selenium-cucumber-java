package test.steps.definitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchItemSteps {

    private static WebDriver driver;

    @Before
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^that it is on the homepage of Mercado Livre$")
    public void that_it_is_on_the_homepage_of_Mercado_Livre() {
        driver.get("https://www.mercadolivre.com.br/");
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String item) {
        driver.findElement(By.name("as_word")).sendKeys(item);
        driver.findElement(By.className("nav-search-btn")).click();
    }

    @Then("^I view items according to my search$")
    public void i_view_items_according_to_my_search() {
        assertTrue(driver.findElement(By.className("main-title")).isDisplayed());
    }

    @After
    public static void after() {
        driver.quit();
    }
}