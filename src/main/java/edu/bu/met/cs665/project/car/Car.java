package edu.bu.met.cs665.project.car;

import edu.bu.met.cs665.project.components.*;

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
    protected double fuel =0;

    public double getFuel() {
        return fuel;
    }
    public String getCompany() {
        return company;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
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
    public void setCompany(String company) {
        this.company = company;
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
    @Override
    public String toString() {
        return this.company+" "+this.model+ "\n" + "type: "+this.carType + "\n"+ "seats: "+this.seats + "\n"+ "color: "+this.color+"\n"+ "engine: "+this.engine+"\n"+"transmission: "+this.transmission+"\n" ;
    }

    public void start(){
        // start the engine
        System.out.println("Started car engine!");
    }
    public void speedUp(){
        System.out.println("Speeding UPP! Wear Seatbelts tight!");
    }
    public void turnLeft(){
        System.out.println("Taking Left");
    }
    public void turnRight(){
        System.out.println("Taking Right");
    }
    public void applyBrakes(){
        System.out.println("Car Stopped!");
    }

}