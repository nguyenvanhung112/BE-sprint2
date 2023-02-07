package com.example.be.controller;

import com.example.be.dto.IProductDtoDisplay;
import com.example.be.dto.OrderDto;
import com.example.be.model.order.OrderDetail;
import com.example.be.model.order.OrderPhone;
import com.example.be.model.order.Payment;
import com.example.be.model.product.ProductDetail;
import com.example.be.repository.order.IOrderDetailReposistory;
import com.example.be.service.order.IOrderService;
import com.example.be.service.order.IPaymentService;
import com.example.be.service.order.impl.OrderService;
import com.example.be.service.product.IProductDetailService;
import com.example.be.service.user.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/order")
public class OrderRestController {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IUserService userService;

    @Autowired
    private IPaymentService paymentService;
    @Autowired
    private IProductDetailService productDetailService;

    @GetMapping("cart/{id}")
    public ResponseEntity<List<OrderDetail>> getListProductDetailByUserId(@PathVariable String id) {
        List<OrderDetail> orderDetails = orderService.getCartByUserId(id);
        if (orderDetails.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(orderDetails, HttpStatus.OK);
    }

    @PostMapping("addOrder")
    public ResponseEntity<OrderPhone> add(@RequestBody OrderDto order) {
        OrderPhone orderPhone = orderService.getOrder(order.getUser());
        if (orderPhone == null) {

            Payment payment = new Payment();
            payment.setDeleteStatus(true);
            payment.setPaymentStatus(false);
            payment.setShippingDescription("");
            paymentService.addPayment(payment);


            OrderPhone orderPhoneNew = new OrderPhone();
            orderPhoneNew.setPayment(payment);
            orderPhoneNew.setUser(userService.getUserById(order.getUser()));
            orderPhoneNew.setDeleteStatus(true);
            orderService.addOrder(orderPhoneNew);

            OrderPhone orderPhone1 = orderService.getOrder(order.getUser());

            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrderPhone(orderPhone1);
            orderDetail.setProductDetail(productDetailService.getProductDetailById(order.getProductDetail()));
            orderDetail.setQuantity(order.getQuantity());
            orderService.addOrderDetail(orderDetail);


            return new ResponseEntity<>(orderPhone1, HttpStatus.OK);
        }

        OrderDetail orderDetail = new OrderDetail();
        ProductDetail productDetail = productDetailService.getProductDetailById(order.getProductDetail());
        List<OrderDetail> orderDetails = orderService.getCartByUserId(String.valueOf(order.getUser()));

        for (OrderDetail x : orderDetails) {
            if (x.getProductDetail().getId() == productDetail.getId()) {
                x.setQuantity(x.getQuantity() + order.getQuantity());
                orderService.addOrderDetail(x);
                return new ResponseEntity<>(orderPhone, HttpStatus.OK);
            }
        }
        orderDetail.setOrderPhone(orderPhone);
        orderDetail.setProductDetail(productDetail);
        orderDetail.setQuantity(order.getQuantity());
        orderService.addOrderDetail(orderDetail);

        return new ResponseEntity<>(orderPhone, HttpStatus.OK);
    }
}
