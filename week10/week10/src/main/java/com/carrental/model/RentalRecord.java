package com.carrental.model;

/**
 * Represents a rental record for a vehicle.
 */
public class RentalRecord {
    private String lesseeName;
    private int rentalDays;
    private double totalPrice;

    public RentalRecord(String lesseeName, int rentalDays, double pricePerDay) {
        this.lesseeName = lesseeName;
        this.rentalDays = rentalDays;
        this.totalPrice = rentalDays * pricePerDay;
    }

    /**
     * Returns summary of the rental record.
     *
     * @return summary string
     */
    public String getSummary() {
        return lesseeName + " rented for " + rentalDays + " days. Total: $" + totalPrice;
    }
}