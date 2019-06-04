package test.steps.definitions;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.ItensModel;
import pages.HomePage;
import pages.ListPage;

public class SearchItemSteps {

    private static HomePage homePage;
    private static ListPage listPage;

    @Before
    public static void setup() {
        homePage = new HomePage();
        listPage = new ListPage();
    }

    @Given("^that it is on the homepage of Mercado Livre$")
    public void that_it_is_on_the_homepage_of_Mercado_Livre() {
        homePage.goToHomeMercadoLivre();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String item) {
        homePage.searchItem(item);
    }

    @Then("^I view items according to my search$")
    public void i_view_items_according_to_my_search() {
        assertTrue(listPage.isContainsTextInTable(ItensModel.getItem()));
    }
}