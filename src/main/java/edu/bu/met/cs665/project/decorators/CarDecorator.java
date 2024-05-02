package edu.bu.met.cs665.project.decorators;
import edu.bu.met.cs665.project.car.*;

public abstract class CarDecorator extends Car{
    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }
    public abstract double calculatePrice();
    @Override
    public String toString() {    
        return car.toString();
    }
}
