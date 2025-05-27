package org.example;

public class UserValidator {
    public boolean validateUser(String name, int age, String email) {
        boolean isValid = true;

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name is missing");
            isValid = false;
        } else if (name.length() < 2) {
            System.out.println("Name too short");
            isValid = false;
        }

        if (age < 0 || age > 150) {
            System.out.println("Age is out of range");
            isValid = false;
        }

        if (email == null || !email.contains("@")) {
            System.out.println("Email is invalid");
            isValid = false;
        }

        return isValid;
    }
}