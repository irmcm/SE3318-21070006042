package org.example;

public class PaymentService {
    public void processPayment(String cardNumber, double amount, String currency) {
        if (cardNumber == null || cardNumber.trim().isEmpty()) {
            System.out.println("Card number is missing or empty");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return;
        }

        if (currency == null || currency.trim().isEmpty()) {
            System.out.println("Currency is missing or empty");
            return;
        }

        if (cardNumber.startsWith("4")) {
            if ("USD".equals(currency)) {
                System.out.println("Processing Visa USD payment");
            } else {
                System.out.println("Visa payment in other currency");
            }
        } else if (cardNumber.length() < 16) {
            System.out.println("Invalid card number length");
        } else {
            System.out.println("Non-Visa card detected");
        }
    }
}