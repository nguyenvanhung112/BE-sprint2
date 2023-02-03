package com.example.be.model.order;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String shippingDescription;
    private Boolean paymentStatus;


    private Boolean deleteStatus;

    @OneToOne
    @JoinColumn(name = "order_phone_id", referencedColumnName = "id")
    @JsonBackReference
    private OrderPhone orderPhone;

    public Payment() {
    }

    public OrderPhone getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(OrderPhone orderPhone) {
        this.orderPhone = orderPhone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShippingDescription() {
        return shippingDescription;
    }

    public void setShippingDescription(String shippingDescription) {
        this.shippingDescription = shippingDescription;
    }

    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }


}
