package com.bestbuy.api.automation.steps;

import org.assertj.core.api.SoftAssertions;

import com.bestbuy.api.automation.actions.ProductsActions;
import com.bestbuy.api.automation.actionsImpl.ProductsActionsImpl;
import com.bestbuy.api.automation.models.Request.PatchProductRequest;
import com.bestbuy.api.automation.models.Request.PostProductRequest;
import com.bestbuy.api.automation.models.Response.ErrorResponse;
import com.bestbuy.api.automation.models.Response.GetProductsResponse;
import com.bestbuy.api.automation.models.Response.GetProductsResponse.ProductDetails;
import com.bestbuy.api.automation.models.Response.PostProductResponse;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.model.TestStep;

public class ProductStepDefinition extends TestStep {

    PostProductRequest postProductRequest;
    ProductsActions productsActions;
    Response response;
    ErrorResponse errorResponse;
    PostProductResponse postProductResponse;
    GetProductsResponse getProductsResponse;
    private static Long id;

    @Step
    public void userIsHavingDetailsToCreateNewProduct(String name, String type, double price, double shipping,
            String upc, String description, String manufacturer, String model, String url, String image) {
        postProductRequest = PostProductRequest.builder().name(name).type(type).price(price).shipping(shipping).upc(upc)
                .description(description).manufacturer(manufacturer).model(model).url(url).image(image).build();
    }

    @Step
    public void userCreateNewProductUsingAPI() {
        productsActions = new ProductsActionsImpl();
        response = productsActions.createNewProduct(postProductRequest);
        postProductResponse = response.getBody().as(PostProductResponse.class);
        id = postProductResponse.getId();
    }

    @Step
    public void userCreateNewProductWithInvalidDetails() {
        productsActions = new ProductsActionsImpl();
        response = productsActions.createNewProduct(postProductRequest);
    }

    @Step
    public void verifyErrorResponseForProductCreation(int statusCode, String errorName, String message, int code,
            String className, String errors) {
        errorResponse = response.getBody().as(ErrorResponse.class);

        SoftAssertions softAssertion = new SoftAssertions();
        softAssertion.assertThat(statusCode).as("Error Response code of the invalid post product is not correct")
                .isEqualTo(response.getStatusCode());
        softAssertion.assertThat(errorName).as("Error Name  of the invalid post product is not correct")
                .isEqualTo(errorResponse.getName());
        softAssertion.assertThat(message).as("Error Message of the invalid post product is not correct")
                .isEqualTo(errorResponse.getMessage());
        softAssertion.assertThat(code).as("Error code of the invalid post product is not correct")
                .isEqualTo(errorResponse.getCode());
        softAssertion.assertThat(className).as("Error Classname of the invalid post product is not correct")
                .isEqualTo(errorResponse.getClassName());
        softAssertion.assertThat(errors).as("Error of the invalid post product is not correct")
                .isEqualTo(errorResponse.getErrors().get(0));

        softAssertion.assertAll();
    }

    @Step
    public void verifySuccessResponseOfProductCreation(int getProductstatusCode, String name, String type, double price,
            double shipping, String upc, String description, String manufacturer, String model, String url,
            String image) {

        SoftAssertions softAssertion = new SoftAssertions();
        softAssertion.assertThat(getProductstatusCode).as("Response code of the post product is not correct")
                .isEqualTo(response.getStatusCode());
        softAssertion.assertThat(name).as("Name of the created product is not correct")
                .isEqualTo(postProductResponse.getName());
        softAssertion.assertThat(type).as("Type of the created product is not correct")
                .isEqualTo(postProductResponse.getType());
        softAssertion.assertThat(price).as("Price of the created product is not correct")
                .isEqualTo(postProductResponse.getPrice());
        softAssertion.assertThat(shipping).as("Shipping price of the created product is not correct")
                .isEqualTo(postProductResponse.getShipping());
        softAssertion.assertThat(upc).as("UPC of the created product is not correct")
                .isEqualTo(postProductResponse.getUpc());
        softAssertion.assertThat(description).as("Descripition of the created product is not correct")
                .isEqualTo(postProductResponse.getDescription());
        softAssertion.assertThat(manufacturer).as("Manufacturer of the created product is not correct")
                .isEqualTo(postProductResponse.getManufacturer());
        softAssertion.assertThat(model).as("Model of the created product is not correct")
                .isEqualTo(postProductResponse.getModel());
        softAssertion.assertThat(url).as("URL of the created product is not correct")
                .isEqualTo(postProductResponse.getUrl());
        softAssertion.assertThat(image).as("Image of the created product is not correct")
                .isEqualTo(postProductResponse.getImage());
        softAssertion.assertAll();
    }

