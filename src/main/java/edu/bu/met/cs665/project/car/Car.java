/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: Car.java
 * Description: Represents a car with various attributes and functionalities.
 */

 package edu.bu.met.cs665.project.car;

 import edu.bu.met.cs665.project.components.*;
 import edu.bu.met.cs665.project.pricingStrategy.PricingStrategy;
 
 /**
  * Represents a car with various attributes and functionalities.
  */
 public class Car {
     protected String carType;
     protected String company;
     protected String model;
     protected int seats;
     protected String color;
     protected Engine engine;
     protected Transmission transmission;
     protected TripComputer tripComputer;
     protected GPSNavigator gpsNavigator;
     protected double fuel = 0;
     private PricingStrategy pricingStrategy;
     private double basePrice = 25000.0;
 
     /**
      * Retrieves the current fuel level of the car.
      *
      * @return The current fuel level of the car.
      */
     public double getFuel() {
         return fuel;
     }
 
     /**
      * Retrieves the company of the car.
      *
      * @return The company of the car.
      */
     public String getCompany() {
         return company;
     }
 
     /**
      * Retrieves the color of the car.
      *
      * @return The color of the car.
      */
     public String getColor() {
         return color;
     }
 
     /**
      * Retrieves the model of the car.
      *
      * @return The model of the car.
      */
     public String getModel() {
         return model;
     }
 
     /**
      * Retrieves the base price of the car.
      *
      * @return The base price of the car.
      */
     public double getBasePrice() {
         return basePrice;
     }
 
     /**
      * Retrieves the type of the car.
      *
      * @return The type of the car.
      */
     public String getCarType() {
         return carType;
     }
 
     /**
      * Retrieves the engine of the car.
      *
      * @return The engine of the car.
      */
     public Engine getEngine() {
         return engine;
     }
 
     /**
      * Retrieves the GPS navigator of the car.
      *
      * @return The GPS navigator of the car.
      */
     public GPSNavigator getGpsNavigator() {
         return gpsNavigator;
     }
 
     /**
      * Retrieves the number of seats in the car.
      *
      * @return The number of seats in the car.
      */
     public int getSeats() {
         return seats;
     }
 
     /**
      * Retrieves the transmission of the car.
      *
      * @return The transmission of the car.
      */
     public Transmission getTransmission() {
         return transmission;
     }
 
     /**
      * Retrieves the trip computer of the car.
      *
      * @return The trip computer of the car.
      */
     public TripComputer getTripComputer() {
         return tripComputer;
     }
 
     /**
      * Sets the fuel level of the car.
      *
      * @param fuel The fuel level to set.
      */
     public void setFuel(double fuel) {
         this.fuel = fuel;
     }
 
     /**
      * Sets the company of the car.
      *
      * @param company The company to set.
      */
     public void setCompany(String company) {
         this.company = company;
     }
 
     /**
      * Sets the type of the car.
      *
      * @param carType The type of the car to set.
      */
     public void setCarType(String carType) {
         this.carType = carType;
     }
 
     /**
      * Sets the engine of the car.
      *
      * @param engine The engine to set.
      */
     public void setEngine(Engine engine) {
         this.engine = engine;
     }
 
     /**
      * Sets the GPS navigator of the car.
      *
      * @param gpsNavigator The GPS navigator to set.
      */
     public void setGpsNavigator(GPSNavigator gpsNavigator) {
         this.gpsNavigator = gpsNavigator;
     }
 
     /**
      * Sets the number of seats in the car.
      *
      * @param seats The number of seats to set.
      */
     public void setSeats(int seats) {
         this.seats = seats;
     }
 
     /**
      * Sets the transmission of the car.
      *
      * @param transmission The transmission to set.
      */
     public void setTransmission(Transmission transmission) {
         this.transmission = transmission;
     }
 
     /**
      * Sets the trip computer of the car.
      *
      * @param tripComputer The trip computer to set.
      */
     public void setTripComputer(TripComputer tripComputer) {
         this.tripComputer = tripComputer;
     }
 
     /**
      * Sets the color of the car.
      *
      * @param color The color to set.
      */
     public void setColor(String color) {
         this.color = color;
     }
 
     /**
      * Sets the model of the car.
      *
      * @param model The model to set.
      */
     public void setModel(String model) {
         this.model = model;
     }
 
     /**
      * Sets the pricing strategy for the car.
      *
      * @param pricingStrategy The pricing strategy to set.
      */
     public void setPricingStrategy(PricingStrategy pricingStrategy) {
         this.pricingStrategy = pricingStrategy;
     }
 
     /**
      * Calculates the price of the car using the assigned pricing strategy.
      *
      * @return The calculated price of the car.
      */
     public double calculatePrice() {
         return pricingStrategy.calculatePrice(this);
     }
 
     /**
      * Starts the car's engine.
      */
     public void start() {
         System.out.println("Started car engine!");
     }
 
     /**
      * Accelerates the car to increase speed.
      */
     public void speedUp() {
         System.out.println("Speeding up! Fasten your seat belts!");
     }
 
     /**
      * Turns the car to the left.
      */
     public void turnLeft() {
         System.out.println("Turning left");
     }
 
     /**
      * Turns the car to the right.
      */
     public void turnRight() {
         System.out.println("Turning right");
     }
 
     /**
      * Applies brakes to stop the car.
      */
     public void applyBrakes() {
         System.out.println("Applying brakes! Car stopped.");
     }
 
     /**
      * Returns a string representation of the car.
      *
      * @return A string representation of the car.
      */
     @Override
     public String toString() {
         return this.company + " " + this.model + "\n" +
                 "Type: " + this.carType + "\n" +
                 "Seats: " + this.seats + "\n" +
                 "Color: " + this.color + "\n" +
                 "Engine: " + this.engine + "\n" +
                 "Transmission: " + this.transmission + "\n";
     }
 }
 