package com.carrental.model;

import com.carrental.interfaces.CarAbstract;

/**
 * Represents an economy car with an optional hybrid feature.
 */
public class EconomyCar extends CarAbstract {
    private static final double BASE_PRICE = 50;
    private boolean isHybrid;

    public EconomyCar(String brand, String model, String licensePlate, boolean isHybrid) {
        super(brand, model, licensePlate);
        this.isHybrid = isHybrid;
    }

    /**
     * Calculates the rental price per day including hybrid option.
     *
     * @return daily rental price
     */
    @Override
    public double calculateRentalPricePerDay() {
        return BASE_PRICE + (isHybrid ? 10 : 0);
    }
}