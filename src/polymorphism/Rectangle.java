package polymorphism;

/**
 * Rectangle class - demonstrates method overriding (Runtime Polymorphism)
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super("Rectangle", color);
        this.width = width;
        this.height = height;
    }

    // Overriding abstract method from Shape
    @Override
    public double calculateArea() {
        return width * height;
    }

    // Overriding abstract method from Shape
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Overriding concrete method from Shape
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("-------------------");
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
