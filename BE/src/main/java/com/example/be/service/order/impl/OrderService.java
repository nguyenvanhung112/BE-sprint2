package com.example.be.service.order.impl;

import com.example.be.repository.order.IOrderRepository;
import com.example.be.service.order.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOrderRepository orderRepository;
}
