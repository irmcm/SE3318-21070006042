package com.carrental;

import com.carrental.model.*;
import com.carrental.interfaces.CarAbstract;

/**
 * Entry point of the car rental system.
 */
public class Main {
    public static void main(String[] args) {
        CarAbstract luxury = new LuxuryCar("Audi", "A8", "34LUX123", true, false);
        CarAbstract economy = new EconomyCar("Toyota", "Corolla", "35EKO456", true);

        RentalRecord record1 = new RentalRecord("Alice", 3, luxury.calculateRentalPricePerDay());
        RentalRecord record2 = new RentalRecord("Bob", 5, economy.calculateRentalPricePerDay());

        System.out.println(luxury.getDetails() + " → " + record1.getSummary());
        System.out.println(economy.getDetails() + " → " + record2.getSummary());
    }
}