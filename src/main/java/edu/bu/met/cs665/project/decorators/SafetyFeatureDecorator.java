package edu.bu.met.cs665.project.decorators;
import edu.bu.met.cs665.project.car.*;

public class SafetyFeatureDecorator extends CarDecorator{
    public SafetyFeatureDecorator(Car car){
        super(car);
    }
    @Override
    public void applyBrakes(){
         // Additional safety features activated by the decorator
        activateSafetyFeatures();
        this.car.applyBrakes();
    }
    public void activateSafetyFeatures() {
        System.out.println("Advanced safety features activated");
    }

    @Override
    public String toString() {
        return super.toString()+"Safety Features"+"\n";
    }

}
