package com.bestbuy.api.automation.models.Request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PostProductRequest {

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

}
