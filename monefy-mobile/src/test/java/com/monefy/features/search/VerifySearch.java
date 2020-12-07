package com.monefy.features.search;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.monefy.steps.Home;
import com.monefy.steps.SearchResults;
import com.monefy.steps.Transaction;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;

@RunWith(SerenityRunner.class)
@WithTagValuesOf({ "feature:search", "team:monefy-qa", "type:regression" })
public class VerifySearch {

    @Managed
    WebDriver webDriver;

    @Steps
    private Home home;

    @Steps
    private Transaction transaction;

    @Steps
    private SearchResults searchResults;

    @Before
    public void setup() {
        home.clickIncomeButton();
        transaction.addAmount("5000", "Salary", null);
        home.clickExpenseButton();
        transaction.addAmount("1000", "Car", "Dresden Trip");
    }

    @Test
    @Title("Verify Search functionality with valid input")
    public void verifySearchWithValidInput() {
        home.searchRecord("Dresden");
        searchResults.verifySearchResultsByNotes("Dresden");
    }

    @Test
    @Title("Verify Search functionality with invalid input")
    public void verifySearchResultsWithInvalidInput() {
        home.searchRecord("Berlin");
        searchResults.verifySearchResultsWithInvalidText();
    }
}
