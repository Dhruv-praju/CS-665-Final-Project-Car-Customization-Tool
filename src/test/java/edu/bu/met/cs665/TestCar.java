package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
 
import org.junit.Test;

import edu.bu.met.cs665.project.builders.*;
import edu.bu.met.cs665.project.builders.honda.*;
import edu.bu.met.cs665.project.components.*;
import edu.bu.met.cs665.project.decorators.AutonomousDrivingDecorator;
import edu.bu.met.cs665.project.decorators.SafetyFeatureDecorator;
import edu.bu.met.cs665.project.director.Director;
import edu.bu.met.cs665.project.car.*;
import edu.bu.met.cs665.project.factories.*;
import edu.bu.met.cs665.project.pricingStrategy.*;

public class TestCar {
    
    @Test
    public void testCreatingSedanCar(){
        CarFactory hondaFactory = new HondaFactory();
        CarBuilder hondaSedanBuilder = hondaFactory.createSedanBuilder();

        hondaSedanBuilder.buildModel("Accord");
        hondaSedanBuilder.buildColor("Grey");
        hondaSedanBuilder.buildEngine(new Engine(2.0, 192, 5000));
        hondaSedanBuilder.buildSeats(4);
        hondaSedanBuilder.buildTransmission(Transmission.AUTOMATIC);
        hondaSedanBuilder.buildTripComputer(new TripComputer());

        Car myCar = hondaSedanBuilder.getResult();
        
        System.out.println(myCar);
    }

    @Test
    public void testCreatingHatchbackCar(){
        CarFactory hondaFactory = new HondaFactory();
        CarBuilder hondaHatchbackBuilder = hondaFactory.createHatchbackBuilder();

        hondaHatchbackBuilder.buildModel("Civic");
        hondaHatchbackBuilder.buildColor("Black");
        hondaHatchbackBuilder.buildEngine(new Engine(1.0, 162, 3000));
        hondaHatchbackBuilder.buildSeats(4);
        hondaHatchbackBuilder.buildTransmission(Transmission.SEMI_AUTOMATIC);
        hondaHatchbackBuilder.buildTripComputer(new TripComputer());

        Car myCar = hondaHatchbackBuilder.getResult();
        
        System.out.println(myCar);
    }

    @Test
    public void testCreatingSUVCar(){
        CarFactory hondaFactory = new HondaFactory();
        CarBuilder hondaSUVBuilder = hondaFactory.createSUVBuilder();

        hondaSUVBuilder.buildModel("2024 HR-V");
        hondaSUVBuilder.buildColor("Blue");
        hondaSUVBuilder.buildEngine(new Engine(3.5, 200, 6000));
        hondaSUVBuilder.buildSeats(4);
        hondaSUVBuilder.buildTransmission(Transmission.SEMI_AUTOMATIC);
        hondaSUVBuilder.buildTripComputer(new TripComputer());

        Car myCar = hondaSUVBuilder.getResult();
        
        System.out.println(myCar);
    }
    @Test
    public void testDrivingCar(){
        CarFactory toyotaCarFactory = new ToyotaFactory();
        CarBuilder toyotaSUVBuilder = toyotaCarFactory.createSUVBuilder();

        Director director = new Director();
        director.constructToyotaSUV(toyotaSUVBuilder);

        Car mySUV = toyotaSUVBuilder.getResult();

        System.out.println(mySUV);

        mySUV.start();
        mySUV.speedUp();
        mySUV.turnRight();
        mySUV.applyBrakes();

    }
    @Test
    public void testDecoratingCar(){
        CarFactory toyotaCarFactory = new ToyotaFactory();
        CarBuilder toyotaSUVBuilder = toyotaCarFactory.createSUVBuilder();

        Director director = new Director();
        director.constructToyotaSUV(toyotaSUVBuilder);

        Car mySUV = toyotaSUVBuilder.getResult();
        mySUV = new AutonomousDrivingDecorator(mySUV);
        mySUV = new SafetyFeatureDecorator(mySUV);
        
        System.out.println(mySUV);

        mySUV.start();
        mySUV.applyBrakes();
        
    }
    @Test
    public void testCarPricing(){
        CarFactory toyotaCarFactory = new ToyotaFactory();
        CarBuilder toyotaSUVBuilder = toyotaCarFactory.createSUVBuilder();

        Director director = new Director();
        director.constructToyotaSUV(toyotaSUVBuilder);

        toyotaSUVBuilder.setPricingStrategy(new StandardPricingStrategy());
        Car mySUV = toyotaSUVBuilder.getResult();
        mySUV = new SafetyFeatureDecorator(new AutonomousDrivingDecorator(mySUV));
        

        System.out.println("CAR PRICE IS: $"+mySUV.calculatePrice());
    }
}
