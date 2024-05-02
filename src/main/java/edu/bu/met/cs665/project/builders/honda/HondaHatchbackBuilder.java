package edu.bu.met.cs665.project.builders.honda;

import edu.bu.met.cs665.project.builders.CarBuilder;
import edu.bu.met.cs665.project.car.Car;
import edu.bu.met.cs665.project.components.*;
import edu.bu.met.cs665.project.pricingStrategy.PricingStrategy;

public class HondaHatchbackBuilder implements CarBuilder{
    private Car car = new Car();
    private PricingStrategy pricingStrategy;

    public HondaHatchbackBuilder(){
        car.setCompany("Honda");
        car.setCarType("Hatchback");
    }

    public void reset(){
        this.car = new Car();
    }
    public void buildModel(String model){
        car.setModel(model);
    }
    public void buildSeats(int seats) {
        car.setSeats(seats);
    }

    public void buildColor(String Color){
        car.setColor(Color);
    }
    public void buildEngine(Engine engine){
        car.setEngine(engine);
    }
    public void buildTripComputer(TripComputer tripComputer){
        car.setTripComputer(tripComputer);
    }
    public void buildTransmission(Transmission transmission){
        car.setTransmission(transmission);  
    }
    public void buildGpsNavigator(GPSNavigator gpsNavigator){
        car.setGpsNavigator(gpsNavigator);
    }
    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    @Override
    public double calculatePrice() {
        return pricingStrategy.calculatePrice(car);
    }
    public Car getResult(){
        return car;
    }
    
}
