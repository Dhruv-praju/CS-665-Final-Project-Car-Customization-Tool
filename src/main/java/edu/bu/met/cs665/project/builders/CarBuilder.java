/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: CarBuilder.java
 * Description: This interface represents a builder for constructing cars with specific features.
 */

 package edu.bu.met.cs665.project.builders;

 import edu.bu.met.cs665.project.car.Car;
 import edu.bu.met.cs665.project.components.Engine;
 import edu.bu.met.cs665.project.components.GPSNavigator;
 import edu.bu.met.cs665.project.components.Transmission;
 import edu.bu.met.cs665.project.components.TripComputer;
 import edu.bu.met.cs665.project.pricingStrategy.PricingStrategy;
 
 /**
  * This interface represents a builder for constructing cars with specific features.
  */
 public interface CarBuilder {
     
     /**
      * Resets the car builder to its initial state.
      */
     public void reset();
     
     /**
      * Builds the model of the car.
      *
      * @param model The model of the car.
      */
     public void buildModel(String model);
     
     /**
      * Builds the number of seats in the car.
      *
      * @param seats The number of seats in the car.
      */
     public void buildSeats(int seats);
     
     /**
      * Builds the color of the car.
      *
      * @param color The color of the car.
      */
     public void buildColor(String color);
     
     /**
      * Builds the engine of the car.
      *
      * @param engine The engine of the car.
      */
     public void buildEngine(Engine engine);
     
     /**
      * Builds the transmission of the car.
      *
      * @param transmission The transmission of the car.
      */
     public void buildTransmission(Transmission transmission);
     
     /**
      * Builds the trip computer of the car.
      *
      * @param tripComputer The trip computer of the car.
      */
     public void buildTripComputer(TripComputer tripComputer);
     
     /**
      * Builds the GPS navigator of the car.
      *
      * @param gpsNavigator The GPS navigator of the car.
      */
     public void buildGpsNavigator(GPSNavigator gpsNavigator);
     
     /**
      * Returns the constructed car.
      *
      * @return The constructed car.
      */
     public Car getResult();
     
     /**
      * Sets the pricing strategy for the car.
      *
      * @param pricingStrategy The pricing strategy for the car.
      */
     public void setPricingStrategy(PricingStrategy pricingStrategy);
 }
 