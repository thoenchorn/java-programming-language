package interfaces;

/**
 * Cat class implements MULTIPLE interfaces: Animal and Pet.
 */
public class Cat implements Animal, Pet {
    // ----------------------------------------
    // Implementing methods from Animal interface
    // ----------------------------------------
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish.");
    }

    // ----------------------------------------
    // Implementing methods from Pet interface
    // ----------------------------------------
    @Override
    public void play() {
        System.out.println("Cat is chasing a laser pointer.");
    }

    @Override
    public void beFriendly() {
        System.out.println("Cat is purring and rubbing against your legs.");
    }
}
