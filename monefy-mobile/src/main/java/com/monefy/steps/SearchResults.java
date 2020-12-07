package com.monefy.steps;

import org.assertj.core.api.SoftAssertions;

import com.monefy.pages.SearchResultsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.model.TestStep;

public class SearchResults extends TestStep {

    private SearchResultsPage searchResultPage;

    @Step
    public void verifySearchResultsByNotes(String searchedText) {
        SoftAssertions softAssertions = new SoftAssertions();
        for (String searchedResults : searchResultPage.getSearchResultNotes())
            softAssertions.assertThat(searchedResults).as("Search results doesn't contains searched text")
                    .contains(searchedText);
        softAssertions.assertAll();
    }

    @Step
    public void verifySearchResultsByCategory(String searchedText) {
        SoftAssertions softAssertions = new SoftAssertions();
        for (String searchedResults : searchResultPage.getSearchResultCategories())
            softAssertions.assertThat(searchedResults).as("Search results doesn't contains searched text")
                    .contains(searchedText);
        softAssertions.assertAll();
    }

    @Step
    public void verifySearchResultsWithInvalidText() {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(searchResultPage.isEmptyResultsTextVisibl()).as("Empty Search results is not visible")
                .isTrue();
        softAssertions.assertAll();
    }
}
