package com.monefy.features.expense;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.monefy.steps.Home;
import com.monefy.steps.Transaction;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;

@RunWith(SerenityRunner.class)
@WithTagValuesOf({ "feature:expense", "team:monefy-qa", "type:regression" })
public class VerifyExpenses {

    @Managed
    WebDriver webDriver;

    @Steps
    private Home home;

    @Steps
    private Transaction transaction;

    @Before
    public void setUp() {
        home.clickIncomeButton();
        transaction.addAmount("5000", "Salary", null);
        home.clickExpenseButton();
    }

    @Test
    @Title("Verify Adding Expense in existing category")
    public void verifyAddExpenseInExistingCategory() {
        transaction.addAmount("1000", "Car", "Dresden Trip");
        home.verifyExpenseAmount("$1,000.00");
        home.verifyBalanceAmount("Balance $4,000.00");
        home.verifyIncomeAmount("$5,000.00");
    }

    @Test
    @Title("Verify Adding invalid Expense in existing category")
    public void verifyAddInvalidExpenseInExistingCategory() {
        transaction.addInvalidAmount("-5000");
        transaction.verifyInvalidAmount();
    }
}
