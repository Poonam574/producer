package com.producer.service;

import com.producer.constant.AppConstants;
import com.producer.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public String addMsg(Order order) {

        // sends msg to kafka topic
        kafkaTemplate.send(AppConstants.TOPIC,order.getId(), order);

        return "Msg Published To Kafka Topic";
    }
}