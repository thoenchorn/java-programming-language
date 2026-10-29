package interfaces;

public class InterfaceMain {
    public static void main(String[] args) {
        System.out.println("=== Multiple Interfaces in Java ===\n");

        // 1. Instantiating objects using their Concrete Class reference.
        // Because 'myDog' is of type Dog, it has access to methods from BOTH Animal and
        // Pet interfaces.
        Dog myDog = new Dog();
        System.out.println("--- Dog Behavior (Dog reference) ---");
        myDog.makeSound(); // From Animal
        myDog.eat(); // From Animal
        myDog.play(); // From Pet
        myDog.beFriendly(); // From Pet

        System.out.println("\n--- Cat Behavior (Cat reference) ---");
        Cat myCat = new Cat();
        myCat.makeSound(); // From Animal
        myCat.play(); // From Pet

        // 2. Demonstrating Polymorphism with Interface References
        System.out.println("\n--- Demonstrating Polymorphism with Interfaces ---");

        // Treating a Dog as an "Animal"
        Animal animalDog = myDog; // myDog is upcast to Animal
        System.out.println("Using Animal reference for Dog:");
        animalDog.makeSound(); // Works: Animal has this
        animalDog.eat(); // Works: Animal has this
        // animalDog.play(); // ERROR! The compiler only knows this is an 'Animal',
        // and Animals don't have a play() method according to the Animal interface.

        // Treating a Cat as a "Pet"
        Pet petCat = myCat; // myCat is upcast to Pet
        System.out.println("\nUsing Pet reference for Cat:");
        petCat.play(); // Works: Pet has this
        petCat.beFriendly(); // Works: Pet has this
        // petCat.makeSound(); // ERROR! The compiler only knows this is a 'Pet',
        // and Pets don't have a makeSound() method according to the Pet interface.

        // 3. You can still determine the actual object type using `instanceof`
        System.out.println("\nLet's check the hidden type of petCat:");
        if (petCat instanceof Animal) {
            System.out.println("petCat is also an Animal!");
            // We can safely cast it back to Animal to call makeSound
            ((Animal) petCat).makeSound();
        }
    }
}
