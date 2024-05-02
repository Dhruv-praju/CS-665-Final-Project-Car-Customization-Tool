package edu.bu.met.cs665.project.components;

public class Engine {
    private final double volume;
    private double mileage;
    private int horsepower;
    private int torque;
    private boolean started;

    public Engine(double volume, int horsepower, int torque) {
        this.volume = volume;
        this.horsepower = horsepower;
        this.torque = torque;
    }
    @Override
    public String toString() {
        return "volume: "+volume+"L,  "+"horsepower: "+horsepower+", "+"torque: "+torque+"rpm";
    }
    public double getMileage() {
        return mileage;
    }
    public double getVolume() {
        return volume;
    }
    public int getHorsepower() {
        return horsepower;
    }
    public int getTorque() {
        return torque;
    }
    
}
