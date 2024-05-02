/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: CarFactory.java
 * Description: This interface represents a car factory responsible for creating specific types of car builders.
 */

 package edu.bu.met.cs665.project.factories;

 import edu.bu.met.cs665.project.builders.CarBuilder;
 
 /**
  * This interface represents a car factory responsible for creating specific types of car builders.
  */
 public interface CarFactory {
     
     /**
      * Creates a hatchback car builder for the factory's specific car brand.
      *
      * @return A hatchback car builder.
      */
     public CarBuilder createHatchbackBuilder();
     
     /**
      * Creates a sedan car builder for the factory's specific car brand.
      *
      * @return A sedan car builder.
      */
     public CarBuilder createSedanBuilder();
     
     /**
      * Creates an SUV car builder for the factory's specific car brand.
      *
      * @return An SUV car builder.
      */
     public CarBuilder createSUVBuilder();
 }
 