package com.example.be.dto;

import com.example.be.model.product.Category;
import com.example.be.model.product.ImgUrlProduct;
import com.example.be.model.product.ProductDetail;

import java.util.List;
import java.util.Set;

public class ProductDisPlayDto {
    private Integer id;
    private String name;
    private Double price;
    private Category category;

    private List<ImgUrlProduct> imgUrlProducts;

    public ProductDisPlayDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<ImgUrlProduct> getImgUrlProducts() {
        return imgUrlProducts;
    }

    public void setImgUrlProducts(List<ImgUrlProduct> imgUrlProducts) {
        this.imgUrlProducts = imgUrlProducts;
    }
}
