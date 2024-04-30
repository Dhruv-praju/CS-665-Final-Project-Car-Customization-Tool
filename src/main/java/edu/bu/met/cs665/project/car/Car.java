package edu.bu.met.cs665.project.car;

import edu.bu.met.cs665.project.components.*;

public class Car {
    private String carType;
    private String model;
    private int seats;
    private String color;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    private double fuel =0;

    public double getFuel() {
        return fuel;
    }
    public String getCarType() {
        return carType;
    }
    public Engine getEngine() {
        return engine;
    }
    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
    public int getSeats() {
        return seats;
    }
    public Transmission getTransmission() {
        return transmission;
    }
    public TripComputer getTripComputer() {
        return tripComputer;
    }
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