    @Step
    public void userFetchesProductDetailsForIdUsingGetAPI() {
        productsActions = new ProductsActionsImpl();
        response = productsActions.getProductById(id);
    }

    @Step
    public void verifySuccessResponseForGetProduct(int statusCode, Long total, int limit, int skip, String name,
            String type, double price, double shipping, String upc, String description, String manufacturer,
            String model, String url, String image) {
        ProductDetails productDetails = response.getBody().as(GetProductsResponse.ProductDetails.class);

        SoftAssertions softAssertion = new SoftAssertions();
        softAssertion.assertThat(statusCode).as("Response code of the Get product is not correct")
                .isEqualTo(response.getStatusCode());
        softAssertion.assertThat(id).as("ID of the Get product is not correct").isEqualTo(productDetails.getId());
        softAssertion.assertThat(name).as("Name of the created product is not correct")
                .isEqualTo(productDetails.getName());
        softAssertion.assertThat(type).as("Type of the created product is not correct")
                .isEqualTo(productDetails.getType());
        softAssertion.assertThat(price).as("Price of the created product is not correct")
                .isEqualTo(productDetails.getPrice());
        softAssertion.assertThat(shipping).as("Shipping price of the created product is not correct")
                .isEqualTo(productDetails.getShipping());
        softAssertion.assertThat(upc).as("UPC of the created product is not correct")
                .isEqualTo(productDetails.getUpc());
        softAssertion.assertThat(description).as("Descripition of the created product is not correct")
                .isEqualTo(productDetails.getDescription());
        softAssertion.assertThat(manufacturer).as("Manufacturer of the created product is not correct")
                .isEqualTo(productDetails.getManufacturer());
        softAssertion.assertThat(model).as("Model of the created product is not correct")
                .isEqualTo(productDetails.getModel());
        softAssertion.assertThat(url).as("URL of the created product is not correct")
                .isEqualTo(productDetails.getUrl());
        softAssertion.assertThat(image).as("Image of the created product is not correct")
                .isEqualTo(productDetails.getImage());
        softAssertion.assertAll();

    }

    @Step
    public void userUpdatesProductDetailsUsingPatchAPI(String name, String type, double price, double shipping,
            String upc, String description, String manufacturer, String model, String url, String image) {
        PatchProductRequest patchProductRequest = PatchProductRequest.builder().name(name).type(type).price(price)
                .shipping(shipping).upc(upc).description(description).manufacturer(manufacturer).model(model).url(url)
                .image(image).build();
        response = productsActions.updateProductById(id, patchProductRequest);
    }

    @Step
    public void verifySuccessReponseForUpdateProduct(int getProductstatusCode, double updatedPrice) {
        SoftAssertions softAssertion = new SoftAssertions();
        softAssertion.assertThat(getProductstatusCode).as("Response code of the update product is not correct")
                .isEqualTo(response.getStatusCode());
        softAssertion.assertThat(updatedPrice).as("Updated price of the product is not correct")
                .isEqualTo(response.jsonPath().getDouble("price"));
        softAssertion.assertAll();
    }

    @Step
    public void userDeleteProductUsingDeleteAPI() {
        productsActions = new ProductsActionsImpl();
        response = productsActions.deleteProduct(id);
    }

    @Step
    public void verifySuccessReponseForDeleteProduct(int getProductDeleteStatusCode) {

        SoftAssertions softAssertion = new SoftAssertions();
        softAssertion.assertThat(getProductDeleteStatusCode).as("Response code of the Delete product is not correct")
                .isEqualTo(response.getStatusCode());
        softAssertion.assertAll();
    }

    @Step
    public void verifyGetResponseAfterDeletingProduct() {

        SoftAssertions softAssertion = new SoftAssertions();
        softAssertion.assertThat(404).as("Response code of the update product is not correct")
                .isEqualTo(response.getStatusCode());
        softAssertion.assertThat(response.jsonPath().getString("message"))
                .as("Response message of Get Product after Deleting is not correct")
                .isEqualTo("No record found for id '" + id + "'");
        softAssertion.assertAll();

    }
}
