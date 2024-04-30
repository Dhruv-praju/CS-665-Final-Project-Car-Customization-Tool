package edu.bu.met.cs665.project.pricingStrategy;

import edu.bu.met.cs665.project.car.Car;
import edu.bu.met.cs665.project.components.Transmission;

public class StandardPricingStrategy implements PricingStrategy{
    @Override
    public double calcualtePrice(Car car) {
        double basePrice = 25000.0; 
        double additionalCost = calculateAdditionalCost(car);
        return basePrice + additionalCost;
    }

    private double calculateAdditionalCost(Car car) {
        // Implement logic to calculate additional cost based on car attributes
        // Example: Add cost based on engine type, interior features, etc.
        double additionalCost = 0.0;

        additionalCost = car.getEngine().getVolume()*5000;

        if (car.getTransmission().equals(Transmission.MANUAL)) {
            additionalCost += 3000.0;
        }else if (car.getTransmission().equals(Transmission.SEMI_AUTOMATIC)) {
            additionalCost += 4000.0;
        }else if (car.getTransmission().equals(Transmission.AUTOMATIC)) {
            additionalCost += 5000.0;
        }

        
        return additionalCost;
    }
}
