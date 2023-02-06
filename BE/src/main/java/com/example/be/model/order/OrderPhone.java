package com.example.be.model.order;

import com.example.be.model.product.ProductDetail;
import com.example.be.model.users.User;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class OrderPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "boolean default true")
    private Boolean deleteStatus;

    @OneToMany(mappedBy = "orderPhone")
    @JsonBackReference
    private Set<OrderDetail> orderDetail;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonBackReference
    private User user;


    @OneToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "id")
    @JsonBackReference
    private Payment payment;
    public OrderPhone() {
    }

    public Set<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(Set<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
