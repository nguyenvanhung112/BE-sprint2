package com.example.be.service.order.impl;

import com.example.be.model.order.Payment;
import com.example.be.repository.order.IPaymentRepository;
import com.example.be.service.order.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {
    @Autowired
    private IPaymentRepository paymentRepository;

    @Override
    public void addPayment(Payment payment) {
        paymentRepository.save(payment);
    }
}
