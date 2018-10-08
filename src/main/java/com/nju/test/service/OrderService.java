package com.nju.test.service;

import com.nju.test.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrderList(int userId);

    Order getOrderById(String orderId);

    boolean addOrder(Order order);

    boolean modifyOrder(Order order);

    boolean deleteOrder(String orderId);

    boolean updateFlag(String orderId);
}
