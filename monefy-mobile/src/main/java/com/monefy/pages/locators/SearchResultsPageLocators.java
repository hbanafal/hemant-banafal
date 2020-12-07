package com.monefy.pages.locators;

import java.util.List;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultsPageLocators extends PageObject {

    @AndroidFindBy(id = "com.monefy.app.lite:id/note_text_view")
    public List<WebElementFacade> searchResultsNotes;

    @AndroidFindBy(id = "com.monefy.app.lite:id/title_text_view")
    public List<WebElementFacade> searchResultsCategories;

    @AndroidFindBy(id = "com.monefy.app.lite:id/amount_text_view")
    public List<WebElementFacade> searchResultsAmounts;

    @AndroidFindBy(id = "com.monefy.app.lite:id/date_text_view")
    public List<WebElementFacade> searchResultsDates;

    @AndroidFindBy(id = "com.monefy.app.lite:id/empty_results_text_view")
    public WebElementFacade emptyResults;

}
