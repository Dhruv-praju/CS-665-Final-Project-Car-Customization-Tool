package edu.bu.met.cs665.project.factories;

import edu.bu.met.cs665.project.builders.CarBuilder;
import edu.bu.met.cs665.project.builders.toyota.*;

public class ToyotaFactory implements CarFactory{
     @Override
    public CarBuilder createSedanBuilder() {
        return new ToyotaSedanBuilder();
    }
    @Override
    public CarBuilder createHatchbackBuilder() {
        return new ToyotaHatchbackBuilder();
    }
    @Override
    public CarBuilder createSUVBuilder() {
        return new ToyotaSUVBuilder();
    }
}
