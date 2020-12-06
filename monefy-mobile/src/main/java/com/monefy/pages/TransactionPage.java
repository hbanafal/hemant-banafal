package com.monefy.pages;

import java.util.HashMap;

import com.monefy.pages.locators.TransactionPageLocators;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;

public class TransactionPage extends PageObject {

    private BasePage basePage;

    private TransactionPageLocators locators;

    public void enterAmount(String amount) {

        char[] amountKeys = amount.toCharArray();

        for (char key : amountKeys)
            if (getSymbols().containsKey(key))
                $(MobileBy.id("com.monefy.app.lite:id/buttonKeyboard" + getSymbols().get(key))).click();
            else
                $(MobileBy.id("com.monefy.app.lite:id/buttonKeyboard" + key)).click();
    }

    public HashMap<Character, String> getSymbols() {
        HashMap<Character, String> symbols = new HashMap<>();
        symbols.put('+', "Plus");
        symbols.put('-', "Minus");
        symbols.put('×', "Multiply");
        symbols.put('÷', "Divide");
        symbols.put('=', "Equals");
        symbols.put('.', "Dot");
        return symbols;
    }

    public void clearAmount(String amount) {
        for (int i = 0; i < amount.toCharArray().length; i++)
            locators.clearButton.click();
    }

    public void addNote(String note) {
        locators.noteField.click();
        locators.noteField.sendKeys(note + "\n");
        basePage.hideKeyBoard();

    }

    public void clickChooseCategory() {
        locators.chooseCategoryButton.click();
    }

    public void selectCategory(String category) {
        $(MobileBy.xpath("//*[contains(@resource-id, 'gridViewCategories')]//*[@text='" + category + "']")).click();
    }

    public boolean isKeyBoardVisible() {
        return locators.keyBoard.isVisible();
    }

}
