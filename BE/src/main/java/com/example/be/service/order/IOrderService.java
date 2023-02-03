package com.example.be.service.order;

import com.example.be.model.order.OrderDetail;
import com.example.be.model.order.OrderPhone;

import java.util.List;

public interface IOrderService {
    List<OrderDetail> getCartByUserId(String id);

    void addOrder(OrderPhone orderPhone1);
}
