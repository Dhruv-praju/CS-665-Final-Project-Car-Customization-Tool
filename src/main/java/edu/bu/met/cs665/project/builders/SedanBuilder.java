package edu.bu.met.cs665.project.builders;

import edu.bu.met.cs665.project.car.*;
import edu.bu.met.cs665.project.components.*;
import edu.bu.met.cs665.project.pricingStrategy.PricingStrategy;



public class SedanBuilder implements CarBuilder{
    private Car car = new Car();
    private PricingStrategy pricingStrategy;

    public void buildModel(String model){
        car.setModel(model);
    }
    public void buildCarType(String carType) {
        car.setCarType(carType);
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
        return pricingStrategy.calcualtePrice(car);
    }
    public Car getResult(){
        return car;
    }

}
