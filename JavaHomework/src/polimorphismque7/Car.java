package polimorphismque7;
/* Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently. */

public class Car extends Vehicle {
    public void SpeedUp(){
        Speed += 20;
        System.out.println("Car speed increase by: " + Speed);
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.SpeedUp();
    }
}
