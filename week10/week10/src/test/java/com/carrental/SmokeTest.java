package com.carrental;

import com.carrental.model.*;
import com.carrental.interfaces.CarAbstract;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Smoke test for the car rental system.
 */
public class SmokeTest {

    @Test
    public void testLuxuryCarFullFeatures() {
        CarAbstract car = new LuxuryCar("BMW", "7 Series", "34XYZ999", true, true);
        assertEquals(150.0, car.calculateRentalPricePerDay());
    }

    @Test
    public void testEconomyCarHybrid() {
        CarAbstract car = new EconomyCar("Renault", "Clio", "35ABC123", true);
        assertEquals(60.0, car.calculateRentalPricePerDay());
    }

    @Test
    public void testLuxuryCarNoExtras() {
        CarAbstract car = new LuxuryCar("Mercedes", "E-Class", "06ABC111", false, false);
        assertEquals(100.0, car.calculateRentalPricePerDay());
    }

    @Test
    public void testEconomyCarNonHybrid() {
        CarAbstract car = new EconomyCar("Fiat", "Egea", "35XYZ987", false);
        assertEquals(50.0, car.calculateRentalPricePerDay());
    }
}