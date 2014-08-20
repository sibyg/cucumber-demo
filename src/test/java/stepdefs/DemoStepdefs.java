package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SearchPageObject;
import util.SharedDriver;

public class DemoStepdefs {

    private final SharedDriver webdriver;
    private SearchPageObject searchPageObject;

    public DemoStepdefs(SharedDriver webdriver) {
        this.webdriver = webdriver;
        searchPageObject = new SearchPageObject(webdriver);
    }

    @Given("^I am on the website '(.*)'$")
    public void navigateTo(String url) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I submit the search term '(.*)'$")
    public void enterSearchTerm(String searchTerm) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^I accept the first search result$")
    public void acceptFirstSearchResult() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^I should be on the page '(.*)'$")
    public void validateResultPage(String url) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
