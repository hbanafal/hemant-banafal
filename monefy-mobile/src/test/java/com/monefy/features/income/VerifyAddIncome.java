package com.monefy.features.income;

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
@WithTagValuesOf({ "feature:income", "team:monefy-qa", "type:regression" })
public class VerifyAddIncome {

    @Managed
    WebDriver webDriver;

    @Steps
    private Home home;

    @Steps
    private Transaction incomeTransaction;

    @Test
    @Title("Verify Adding Income in existing category")
    public void verifyAddIncomeInExistingCategory() {
        home.clickIncomeButton();
        incomeTransaction.addAmount("5000", "Salary", null);
        home.verifyIncomeAmount("$5,000.00");
    }

    @Test
    @Title("Verify Adding invalid Income in existing category")
    public void verifyAddInvalidIncomeInExistingCategory() {
        home.clickIncomeButton();
        incomeTransaction.addInvalidAmount("-5000");
        incomeTransaction.verifyInvalidAmount();
    }
}
