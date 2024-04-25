package inheritanceque5;
/* Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed. */

public class Vehicle {
    public String make;
    public String model;
    public int year;
    public String fuletype;
    public Vehicle (){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuletype = fuletype;
    }

    public void fuelefficiency(){
        System.out.println("How far your car can travel");
    }
    public void distancetraveled(){
        System.out.println("Distance measures the length between objects");
    }
    public void maximumspeed(){
        System.out.println("how fast it can go.");
    }
}
