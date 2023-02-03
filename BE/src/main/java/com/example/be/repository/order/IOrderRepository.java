package com.example.be.repository.order;

import com.example.be.model.order.OrderDetail;
import com.example.be.model.order.OrderPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IOrderRepository extends JpaRepository<OrderPhone, Integer> {

}
