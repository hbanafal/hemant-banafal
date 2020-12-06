package com.monefy.steps;

import org.assertj.core.api.SoftAssertions;

import com.monefy.pages.BasePage;
import com.monefy.pages.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.model.TestStep;

public class Home extends TestStep {

    private HomePage homePage;

    private BasePage basePage;

    @Step
    public void clickIncomeButton() {
        homePage.clickIncomeButton();
    }

    @Step
    public void clickExpenseButton() {
        homePage.clickExpenseButton();
    }

    @Step
    public void verifyIncomeAmount(String expectedIncomeAmt) {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(homePage.getIncomeAmount()).as("Income amount is not correct on Homepage")
                .isEqualTo(expectedIncomeAmt);
        softAssertions.assertAll();
    }

    @Step
    public void verifyExpenseAmount(String expectedExpAmt) {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(homePage.getExpenseAmount()).as("Expense amount is not correct on Homepage")
                .isEqualTo(expectedExpAmt);
        softAssertions.assertAll();
    }

    @Step
    public void verifyBalanceAmount(String expectedBalanceAmt) {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(homePage.getBalanceAmount()).as("Balance amount is not correct on Homepage")
                .isEqualTo(expectedBalanceAmt);
        softAssertions.assertAll();
    }

    @Step
    public void searchRecord(String searchText) {
        homePage.clickSearch();
        homePage.enterSearchText(searchText);
        basePage.pressEnter();
    }

}
