/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: SafetyFeatureDecorator.java
 * Description: Represents a decorator that adds safety features to a car.
 */

 package edu.bu.met.cs665.project.decorators;

 import edu.bu.met.cs665.project.car.Car;
 
 /**
  * Represents a decorator that adds safety features to a car.
  */
 public class SafetyFeatureDecorator extends CarDecorator {
     private static final double SAFETY_FEATURES_PRICE = 1000.0;
 
     /**
      * Constructs a SafetyFeatureDecorator with the specified car to decorate.
      *
      * @param car The car to decorate with safety features.
      */
     public SafetyFeatureDecorator(Car car) {
         super(car);
     }
 
     /**
      * Overrides the applyBrakes method to activate safety features before applying brakes.
      */
     @Override
     public void applyBrakes() {
         // Activate additional safety features before applying brakes
         activateSafetyFeatures();
         this.car.applyBrakes();
     }
 
     /**
      * Activates advanced safety features.
      */
     public void activateSafetyFeatures() {
         System.out.println("Advanced safety features activated");
     }
 
     /**
      * Overrides the toString method to include the safety features in the description.
      */
     @Override
     public String toString() {
         return super.toString() + "Safety Features\n";
     }
 
     /**
      * Overrides the calculatePrice method to include the cost of safety features.
      */
     @Override
     public double calculatePrice() {
         return car.calculatePrice() + SAFETY_FEATURES_PRICE;
     }
 }
 