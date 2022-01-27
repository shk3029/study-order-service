package com.example.studyorderservice.service;

import com.example.studyorderservice.dto.OrderDto;
import com.example.studyorderservice.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
