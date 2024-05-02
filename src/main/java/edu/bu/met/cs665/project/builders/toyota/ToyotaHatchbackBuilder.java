/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: ToyotaHatchbackBuilder.java
 * Description: This class represents a concrete builder for constructing Toyota hatchback cars.
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
  * This class represents a concrete builder for constructing Toyota hatchback cars.
  */
 public class ToyotaHatchbackBuilder implements CarBuilder {
     private Car car;
 
     public ToyotaHatchbackBuilder() {
         this.car = new Car();
         this.car.setCompany("Toyota");
         this.car.setCarType("Hatchback");
     }
 
     public void reset() {
         this.car = new Car();
         this.car.setCompany("Toyota");
         this.car.setCarType("Hatchback");
     }
 
     public void buildModel(String model) {
         this.car.setModel(model);
     }
 
     public void buildSeats(int seats) {
         this.car.setSeats(seats);
     }
 
     public void buildColor(String color) {
         this.car.setColor(color);
     }
 
     public void buildEngine(Engine engine) {
         this.car.setEngine(engine);
     }
 
     public void buildTripComputer(TripComputer tripComputer) {
         this.car.setTripComputer(tripComputer);
     }
 
     public void buildTransmission(Transmission transmission) {
         this.car.setTransmission(transmission);
     }
 
     public void buildGpsNavigator(GPSNavigator gpsNavigator) {
         this.car.setGpsNavigator(gpsNavigator);
     }
 
     public void setPricingStrategy(PricingStrategy pricingStrategy) {
         this.car.setPricingStrategy(pricingStrategy);
     }
 
     public Car getResult() {
         return this.car;
     }
 }
 