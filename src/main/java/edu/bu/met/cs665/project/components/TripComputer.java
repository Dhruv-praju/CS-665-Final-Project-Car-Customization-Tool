package edu.bu.met.cs665.project.components;

import edu.bu.met.cs665.project.car.*;;

public class TripComputer {
    private Car car;

    public void showFuelLevel() {
        System.out.println("Fuel level: "+car.getFuel());
    }
}
