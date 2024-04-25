package inheritanceque5;
/* Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed. */

public class Motorcycle extends Vehicle {
    public void fuelefficiency() {
        System.out.println("My capacity is small");
    }
public void distancetraveled(){
    System.out.println("Maintain 1 second gap");
}
    public void maximumspeed(){
        System.out.println("I can go slow");
    }
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        m.fuelefficiency();
        m.distancetraveled();
        m.maximumspeed();
    }
}
