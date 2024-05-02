/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: HondaHatchbackBuilder.java
 * Description: This class represents a concrete builder for constructing Honda hatchback cars.
 */

 package edu.bu.met.cs665.project.builders.honda;

 import edu.bu.met.cs665.project.builders.CarBuilder;
 import edu.bu.met.cs665.project.car.Car;
 import edu.bu.met.cs665.project.components.Engine;
 import edu.bu.met.cs665.project.components.GPSNavigator;
 import edu.bu.met.cs665.project.components.Transmission;
 import edu.bu.met.cs665.project.components.TripComputer;
 import edu.bu.met.cs665.project.pricingStrategy.PricingStrategy;
 
 /**
  * This class represents a concrete builder for constructing Honda hatchback cars.
  */
 public class HondaHatchbackBuilder implements CarBuilder {
     private Car car;
 
     public HondaHatchbackBuilder() {
         this.car = new Car();
         this.car.setCompany("Honda");
         this.car.setCarType("Hatchback");
     }
 
     @Override
     public void reset() {
         this.car = new Car();
         this.car.setCompany("Honda");
         this.car.setCarType("Hatchback");
     }
 
     @Override
     public void buildModel(String model) {
         this.car.setModel(model);
     }
 
     @Override
     public void buildSeats(int seats) {
         this.car.setSeats(seats);
     }
 
     @Override
     public void buildColor(String color) {
         this.car.setColor(color);
     }
 
     @Override
     public void buildEngine(Engine engine) {
         this.car.setEngine(engine);
     }
 
     @Override
     public void buildTripComputer(TripComputer tripComputer) {
         this.car.setTripComputer(tripComputer);
     }
 
     @Override
     public void buildTransmission(Transmission transmission) {
         this.car.setTransmission(transmission);
     }
 
     @Override
     public void buildGpsNavigator(GPSNavigator gpsNavigator) {
         this.car.setGpsNavigator(gpsNavigator);
     }
 
     @Override
     public void setPricingStrategy(PricingStrategy pricingStrategy) {
         this.car.setPricingStrategy(pricingStrategy);
     }
 
     @Override
     public Car getResult() {
         return this.car;
     }
 }
 