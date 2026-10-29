package interfaces;

/**
 * Dog class implements MULTIPLE interfaces: Animal and Pet.
 * A class can implement as many interfaces as needed, separated by commas.
 * It must provide implementations for ALL methods from ALL implemented
 * interfaces.
 */
public class Dog implements Animal, Pet {
    // ----------------------------------------
    // Implementing methods from Animal interface
    // ----------------------------------------
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones.");
    }

    // ----------------------------------------
    // Implementing methods from Pet interface
    // ----------------------------------------
    @Override
    public void play() {
        System.out.println("Dog is fetching the ball.");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dog is wagging its tail.");
    }
}
