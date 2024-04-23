package inheritanceque5;
/* Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed. */

public class Vehicle {

    public void fuelefficiency(){
        System.out.println("How far your car can travel");
    }
    public void distancetraveled(){
        System.out.println("Distance measures the length between objects");
    }
    public void maximumspeed(){
        System.out.println("It can go very fast.");
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.fuelefficiency();
        vehicle.distancetraveled();
        vehicle.maximumspeed();

    }
}
