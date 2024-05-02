package edu.bu.met.cs665.project.director;


import edu.bu.met.cs665.project.builders.CarBuilder;
import edu.bu.met.cs665.project.components.*;
import edu.bu.met.cs665.project.factories.CarFactory;
import edu.bu.met.cs665.project.factories.ToyotaFactory;


public class Director {

    public void constructToyotaSUV(CarBuilder builder){

        builder.buildModel("Grand Highlander");
        builder.buildColor("Midnight Black");
        builder.buildEngine(new Engine(2.5, 260, 6000));
        builder.buildSeats(7);
        builder.buildTransmission(Transmission.MANUAL);
        builder.buildTripComputer(new TripComputer());
    }
}
