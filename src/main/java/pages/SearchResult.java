package pages;

import org.openqa.selenium.By;

import utils.BasePage;

public class SearchResult extends BasePage {

    private static final By LABEL_SEARCH_RESULT = By.cssSelector("h1.breadcrumb__title");
    private static final By LIST_FILTER = By.cssSelector("dd.filters__group__option");

    public String getTextLabelSearchResult() {
        return getText(LABEL_SEARCH_RESULT);
    }

    public void setFilter(String filter) {
        clickElementListByText(LIST_FILTER, filter);
    }
}