package com.monefy.pages.locators;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TransactionPageLocators extends PageObject {

    @AndroidFindBy(id = "com.monefy.app.lite:id/amount_text")
    public WebElementFacade amountTextField;

    @AndroidFindBy(id = "com.monefy.app.lite:id/linearLayoutKeyboard")
    public WebElementFacade keyBoard;

    @AndroidFindBy(id = "com.monefy.app.lite:id/keyboard_action_button")
    public WebElementFacade chooseCategoryButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/textViewNote")
    public WebElementFacade noteField;

    @AndroidFindBy(id = "com.monefy.app.lite:id/account_spinner")
    public WebElementFacade accountType;

    @AndroidFindBy(id = "//*[@text='Cash']")
    public WebElementFacade cashAccount;

    @AndroidFindBy(id = "//*[@text='Payment card']")
    public WebElementFacade pamentCardAccount;

    @AndroidFindBy(id = "com.monefy.app.lite:id/currency_name")
    public WebElementFacade currencyType;

    @AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboardClear")
    public WebElementFacade clearButton;

}
