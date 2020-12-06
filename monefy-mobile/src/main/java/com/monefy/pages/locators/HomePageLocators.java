package com.monefy.pages.locators;

import java.util.List;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePageLocators extends PageObject {

    @AndroidFindBy(id = "com.monefy.app.lite:id/income_button")
    public WebElementFacade incomeButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/expense_button")
    public WebElementFacade expenseButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/balance_amount")
    public WebElementFacade balanceAmount;

    @AndroidFindBy(id = "com.monefy.app.lite:id/income_amount_text")
    public WebElementFacade incomeAmount;

    @AndroidFindBy(id = "com.monefy.app.lite:id/expense_amount_text")
    public WebElementFacade expenseAmount;

    @AndroidFindBy(id = "com.monefy.app.lite:id/piegraph")
    public WebElementFacade pieGraph;

    @AndroidFindBy(accessibility = "Open navigation")
    public WebElementFacade navigationBar;

    @AndroidFindBy(id = "com.monefy.app.lite:id/menu_search")
    public WebElementFacade searchButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/et_search")
    public WebElementFacade searchField;

    @AndroidFindBy(id = "com.monefy.app.lite:id/note_text_view")
    public List<WebElementFacade> searchResultsNotes;

    @AndroidFindBy(id = "com.monefy.app.lite:id/title_text_view")
    public List<WebElementFacade> searchResultsCategories;

    @AndroidFindBy(id = "com.monefy.app.lite:id/amount_text_view")
    public List<WebElementFacade> searchResultsAmounts;

    @AndroidFindBy(id = "com.monefy.app.lite:id/date_text_view")
    public List<WebElementFacade> searchResultsDates;

    @AndroidFindBy(id = "com.monefy.app.lite:id/transfer_menu_item")
    public WebElementFacade transferButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/overflow")
    public WebElementFacade settingsButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/leftLinesImageView")
    public WebElementFacade expenseChartLeftButton;

    @AndroidFindBy(id = "com.monefy.app.lite:id/rightLinesImageView")
    public WebElementFacade expenseChartRightButton;

}
