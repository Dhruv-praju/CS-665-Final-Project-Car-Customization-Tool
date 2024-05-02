/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: HondaFactory.java
 * Description: This class represents a concrete car factory for creating Honda car builders.
 */

 package edu.bu.met.cs665.project.factories;

 import edu.bu.met.cs665.project.builders.CarBuilder;
 import edu.bu.met.cs665.project.builders.honda.HondaHatchbackBuilder;
 import edu.bu.met.cs665.project.builders.honda.HondaSUVBuilder;
 import edu.bu.met.cs665.project.builders.honda.HondaSedanBuilder;
 
 /**
  * This class represents a concrete car factory for creating Honda car builders.
  */
 public class HondaFactory implements CarFactory {
 
     /**
      * Creates a Honda sedan car builder.
      *
      * @return A Honda sedan car builder.
      */
     @Override
     public CarBuilder createSedanBuilder() {
         return new HondaSedanBuilder();
     }
 
     /**
      * Creates a Honda hatchback car builder.
      *
      * @return A Honda hatchback car builder.
      */
     @Override
     public CarBuilder createHatchbackBuilder() {
         return new HondaHatchbackBuilder();
     }
 
     /**
      * Creates a Honda SUV car builder.
      *
      * @return A Honda SUV car builder.
      */
     @Override
     public CarBuilder createSUVBuilder() {
         return new HondaSUVBuilder();
     }
 }
 