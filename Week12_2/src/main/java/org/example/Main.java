package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            OrderProcessor processor = new OrderProcessor();
            processor.processOrder("12345", Arrays.asList("item1", "item2", null));
        } catch (Exception e) {
            System.out.println("Order processing failed: " + e.getMessage());
        }

        try {
            UserValidator validator = new UserValidator();
            boolean valid = validator.validateUser("A", -5, null);
            System.out.println("User valid: " + valid);
        } catch (Exception e) {
            System.out.println("User validation failed: " + e.getMessage());
        }

        try {
            PaymentService paymentService = new PaymentService();
            paymentService.processPayment("", -250.00, "USD");
        } catch (Exception e) {
            System.out.println("Payment processing failed: " + e.getMessage());
        }
    }
}