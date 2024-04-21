package inheritanceque4;
/* Write a Java program to create a class called Animal with a method named move().
Create a subclass called Cheetah that overrides the move() method to run. */

public class Cheetah extends Animal {
    public void move(){
        System.out.println("The cheetah is a fastest animal");
    }

    public static void main(String[] args) {
        Cheetah ch = new Cheetah();
        ch.move();
    }
}
