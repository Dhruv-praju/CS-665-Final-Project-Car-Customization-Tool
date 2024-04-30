package edu.bu.met.cs665.project.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator(){
        this.route = "270 Babcock St, MA, 02215";
    }
    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }
}
