package com.carrental.interfaces;

/**
 * Abstract base class representing a generic car.
 */
public abstract class CarAbstract {
    protected String brand;
    protected String model;
    protected String licensePlate;

    public CarAbstract(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    /**
     * Calculates the daily rental price for the car.
     *
     * @return daily rental price
     */
    public abstract double calculateRentalPricePerDay();

    /**
     * Returns basic information about the car.
     *
     * @return car details
     */
    public String getDetails() {
        return brand + " " + model + " (" + licensePlate + ")";
    }
}