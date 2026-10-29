package oop;

/**
 * Dog inherits state and behavior from Animal and adds its own.
 */
public class Dog extends Animal {
    private String name;

    public Dog(String name, String color, int age) {
        super(color, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Dog Information ===");
        System.out.println("Name: " + name);
        System.out.println("Color: " + getColor());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("======================");
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', color='" + getColor() + "', age=" + getAge() + "}";
    }
}
