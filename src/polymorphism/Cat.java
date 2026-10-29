package polymorphism;

/**
 * Cat class - implements Animal interface
 */
public class Cat implements Animal {
    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating fish");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping in a sunny spot");
    }

    // Cat-specific method
    public void scratch() {
        System.out.println(name + " is scratching the furniture!");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
