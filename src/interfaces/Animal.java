package interfaces;

/**
 * An Interface is like a contract.
 * Any class that implements this interface MUST provide the implementation
 * for all of its abstract methods.
 */
public interface Animal {
    // Variables in interfaces are implicitly public, static, and final (Constants)
    String TYPE = "Living Creature";

    // Methods in interfaces are implicitly public and abstract (before Java 8)
    void makeSound();

    void eat();
}
