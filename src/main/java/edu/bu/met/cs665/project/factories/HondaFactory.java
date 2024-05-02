package edu.bu.met.cs665.project.factories;

import edu.bu.met.cs665.project.builders.*;
import edu.bu.met.cs665.project.builders.honda.HondaHatchbackBuilder;
import edu.bu.met.cs665.project.builders.honda.HondaSUVBuilder;
import edu.bu.met.cs665.project.builders.honda.HondaSedanBuilder;

public class HondaFactory implements CarFactory{
    @Override
    public CarBuilder createSedanBuilder() {
        return new HondaSedanBuilder();
    }
    @Override
    public CarBuilder createHatchbackBuilder() {
        return new HondaHatchbackBuilder();
    }
    @Override
    public CarBuilder createSUVBuilder() {
        return new HondaSUVBuilder();
    }
}
