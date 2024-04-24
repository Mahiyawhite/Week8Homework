package polimorphismque9;
/* Write a Java program to create a base class Animal with methods move() and
makeSound(). Create two subclasses Bird and Panther. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal. */

public class Panther extends Animal_9 {
    public void move(){
        System.out.println("Panther walk");
    }
    public void makeSound(){
        System.out.println("Panther roars");
    }

    public static void main(String[] args) {
        Panther p = new Panther();
        p.move();
        p.makeSound();
    }
}
