package com.bestbuy.features.product;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.bestbuy.api.automation.steps.ProductStepDefinition;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;

@RunWith(SerenityRunner.class)
@WithTagValuesOf({ "feature:product", "team:n26-qa", "type:regression", "request_type:POST" })
public class VerifyCreateProduct {

    @Steps
    private ProductStepDefinition productSteps;

    @Test
    @Title("Verify Create Product with valid details")
    public void verifyCreateProductWithValidDetails() {

        productSteps.userIsHavingDetailsToCreateNewProduct("Duracell", "HardGood", 100.5, 0.5, "041333440019",
                "Compatible with select electronic devices; C size", "Duracell", "MN1400R4Z",
                "http://www.bestbuy.com/site/duracell-c-batteries", "http://img.bbystatic.com/BestBuy_US/images");

        productSteps.userCreateNewProductUsingAPI();

        productSteps.verifySuccessResponseOfProductCreation(201, "Duracell", "HardGood", 100.5, 0.5, "041333440019",
                "Compatible with select electronic devices; C size", "Duracell", "MN1400R4Z",
                "http://www.bestbuy.com/site/duracell-c-batteries", "http://img.bbystatic.com/BestBuy_US/images");

    }

    @Test
    @Title("Verify Create Product with invalid details")
    public void verifyCreateProductWithInValidDetails() {

        productSteps.userIsHavingDetailsToCreateNewProduct("Duracell", "HardGood", 100.5, 0.5, "0413334400191234",
                "Compatible with select electronic devices; C size", "Duracell", "MN1400R4Z",
                "http://www.bestbuy.com/site/duracell-c-batteries", "http://img.bbystatic.com/BestBuy_US/images");

        productSteps.userCreateNewProductWithInvalidDetails();

        productSteps.verifyErrorResponseForProductCreation(400, "BadRequest", "Invalid Parameters", 400, "bad-request",
                "'upc' should NOT be longer than 15 characters");

    }

}
