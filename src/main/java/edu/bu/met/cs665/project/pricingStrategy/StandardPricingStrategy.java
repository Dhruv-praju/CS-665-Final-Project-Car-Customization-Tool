/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: StandardPricingStrategy.java
 * Description: Represents a standard pricing strategy based on car attributes.
 */

 package edu.bu.met.cs665.project.pricingStrategy;

 import edu.bu.met.cs665.project.car.Car;
 import edu.bu.met.cs665.project.components.Transmission;
 
 /**
  * Represents a standard pricing strategy based on car attributes.
  */
 public class StandardPricingStrategy implements PricingStrategy {
 
     /**
      * Calculates the price of a car using a standard pricing strategy.
      *
      * @param car The car for which to calculate the price.
      * @return The calculated price based on the standard pricing strategy.
      */
     @Override
     public double calculatePrice(Car car) {
         double additionalCost = calculateAdditionalCost(car);
         return car.getBasePrice() + additionalCost;
     }
 
     /**
      * Calculates the additional cost based on specific car attributes.
      *
      * @param car The car for which to calculate the additional cost.
      * @return The calculated additional cost.
      */
     private double calculateAdditionalCost(Car car) {
         // Implement logic to calculate additional cost based on car attributes
         double additionalCost = 0.0;
 
         // Example: Add cost based on engine volume
         additionalCost += car.getEngine().getVolume() * 5000;
 
         // Example: Add cost based on transmission type
         Transmission transmission = car.getTransmission();
         if (transmission == Transmission.MANUAL) {
             additionalCost += 3000.0;
         } else if (transmission == Transmission.SEMI_AUTOMATIC) {
             additionalCost += 4000.0;
         } else if (transmission == Transmission.AUTOMATIC) {
             additionalCost += 5000.0;
         }
 
         return additionalCost;
     }
 }
 