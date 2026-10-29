package polymorphism;

/**
 * Base class demonstrating Runtime Polymorphism
 * This is an abstract class that defines common behavior for all shapes
 */
public abstract class Shape {
    protected String color;
    protected String name;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Abstract method - must be implemented by subclasses
    public abstract double calculateArea();

    // Abstract method for perimeter
    public abstract double calculatePerimeter();

    // Concrete method - can be overridden but not required
    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    // Getter methods
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
