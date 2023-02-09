package com.example.be.service.order;

import com.example.be.model.order.Payment;

public interface IPaymentService {
    void addPayment(Payment payment);

    Payment getPaymentByUserId(Integer id);
}
