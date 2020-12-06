package com.monefy.pages;

import java.util.List;

import com.monefy.pages.locators.HomePageLocators;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    private HomePageLocators locators;

    public void clickIncomeButton() {
        locators.incomeButton.click();
    }

    public void clickExpenseButton() {
        locators.expenseButton.click();
    }

    public String getIncomeAmount() {
        return locators.incomeAmount.getText();
    }

    public String getExpenseAmount() {
        return locators.expenseAmount.getText();
    }

    public String getBalanceAmount() {
        return locators.balanceAmount.getText();
    }

    public void clickNavigationButton() {
        locators.navigationBar.getText();
    }

    public void clickSearch() {
        locators.searchButton.getText();
    }

    public void enterSearchText(String searchText) {
        locators.searchField.sendKeys(searchText);
    }

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
