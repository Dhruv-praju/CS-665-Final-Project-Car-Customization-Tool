/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: PricingStrategy.java
 * Description: Represents an interface for defining pricing strategies.
 */

 package edu.bu.met.cs665.project.pricingStrategy;

 import edu.bu.met.cs665.project.car.Car;
 
 /**
  * Represents an interface for defining pricing strategies.
  */
 public interface PricingStrategy {
     /**
      * Calculates the price of a car based on a specific pricing strategy.
      *
      * @param car The car for which to calculate the price.
      * @return The calculated price based on the strategy.
      */
     double calculatePrice(Car car);
 }
 