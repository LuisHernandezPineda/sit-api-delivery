package com.delivery.apidelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class })
public class ApiDeliveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiDeliveryApplication.class, args);
    }

}
