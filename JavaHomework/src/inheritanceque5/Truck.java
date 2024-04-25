package inheritanceque5;
/* Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed. */
public class Truck extends Vehicle {
    @Override
    public void fuelefficiency() {
        System.out.println("My capacity is large");
    }
    public void distancetraveled(){
        System.out.println("Maintain 3 second gap");
    }
    public void maximumspeed(){
        System.out.println("I can go very fast");
    }
    public static void main(String[] args) {
        Truck t = new Truck();
        t.fuelefficiency();
        t.distancetraveled();
        t.maximumspeed();
    }
}
