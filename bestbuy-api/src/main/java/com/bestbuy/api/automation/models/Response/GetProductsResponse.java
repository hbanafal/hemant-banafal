package com.bestbuy.api.automation.models.Response;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@AllArgsConstructor
@NoArgsConstructor
public class GetProductsResponse {

    private Long total;
    private int limit;
    private int skip;
    private List<ProductDetails> data;

    @Getter
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ProductDetails {
        private Long id;
        private String name;
        private String type;
        private double price;
        private double shipping;
        private String upc;
        private String description;
        private String manufacturer;
        private String model;
        private String url;
        private String image;
        private Date createdAt;
        private Date updatedAt;
        private List<categoriesList> categories;

    }

    @Getter
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @AllArgsConstructor
    @NoArgsConstructor
    public static class categoriesList {
        private String id;
        private String name;
        private Date createdAt;
        private Date updatedAt;
    }

}
