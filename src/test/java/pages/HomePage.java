package pages;

import org.openqa.selenium.By;

import utils.BasePage;

public class HomePage extends BasePage {

    private static String urlMercadoLivre = "https://www.mercadolivre.com.br/";

    private static final By INPUT_SEARCH = By.name("as_word");
    private static final By BUTTON_SEARCH = By.className("nav-search-btn");

    public void goToHomeMercadoLivre() {
        openUrl(urlMercadoLivre);
    }

    public void searchItem(String item) {
        sendKeys(INPUT_SEARCH, item);
        click(BUTTON_SEARCH);
    }
}