package com.example.be.repository.order;


import com.example.be.model.order.OrderPhone;
import com.example.be.model.order.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface IOrderRepository extends JpaRepository<OrderPhone, Integer> {
@Query(value = "select order_phone.* from order_phone " +
        "join payment on order_phone.payment_id = payment.id " +
        "join `user` on user.id = order_phone.user_id " +
        "where order_phone.user_id = :idUser and payment.payment_status = 0",nativeQuery = true)
    OrderPhone getOrder(@Param("idUser") Integer user);



    void payment(Integer id);
@Query(value = "select payment.* from payment " +
        "join order_phone on order_phone.payment_id = payment.id " +
        "join user on user.id = order_phone.user_id " +
        "where order_phone.user_id = :id",nativeQuery = true)
    Payment getPaymentByUserId(@Param("id") Integer id);
}
