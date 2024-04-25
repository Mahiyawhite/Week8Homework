package polimorphismque6;
/* Write a Java program to create a base class Animal (Animal Family) with a method
called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
each subclass to make a specific sound for each animal. */

public class AnimalFamily {
    public void Sound(){
        System.out.println("Baa Baa Baa");
    }

    public static void main(String[] args) {
        AnimalFamily a = new AnimalFamily();
        a.Sound();
    }

}
