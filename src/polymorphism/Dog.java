package polymorphism;

/**
 * Dog class - implements Animal interface
 */
public class Dog implements Animal {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping on the couch");
    }

    // Dog-specific method
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}
