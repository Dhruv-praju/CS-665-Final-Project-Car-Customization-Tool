/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: AutonomousDrivingDecorator.java
 * Description: Represents a decorator that adds autonomous driving capabilities to a car.
 */

 package edu.bu.met.cs665.project.decorators;

 import edu.bu.met.cs665.project.car.Car;
 
 /**
  * Represents a decorator that adds autonomous driving capabilities to a car.
  */
 public class AutonomousDrivingDecorator extends CarDecorator {
     private static final double AUTOMATION_PRICE = 2000.0;
 
     /**
      * Constructs an AutonomousDrivingDecorator with the specified car to decorate.
      *
      * @param car The car to decorate with autonomous driving capabilities.
      */
     public AutonomousDrivingDecorator(Car car) {
         super(car);
     }
 
     /**
      * Engages the autopilot mode.
      */
     public void engageAutopilot() {
         System.out.println("Autopilot engaged. You don't need to do anything. I will take care of everything. Sit back & Enjoy the ride!");
     }
 
     /**
      * Overrides the start method to activate autopilot after starting the car.
      */
     @Override
     public void start() {
         // Activate autopilot after starting the car
         this.car.start();
         engageAutopilot();
     }
 
     /**
      * Overrides the toString method to include the autonomous driving feature in the description.
      */
     @Override
     public String toString() {
         return super.toString() + "Autonomous Driving\n";
     }
 
     /**
      * Overrides the calculatePrice method to include the cost of autonomous driving.
      */
     @Override
     public double calculatePrice() {
         return car.calculatePrice() + AUTOMATION_PRICE;
     }
 }
 