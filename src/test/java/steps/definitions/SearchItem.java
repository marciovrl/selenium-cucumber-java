package steps.definitions;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import pages.Home;
import pages.SearchResult;
import utils.DriverFactory;

public class SearchItem {

    private static Home pageHome;
    private static SearchResult pageSearchresult;

    @Before
    public static void tearUp() {
        DriverFactory.getDriver();
        pageHome = new Home();
        pageSearchresult = new SearchResult();
    }

    @Given("^that it is on the homepage of Mercado Livre$")
    public void thatItIsOnTheHomepageOfMercadoLivre() throws Throwable {
        pageHome.goToHomeMercadoLivre();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String item) throws Throwable {
        pageHome.searchItem(item);
    }

    @Then("^I view items according to my search$")
    public void iViewItemsAccordingToMySearch() throws Throwable {
        String result = pageSearchresult.getTextLabelSearchResult();
        assertTrue(result.contains("golf"));
    }
}