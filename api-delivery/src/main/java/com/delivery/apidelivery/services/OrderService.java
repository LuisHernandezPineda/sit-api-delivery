package com.delivery.apidelivery.services;

import com.delivery.apidelivery.entities.Food;
import com.delivery.apidelivery.entities.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public List<Food> getFoodMenu() {
        // return a list of available food items
        return null;
    }

    public Order placeOrder(Order order) {
        // add the order to the list of orders and return it
        return order;
    }

    public Order getOrder(int id) {
        // return the order with the given id
        return null;
    }

    public List<Order> getOrdersByCustomerEmail(String email) {
        // return a list of orders with the given customer email
        return null;
    }

    public void updateOrderStatus(int id, String status) {
        // update the status of the order with the given id
    }
}


