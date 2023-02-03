package com.example.be.repository.order;

import com.example.be.model.order.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IOrderDetailReposistory extends JpaRepository<OrderDetail,Integer> {
    @Query(value = "select order_detail.* from order_detail \n" +
            "join `order_phone` on order_phone.id = order_detail.order_phone_id\n" +
            "join `user` on `user`.id = order_phone.user_id\n" +
            "join `payment` on payment.order_phone_id = order_phone.id \n" +
            "join `product_detail` on product_detail.id = order_detail.product_detail_id where payment.payment_status = 0 and user.id = :userId",nativeQuery = true)
    List<OrderDetail> getCartByUserId(@Param("userId") String id);
}
