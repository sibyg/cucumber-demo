package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPageObject {
    private final WebDriver webDriver;

    public SearchPageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By searchTermField = By.id("");
    private By submitSearch = By.id("");
    private By searchResults = By.id("");

}
