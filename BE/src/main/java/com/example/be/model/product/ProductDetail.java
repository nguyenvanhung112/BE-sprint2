package com.example.be.model.product;


import com.example.be.model.order.OrderPhone;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double price;

    private Integer quantity;
    @Column(columnDefinition = "boolean default true")
    private Boolean deleteStatus;
    @ManyToOne
    @JoinColumn(name ="product_id",referencedColumnName = "id")
    private Product product;
    @ManyToOne
    @JoinColumn(name ="color_id",referencedColumnName = "id")
    private Color color;

    @ManyToOne
    @JoinColumn(name ="storage_capacity_id",referencedColumnName = "id")
    private StorageCapacity storageCapacity;

    @JsonBackReference
    @OneToMany(mappedBy = "productDetail")
    private Set<OrderPhone> orderPhones;

    public ProductDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public StorageCapacity getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(StorageCapacity storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public Set<OrderPhone> getOrderPhones() {
        return orderPhones;
    }

    public void setOrderPhones(Set<OrderPhone> orderPhones) {
        this.orderPhones = orderPhones;
    }
}
