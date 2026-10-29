package oop;

/**
 * Module 06: inheritance with a parent reference and a child object.
 *
 * Run: ./scripts/run.sh oop.OopDemo
 */
public class OopDemo {

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "black", 2);

        System.out.println("--- Dog object ---");
        dog.displayInfo();
        dog.sound();
        dog.fetch();

        System.out.println("\n--- Polymorphic reference ---");
        Animal animal = dog;
        animal.sound(); // Dog.sound() runs at runtime
        animal.displayInfo();

        System.out.println("\n--- toString ---");
        System.out.println(animal);
    }
}
