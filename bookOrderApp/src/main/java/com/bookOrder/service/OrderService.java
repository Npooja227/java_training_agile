package com.bookOrder.service;

import com.bookOrder.model.Order;

import java.sql.SQLException;
import java.util.List;

public interface OrderService  {
    int createOrder(Order o,String bName) throws SQLException;
    List<Order> getOrder(String authorName) throws SQLException;
    int updateOrder(Order o) throws SQLException;

    int deleteOrder(int orderId) throws SQLException;
}