package edu.bu.met.cs665.project.factories;

import edu.bu.met.cs665.project.builders.SedanBuilder;

public class HondaFactory implements CarFactory{
    @Override
    public SedanBuilder createSedanBuilder() {
        return new SedanBuilder();
    }
}
