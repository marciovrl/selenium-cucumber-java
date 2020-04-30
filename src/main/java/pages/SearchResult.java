package pages;

import org.openqa.selenium.By;

import utils.BasePage;

public class SearchResult extends BasePage {
    private static final By LABEL_SEARCH_RESULT = By.cssSelector("h1.breadcrumb__title");

    public String getTextLabelSearchResult() {
        return getText(LABEL_SEARCH_RESULT);
    }
}