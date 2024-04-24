package polimorphismque9;
/* Write a Java program to create a base class Animal with methods move() and
makeSound(). Create two subclasses Bird and Panther. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal. */

public class Bird_9 extends Animal_9 {
    public void move(){
        System.out.println("Birds flies");
    }
    public void makeSound(){
        System.out.println("Bird chirps");
    }
    public static void main(String[] args) {
        Bird_9 b = new Bird_9();
        b.move();
        b.makeSound();
    }
}
