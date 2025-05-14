package com.carrental.model;

import com.carrental.interfaces.CarAbstract;

/**
 * Represents a luxury car with optional GPS and leather seats.
 */
public class LuxuryCar extends CarAbstract {
    private static final double BASE_PRICE = 100;
    private boolean hasGPS;
    private boolean hasLeatherSeats;

    public LuxuryCar(String brand, String model, String licensePlate, boolean hasGPS, boolean hasLeatherSeats) {
        super(brand, model, licensePlate);
        this.hasGPS = hasGPS;
        this.hasLeatherSeats = hasLeatherSeats;
    }

    /**
     * Calculates the rental price per day including luxury features.
     *
     * @return daily rental price
     */
    @Override
    public double calculateRentalPricePerDay() {
        double price = BASE_PRICE;
        if (hasGPS) price += 20;
        if (hasLeatherSeats) price += 30;
        return price;
    }
}