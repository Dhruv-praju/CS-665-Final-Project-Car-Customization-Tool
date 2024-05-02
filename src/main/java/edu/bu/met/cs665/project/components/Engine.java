/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: Engine.java
 * Description: Represents an engine component of a car.
 */

 package edu.bu.met.cs665.project.components;

 /**
  * Represents an engine component of a car.
  */
 public class Engine implements Component {
     private final double volume;
     private double mileage;
     private int horsepower;
     private int torque;
     private boolean started;
 
     /**
      * Constructs an Engine object with the specified volume, horsepower, and torque.
      *
      * @param volume     The volume of the engine in liters.
      * @param horsepower The horsepower of the engine.
      * @param torque     The torque of the engine in rpm (revolutions per minute).
      */
     public Engine(double volume, int horsepower, int torque) {
         this.volume = volume;
         this.horsepower = horsepower;
         this.torque = torque;
     }
 
     /**
      * Returns a string representation of the engine.
      *
      * @return A string describing the engine's volume, horsepower, and torque.
      */
     @Override
     public String toString() {
         return "volume: " + volume + "L, " + "horsepower: " + horsepower + ", " + "torque: " + torque + "rpm";
     }
 
     /**
      * Retrieves the mileage of the engine.
      *
      * @return The mileage of the engine.
      */
     public double getMileage() {
         return mileage;
     }
 
     /**
      * Retrieves the volume of the engine.
      *
      * @return The volume of the engine in liters.
      */
     public double getVolume() {
         return volume;
     }
 
     /**
      * Retrieves the horsepower of the engine.
      *
      * @return The horsepower of the engine.
      */
     public int getHorsepower() {
         return horsepower;
     }
 
     /**
      * Retrieves the torque of the engine.
      *
      * @return The torque of the engine in rpm (revolutions per minute).
      */
     public int getTorque() {
         return torque;
     }
 }
 