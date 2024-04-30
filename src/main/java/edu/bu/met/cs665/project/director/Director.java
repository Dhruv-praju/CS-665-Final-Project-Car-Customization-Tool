package edu.bu.met.cs665.project.director;


import edu.bu.met.cs665.project.builders.CarBuilder;
import edu.bu.met.cs665.project.components.*;


public class Director {
    CarBuilder builder;

    public Director(CarBuilder builder){
        this.builder = builder;
    }
    public void constructHondaSedan(CarBuilder builder){
        builder.buildCarType("Sedan");
        builder.buildModel("2024 Civic");
        builder.buildColor("Black");
        builder.buildEngine(new Engine(2.0, 12));
        builder.buildSeats(4);
        builder.buildTransmission(Transmission.SEMI_AUTOMATIC);
        builder.buildTripComputer(new TripComputer());
    }
}
