package example.exampleElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import webElement.customElements.concreteElements.WebButton;
import webElement.customElements.concreteElements.WebTextField;
import webElement.customElements.superElements.CustomWebElement;

/**
 * A module, which represents the bing search field elements and offers functionality to interact with it.
 **/
public class BingSearchModule extends CustomWebElement {

    /**
     * The search field in which the search text can be entered.
     **/
    @FindBy(id = "sb_form_q")
    private WebTextField searchField;

    /**
     * The button, which triggers the search process.
     **/
    //Devi 10-Apr-2020: Updated the locator with xpath due to ElementNotInteractable Exception
    //@FindBy(id = "sb_form_go")
    @FindBy(xpath = "//label[@for='sb_form_go']")
    private WebButton searchButton;

    /**
     * Constructor.
     *
     * @param webDriver The webDriver used to interact with the webbrowser.
     * @param by        The locator used to identify the element(s) on the website.
     **/
    public BingSearchModule(WebDriver webDriver, By by) {
        super(webDriver, by);
    }

    /**
     * Searches for a text.
     *
     * @param searchText The text for which will be searched. 0 is the first search result.
     **/
    public void search(String searchText) {
        searchField.setText(searchText);
        searchButton.click();
    }
}