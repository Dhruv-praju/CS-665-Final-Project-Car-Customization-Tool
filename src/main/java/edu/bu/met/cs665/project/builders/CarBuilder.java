package edu.bu.met.cs665.project.builders;

import edu.bu.met.cs665.project.car.Car;
import edu.bu.met.cs665.project.components.*;
import edu.bu.met.cs665.project.pricingStrategy.PricingStrategy;


public interface CarBuilder {
    
    public void reset();
    public void buildModel(String model);
    public void buildSeats(int seats);
    public void buildColor(String color);
    public void buildEngine(Engine engine);
    public void buildTransmission(Transmission transmission);
    public void buildTripComputer(TripComputer tripComputer);
    public void buildGpsNavigator(GPSNavigator gpsNavigator);
    public Car getResult();
    public void setPricingStrategy(PricingStrategy pricingStrategy);
}
