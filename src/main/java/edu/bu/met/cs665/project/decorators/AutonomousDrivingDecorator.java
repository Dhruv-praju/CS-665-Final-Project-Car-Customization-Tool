package edu.bu.met.cs665.project.decorators;

import edu.bu.met.cs665.project.car.Car;

public class AutonomousDrivingDecorator extends CarDecorator{
    private static final double AUTOMATION_PRICE = 2000.0;

    public AutonomousDrivingDecorator(Car car){
        super(car);
    }
    
    public void engageAutopilot(){
        System.out.println("Autopilot engaged. You don't need to do anything. I will take care of everything. Sit back & Enjoy the ride!");
    }
    @Override
    public void start(){
        // auto pilot activated after start
        this.car.start();
        engageAutopilot();
    }
    @Override
    public String toString() {
        return super.toString()+"Autonomous Driving"+"\n" ;
    }

    @Override
    public double calculatePrice() {
        return car.calculatePrice()+AUTOMATION_PRICE;
    }
}
