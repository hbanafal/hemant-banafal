package com.monefy.pages;

import java.util.List;

import com.monefy.pages.locators.SearchResultsPageLocators;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultsPage extends PageObject {

    private SearchResultsPageLocators locators;

    public List<WebElementFacade> getSearchResultNotes() {
        return locators.searchResultsNotes;
    }

    public List<WebElementFacade> getSearchResultCategories() {
        return locators.searchResultsCategories;
    }

    public List<WebElementFacade> getSearchResultAmounts() {
        return locators.searchResultsAmounts;
    }

    public List<WebElementFacade> getSearchResultDates() {
        return locators.searchResultsDates;
    }

}
