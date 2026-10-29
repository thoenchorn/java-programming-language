package polymorphism;

/**
 * Circle class - demonstrates method overriding (Runtime Polymorphism)
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    // Overriding abstract method from Shape
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Overriding abstract method from Shape
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Overriding concrete method from Shape
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("-------------------");
    }

    public double getRadius() {
        return radius;
    }
}
