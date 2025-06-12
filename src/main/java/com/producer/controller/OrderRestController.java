package com.producer.controller;

import com.producer.entity.Order;
import com.producer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderRestController {

    @Autowired
    private OrderService service;

    @PostMapping("/create")
    public String createOrder(@RequestBody Order order) {
        String response = service.addMsg(order);
        return response;
    }

}
