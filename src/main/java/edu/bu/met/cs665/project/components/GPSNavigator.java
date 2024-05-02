/**
 * Name: Dhruv Prajapati
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/02/2024
 * File Name: GPSNavigator.java
 * Description: Represents a GPS navigator component of a car.
 */

 package edu.bu.met.cs665.project.components;

 /**
  * Represents a GPS navigator component of a car.
  */
 public class GPSNavigator implements Component {
     private String route;
 
     /**
      * Constructs a GPSNavigator with a default route.
      */
     public GPSNavigator() {
         this.route = "270 Babcock St, MA, 02215";
     }
 
     /**
      * Constructs a GPSNavigator with a specified manual route.
      *
      * @param manualRoute The manual route to set for the GPS navigator.
      */
     public GPSNavigator(String manualRoute) {
         this.route = manualRoute;
     }
 }
 