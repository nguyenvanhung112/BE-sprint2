package com.example.be.dto;

public class OrderDto {

    private Integer user;

    private Integer quantity;
    private Integer productDetail;
    public OrderDto() {
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(Integer productDetail) {
        this.productDetail = productDetail;
    }
}
