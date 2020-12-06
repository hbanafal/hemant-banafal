package com.monefy.steps;

import org.junit.Assert;

import com.monefy.pages.TransactionPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.model.TestStep;

public class Transaction extends TestStep {

    private TransactionPage transactionPage;

    @Step
    public void addAmount(String amount, String category, String note) {
        transactionPage.enterAmount(amount);
        if (note != null)
            transactionPage.addNote(note);

        transactionPage.clickChooseCategory();
        transactionPage.selectCategory(category);
    }

    @Step
    public void addInvalidAmount(String invalidAmount) {
        transactionPage.enterAmount(invalidAmount);
        transactionPage.clickChooseCategory();
    }

    @Step
    public void verifyInvalidAmount() {
        Assert.assertTrue("User is able to add invalid amount", transactionPage.isKeyBoardVisible());
    }

}
