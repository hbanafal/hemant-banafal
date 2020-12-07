package com.monefy.pages;

import java.util.List;

import com.monefy.pages.locators.SearchResultsPageLocators;

import net.serenitybdd.core.pages.PageObject;

public class SearchResultsPage extends PageObject {

    private SearchResultsPageLocators locators;

    private BasePage basePage;

    public List<String> getSearchResultNotes() {
        return basePage.getTextOfElements(locators.searchResultsNotes);
    }

    public List<String> getSearchResultCategories() {
        return basePage.getTextOfElements(locators.searchResultsCategories);
    }

    public List<String> getSearchResultAmounts() {
        return basePage.getTextOfElements(locators.searchResultsAmounts);
    }

    public List<String> getSearchResultDates() {
        return basePage.getTextOfElements(locators.searchResultsDates);
    }

    public boolean isEmptyResultsTextVisibl() {
        return locators.emptyResults.isVisible();
    }

}
