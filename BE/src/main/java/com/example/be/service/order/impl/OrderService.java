package com.example.be.service.order.impl;

import com.example.be.model.order.OrderDetail;
import com.example.be.model.order.OrderPhone;
import com.example.be.model.order.Payment;
import com.example.be.model.product.ProductDetail;
import com.example.be.repository.order.IOrderDetailReposistory;
import com.example.be.repository.order.IOrderRepository;
import com.example.be.service.order.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOrderRepository orderRepository;

    @Autowired
    private IOrderDetailReposistory orderDetailReposistory;
    @Override
    public List<OrderDetail> getCartByUserId(String id) {
        return orderDetailReposistory.getCartByUserId(id);
    }

    @Override
    public void addOrder(OrderPhone orderPhone1) {
      orderRepository.save(orderPhone1);
    }

    @Override
    public OrderPhone getOrder(Integer user) {
        return orderRepository.getOrder(user);
    }



    @Override
    public void addOrderDetail(OrderDetail orderDetail) {
        orderDetailReposistory.save(orderDetail);
    }

    @Override
    public List<OrderDetail> getHistory(String id) {
        return orderDetailReposistory.getHistory(id);
    }


    @Override
    public OrderDetail getOrderDetail(Integer id) {
        return orderDetailReposistory.findById(id).orElse(null);
    }

    @Override
    public void deleteOrderDetail(OrderDetail orderDetail) {
        orderDetailReposistory.delete(orderDetail);
    }

    @Override
    public void payment(Integer id) {
         orderRepository.payment(id);
    }

    @Override
    public Payment getPaymentByUserId(Integer id) {
        return orderRepository.getPaymentByUserId(id);
    }
}
