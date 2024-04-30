package edu.bu.met.cs665.project.builders;

import edu.bu.met.cs665.project.components.Engine;
import edu.bu.met.cs665.project.components.GPSNavigator;
import edu.bu.met.cs665.project.components.Transmission;
import edu.bu.met.cs665.project.components.TripComputer;

public interface CarBuilder {
    public void buildModel(String model);
    public void buildCarType(String carType);
    public void buildSeats(int seats);
    public void buildColor(String color);
    public void buildEngine(Engine engine);
    public void buildTransmission(Transmission transmission);
    public void buildTripComputer(TripComputer tripComputer);
    public void buildGpsNavigator(GPSNavigator gpsNavigator);
    public double calculatePrice();
}
