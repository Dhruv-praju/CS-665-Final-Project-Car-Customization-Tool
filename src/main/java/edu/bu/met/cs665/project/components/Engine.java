package edu.bu.met.cs665.project.components;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }
    public double getMileage() {
        return mileage;
    }
    public double getVolume() {
        return volume;
    }
}
