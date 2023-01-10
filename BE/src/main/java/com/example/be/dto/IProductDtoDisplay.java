package com.example.be.dto;

import com.example.be.model.product.ImgUrlProduct;

import java.util.List;

public interface IProductDtoDisplay {

    Integer getId();

    Double getPrice();
    String getName();

    String getCategory();

    String getUrls();

}
