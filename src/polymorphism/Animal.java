package polymorphism;

/**
 * Animal interface - demonstrates Interface-based Polymorphism
 * Interfaces define a contract that implementing classes must follow
 */
public interface Animal {
    // Abstract methods (implicitly public and abstract)
    void makeSound();

    void eat();

    void sleep();

    // Default method (Java 8+) - provides default implementation
    default void breathe() {
        System.out.println("Breathing...");
    }

    // Static method (Java 8+)
    static void displayInfo() {
        System.out.println("Animals are living organisms");
    }
}
