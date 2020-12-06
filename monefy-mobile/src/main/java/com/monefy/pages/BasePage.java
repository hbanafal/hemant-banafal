package com.monefy.pages;

import java.util.ArrayList;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class BasePage extends PageObject {

    private MobileDriver driver = (MobileDriver) ThucydidesWebDriverSupport.getProxiedDriver();

    /**
     * This method is used to press Enter on virtual keyboard.
     *
     * @param None
     *
     * @return void
     *
     * @since Dec 2020
     * @author hemantbanafal
     */
    public void pressEnter() {
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
    }

    /**
     * This method is used to hide the virtual keyboard.
     *
     * @param None
     *
     * @return void
     *
     * @since Dec 2020
     * @author hemantbanafal
     */
    public void hideKeyBoard() {
        ((AppiumDriver) driver).hideKeyboard();
    }

    /**
     * This generic method is used to get the text from a list of elements.
     *
     * @param elements : List of WebElements
     *
     * @return List of String
     *
     *         For example : basePage.getTextOfElements(locator.searchResults);
     *
     * @since Dec 2020
     * @author hemantbanafal
     */
    public List<String> getTextOfElements(List<WebElementFacade> elements) {
        List<String> texts = new ArrayList<String>();
        for (WebElementFacade element : elements)
            texts.add(element.getText());

        return texts;
    }

}
