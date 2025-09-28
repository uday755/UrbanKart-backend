package com.uday.UrbanKart.request;

import com.uday.UrbanKart.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory; // stock of product
    private String description;
    private Category category;
}
