/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: ToyotaSedanBuilder.java
 * Description: This class represents a concrete builder for constructing Toyota sedan cars.
 * 
 * Class Responsibilities:
 * - Constructs instances of Toyota sedan cars by implementing the CarBuilder interface.
 * - Initializes a new Car object with Toyota as the company and Sedan as the car type upon construction.
 * - Provides methods to set various attributes of the car, such as model, seats, color, engine, trip computer, transmission, GPS navigator, and pricing strategy.
 * - Implements a reset method to reset the builder to its initial state.
 * - Implements methods to build specific attributes of the car.
 * - Implements a method to retrieve the constructed Car object.
 */

 package edu.bu.met.cs665.project.builders.toyota;

 import edu.bu.met.cs665.project.builders.CarBuilder;
 import edu.bu.met.cs665.project.car.Car;
 import edu.bu.met.cs665.project.components.Engine;
 import edu.bu.met.cs665.project.components.GPSNavigator;
 import edu.bu.met.cs665.project.components.Transmission;
 import edu.bu.met.cs665.project.components.TripComputer;
 import edu.bu.met.cs665.project.pricingStrategy.PricingStrategy;
 
 /**
  * This class represents a concrete builder for constructing Toyota sedan cars.
  */
 public class ToyotaSedanBuilder implements CarBuilder {
     private Car car;
 
     /**
      * Constructs a ToyotaSedanBuilder and initializes a new Car instance with Toyota as the company and Sedan as the car type.
      */
     public ToyotaSedanBuilder() {
         this.car = new Car();
         this.car.setCompany("Toyota");
         this.car.setCarType("Sedan");
     }
 
     /**
      * Resets the builder to its initial state by creating a new Car instance.
      */
     public void reset() {
         this.car = new Car();
         this.car.setCompany("Toyota");
         this.car.setCarType("Sedan");
     }
 
     /**
      * Sets the model of the car.
      *
      * @param model The model of the car.
      */
     public void buildModel(String model) {
         this.car.setModel(model);
     }
 
     /**
      * Sets the number of seats in the car.
      *
      * @param seats The number of seats in the car.
      */
     public void buildSeats(int seats) {
         this.car.setSeats(seats);
     }
 
     /**
      * Sets the color of the car.
      *
      * @param color The color of the car.
      */
     public void buildColor(String color) {
         this.car.setColor(color);
     }
 
     /**
      * Sets the engine of the car.
      *
      * @param engine The engine of the car.
      */
     public void buildEngine(Engine engine) {
         this.car.setEngine(engine);
     }
 
     /**
      * Sets the trip computer of the car.
      *
      * @param tripComputer The trip computer of the car.
      */
     public void buildTripComputer(TripComputer tripComputer) {
         this.car.setTripComputer(tripComputer);
     }
 
     /**
      * Sets the transmission of the car.
      *
      * @param transmission The transmission of the car.
      */
     public void buildTransmission(Transmission transmission) {
         this.car.setTransmission(transmission);
     }
 
     /**
      * Sets the GPS navigator of the car.
      *
      * @param gpsNavigator The GPS navigator of the car.
      */
     public void buildGpsNavigator(GPSNavigator gpsNavigator) {
         this.car.setGpsNavigator(gpsNavigator);
     }
 
     /**
      * Sets the pricing strategy for the car.
      *
      * @param pricingStrategy The pricing strategy for the car.
      */
     public void setPricingStrategy(PricingStrategy pricingStrategy) {
         this.car.setPricingStrategy(pricingStrategy);
     }
 
     /**
      * Retrieves the constructed Car object.
      *
      * @return The constructed Car object.
      */
     public Car getResult() {
         return this.car;
     }
 }
 