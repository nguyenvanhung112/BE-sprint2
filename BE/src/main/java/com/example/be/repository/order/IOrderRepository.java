package com.example.be.repository.order;

import com.example.be.model.order.OrderPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IOrderRepository extends JpaRepository<OrderPhone, Integer> {
}
