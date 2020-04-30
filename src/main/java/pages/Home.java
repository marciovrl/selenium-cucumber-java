package pages;

import org.openqa.selenium.By;

import utils.BasePage;

public class Home extends BasePage {

    private static final String URL_MERCADO_LIVRE = "https://www.mercadolivre.com.br/";
    private static final By INPUT_SEARCH = By.name("as_word");
    private static final By BUTTON_SEARCH = By.className("nav-search-btn");

    public void goToHomeMercadoLivre() {
        openUrl(URL_MERCADO_LIVRE);
    }

    public void searchItem(String item) {
        sendKeys(INPUT_SEARCH, item);
        click(BUTTON_SEARCH);
    }
}