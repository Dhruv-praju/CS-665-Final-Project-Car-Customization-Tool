/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: CarDecorator.java
 * Description: Represents an abstract decorator for adding features to a car.
 */

 package edu.bu.met.cs665.project.decorators;

 import edu.bu.met.cs665.project.car.Car;
 
 /**
  * Represents an abstract decorator for adding features to a car.
  */
 public abstract class CarDecorator extends Car {
     protected Car car;
 
     /**
      * Constructs a CarDecorator with the specified car to decorate.
      *
      * @param car The car to decorate with additional features.
      */
     public CarDecorator(Car car) {
         this.car = car;
     }
 
     /**
      * Abstract method to calculate the price after adding decorator features.
      *
      * @return The calculated price after adding decorator features.
      */
     public abstract double calculatePrice();
 
     /**
      * Overrides the toString method to delegate to the decorated car's toString method.
      *
      * @return The string representation of the decorated car.
      */
     @Override
     public String toString() {
         return car.toString();
     }
 }
 