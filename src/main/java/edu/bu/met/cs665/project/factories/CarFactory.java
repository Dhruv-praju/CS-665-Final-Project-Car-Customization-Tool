package edu.bu.met.cs665.project.factories;

import edu.bu.met.cs665.project.builders.SedanBuilder;

public interface CarFactory {
    // public void createHatchbackBuilder();
    public SedanBuilder createSedanBuilder();
    // public void createSUVBuilder();
}
