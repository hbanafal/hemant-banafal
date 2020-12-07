package com.bestbuy.features.product;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.bestbuy.api.automation.steps.ProductStepDefinition;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;

@RunWith(SerenityRunner.class)
@WithTagValuesOf({ "feature:product", "team:n26-qa", "type:regression", "request_type:PATCH" })
public class VerifyUpdateProduct {

    @Steps
    private ProductStepDefinition productSteps;

    @Test
    @Title("Verify Update Product")
    public void verifyUpdateProduct() {

        productSteps.userIsHavingDetailsToCreateNewProduct("Duracell", "HardGood", 100.5, 0.5, "041333440019",
                "Compatible with select electronic devices; C size", "Duracell", "MN1400R4Z",
                "http://www.bestbuy.com/site/duracell-c-batteries", "http://img.bbystatic.com/BestBuy_US/images");

        productSteps.userCreateNewProductUsingAPI();

        productSteps.userUpdatesProductDetailsUsingPatchAPI("Duracell", "HardGood", 200.5, 0.5, "041333440019",
                "Compatible with select electronic devices; C size", "Duracell", "MN1400R4Z",
                "http://www.bestbuy.com/site/duracell-c-batteries", "http://img.bbystatic.com/BestBuy_US/images");

        productSteps.verifySuccessReponseForUpdateProduct(200, 200.5);
    }
}
