package polymorphism;

/**
 * Triangle class - demonstrates method overriding (Runtime Polymorphism)
 */
public class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, double base, double height, double side1, double side2, double side3) {
        super("Triangle", color);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Overriding abstract method from Shape
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Overriding abstract method from Shape
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    // Overriding concrete method from Shape
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Sides: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("-------------------");
    }
}
