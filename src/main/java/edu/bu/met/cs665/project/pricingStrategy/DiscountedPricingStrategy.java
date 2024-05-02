/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: DiscountedPricingStrategy.java
 * Description: Represents a pricing strategy that applies a discount to the base price.
 */

 package edu.bu.met.cs665.project.pricingStrategy;

 import edu.bu.met.cs665.project.car.Car;
 
 /**
  * Represents a pricing strategy that applies a discount to the base price.
  */
 public class DiscountedPricingStrategy implements PricingStrategy {
     /**
      * Calculates the price of the car with a discounted pricing strategy.
      *
      * @param car The car for which to calculate the price.
      * @return The calculated discounted price.
      */
     @Override
     public double calculatePrice(Car car) {
         // Implement discounted pricing calculation based on car attributes
         double basePrice = 25000.0; // Example base price
         double discountPercentage = 0.10; // 10% discount
         double discountedPrice = basePrice - (basePrice * discountPercentage);
         return discountedPrice;
     }
 }
 