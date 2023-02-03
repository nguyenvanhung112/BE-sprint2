package com.example.be.controller;

import com.example.be.dto.IProductDtoDisplay;
import com.example.be.dto.OrderDto;
import com.example.be.model.order.OrderDetail;
import com.example.be.model.order.OrderPhone;
import com.example.be.service.order.IOrderService;
import com.example.be.service.order.impl.OrderService;
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
    @GetMapping("cart/{id}")
    public ResponseEntity<List<OrderDetail>> getListProductDetailByProductId(@PathVariable String id) {
        List<OrderDetail> orderDetails = orderService.getCartByUserId(id);
        if (orderDetails.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(orderDetails, HttpStatus.OK);
    }
    @PostMapping("addOrder")
    public ResponseEntity<OrderPhone> add(@RequestBody OrderDto orderPhone){
        OrderPhone orderPhone1 = new OrderPhone();
        orderPhone1.setUser(userService.getUserById(orderPhone.getUser()));
        orderService.addOrder(orderPhone1);
        return new ResponseEntity<>(orderPhone1,HttpStatus.OK);
    }
}
