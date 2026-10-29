package polymorphism;

/**
 * Bird class - implements Animal interface
 */
public class Bird implements Animal {
    private String name;
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        this.name = name;
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating seeds");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping in a nest");
    }

    // Bird-specific method
    public void fly() {
        if (canFly) {
            System.out.println(name + " is flying high in the sky!");
        } else {
            System.out.println(name + " cannot fly (like a penguin)");
        }
    }

    public String getName() {
        return name;
    }

    public boolean canFly() {
        return canFly;
    }
}
