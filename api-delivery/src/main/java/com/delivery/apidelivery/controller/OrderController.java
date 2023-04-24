package com.delivery.apidelivery.controller;

import com.delivery.apidelivery.entities.Food;
import com.delivery.apidelivery.entities.Order;
import com.delivery.apidelivery.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/menu")
    public List<Food> getFoodMenu() {
        return orderService.getFoodMenu();
    }

    @PostMapping("/placeOrder")
    public Order placeOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id) {
        return orderService.getOrder(id);
    }

    @GetMapping("/customer/{email}")
    public List<Order> getOrdersByCustomerEmail(@PathVariable String email) {
        return orderService.getOrdersByCustomerEmail(email);
    }

    @PutMapping("/{id}/{status}")
    public void updateOrderStatus(@PathVariable int id, @PathVariable String status) {
        orderService.updateOrderStatus(id, status);
    }
}
