/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: TripComputer.java
 * Description: Represents a trip computer component of a car.
 */

 package edu.bu.met.cs665.project.components;

 import edu.bu.met.cs665.project.car.Car;
 
 /**
  * Represents a trip computer component of a car.
  */
 public class TripComputer implements Component {
     private Car car;
 
     /**
      * Displays the fuel level of the car.
      */
     public void showFuelLevel() {
         System.out.println("Fuel level: " + car.getFuel());
     }
 }
 