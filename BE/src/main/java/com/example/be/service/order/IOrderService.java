package com.example.be.service.order;

import com.example.be.model.order.OrderDetail;
import com.example.be.model.order.OrderPhone;
import com.example.be.model.order.Payment;
import com.example.be.model.product.ProductDetail;

import java.util.List;

public interface IOrderService {
    List<OrderDetail> getCartByUserId(String id);

    void addOrder(OrderPhone orderPhone1);

    OrderPhone getOrder(Integer user);



    void addOrderDetail(OrderDetail orderDetail);

    List<OrderDetail> getHistory(String id);



    OrderDetail getOrderDetail(Integer id);

    void deleteOrderDetail(OrderDetail orderDetail);

    void payment(Integer id);

    Payment getPaymentByUserId(Integer id);


}
