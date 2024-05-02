package edu.bu.met.cs665.project.pricingStrategy;

import edu.bu.met.cs665.project.car.Car;

public class DiscontedPricingStrategy implements PricingStrategy{
    @Override
    public double calculatePrice(Car car) {
        // Implement discounted pricing calculation based on car attributes
        double basePrice = 25000.0; // Example base price
        double discountPercentage = 0.10; // 10% discount
        double discountedPrice = basePrice - (basePrice * discountPercentage);
        return discountedPrice;
    }
}
