package com.monefy.pages;

import com.monefy.pages.locators.HomePageLocators;

import net.serenitybdd.core.pages.PageObject;

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
        locators.searchButton.click();
    }

    public void enterSearchText(String searchText) {
        locators.searchField.sendKeys(searchText);
    }
}
