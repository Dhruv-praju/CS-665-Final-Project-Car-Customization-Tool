package edu.bu.met.cs665;

import edu.bu.met.cs665.project.builders.*;
import edu.bu.met.cs665.project.builders.honda.HondaSedanBuilder;
import edu.bu.met.cs665.project.components.*;
import edu.bu.met.cs665.project.decorators.AutonomousDrivingDecorator;
import edu.bu.met.cs665.project.factories.*;
import edu.bu.met.cs665.project.pricingStrategy.DiscontedPricingStrategy;
import edu.bu.met.cs665.project.pricingStrategy.StandardPricingStrategy;
import edu.bu.met.cs665.project.car.*;


/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // Make you own Honda sedan
        CarFactory myhondCarFactory = new HondaFactory();
        CarBuilder hondaSedanBuilder = myhondCarFactory.createSedanBuilder();

        hondaSedanBuilder.buildModel("2024 Civic");
        hondaSedanBuilder.buildColor("Black");
        hondaSedanBuilder.buildEngine(new Engine(2.0, 192, 5000));
        hondaSedanBuilder.buildSeats(4);
        hondaSedanBuilder.buildTransmission(Transmission.AUTOMATIC);
        hondaSedanBuilder.buildTripComputer(new TripComputer());
        hondaSedanBuilder.setPricingStrategy(new StandardPricingStrategy());
        
        hondaSedanBuilder.setPricingStrategy(new DiscontedPricingStrategy());

        double carPrice = hondaSedanBuilder.calculatePrice();
        
        Car myCar = hondaSedanBuilder.getResult();
        
        System.out.println("The price of car is : $"+ carPrice);
        
        System.out.println(myCar);

        myCar = new AutonomousDrivingDecorator(myCar);

        System.out.println();
    }
}