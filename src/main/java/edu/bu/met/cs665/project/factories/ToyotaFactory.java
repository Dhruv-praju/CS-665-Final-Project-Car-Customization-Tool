/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: ToyotaFactory.java
 * Description: This class represents a concrete car factory for creating Toyota car builders.
 */

 package edu.bu.met.cs665.project.factories;

 import edu.bu.met.cs665.project.builders.CarBuilder;
 import edu.bu.met.cs665.project.builders.toyota.ToyotaHatchbackBuilder;
 import edu.bu.met.cs665.project.builders.toyota.ToyotaSUVBuilder;
 import edu.bu.met.cs665.project.builders.toyota.ToyotaSedanBuilder;
 
 /**
  * This class represents a concrete car factory for creating Toyota car builders.
  */
 public class ToyotaFactory implements CarFactory {
 
     /**
      * Creates a Toyota sedan car builder.
      *
      * @return A Toyota sedan car builder.
      */
     @Override
     public CarBuilder createSedanBuilder() {
         return new ToyotaSedanBuilder();
     }
 
     /**
      * Creates a Toyota hatchback car builder.
      *
      * @return A Toyota hatchback car builder.
      */
     @Override
     public CarBuilder createHatchbackBuilder() {
         return new ToyotaHatchbackBuilder();
     }
 
     /**
      * Creates a Toyota SUV car builder.
      *
      * @return A Toyota SUV car builder.
      */
     @Override
     public CarBuilder createSUVBuilder() {
         return new ToyotaSUVBuilder();
     }
 }
 