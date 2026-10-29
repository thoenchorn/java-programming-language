package oop;

/**
 * Base class for the inheritance lesson.
 */
public class Animal {
    private String color;
    private int age;

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public void sound() {
        System.out.println("The animal makes a sound.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("=== Animal Information ===");
        System.out.println("Color: " + color);
        System.out.println("Age: " + age + " years");
        System.out.println("========================");
    }

    @Override
    public String toString() {
        return "Animal{color='" + color + "', age=" + age + "}";
    }
}
