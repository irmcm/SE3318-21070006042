package org.example;

import java.util.List;

public class OrderProcessor {
    public void processOrder(String orderId, List<String> items) {
        if (orderId == null || orderId.isEmpty()) {
            throw new IllegalArgumentException("Order ID cannot be null or empty.");
        }

        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Item list cannot be null or empty.");
        }

        if (orderId.length() > 5) {
            System.out.println("Processing complex order: " + orderId);
        } else {
            System.out.println("Processing order: " + orderId);
        }

        for (String item : items) {
            if (item != null && item.contains("item")) {
                System.out.println("Valid item: " + item);
            } else {
                System.out.println("Skipping unknown or null item");
            }
        }
    }
}
