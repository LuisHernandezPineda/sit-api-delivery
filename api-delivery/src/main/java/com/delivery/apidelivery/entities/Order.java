package com.delivery.apidelivery.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int id;
    private String customerName;
    private String customerEmail;
    private String status;
    private LocalDateTime creationTime;
    private LocalDateTime estimatedDeliveryTime;
    private List<Food> items;

    public Order(int id, String customerName, String customerEmail, String status,
                 LocalDateTime creationTime, LocalDateTime estimatedDeliveryTime,
                 List<Food> items) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.status = status;
        this.creationTime = creationTime;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.items = items;
    }

    // getters and setters
}

