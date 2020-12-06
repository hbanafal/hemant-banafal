package com.bestbuy.api.automation.models.Response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@AllArgsConstructor
@NoArgsConstructor
public class PostProductResponse {

    private String name;
    private long id;
    private String type;
    private double price;
    private double shipping;
    private String upc;
    private String description;
    private String manufacturer;
    private String model;
    private String url;
    private String image;
    private String updatedAt;
    private String createdAt;

}
