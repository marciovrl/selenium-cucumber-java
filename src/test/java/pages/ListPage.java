package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BasePage;

public class ListPage extends BasePage {

    private static final By TABLE_RESULT = By.id("searchResults");

    public boolean isContainsTextInTable(String item) {
        for (WebElement element : getElements(TABLE_RESULT)) {
            if (!getText(element).contains(item)) {
                return false;
            }
        }
        return true;
    }
}