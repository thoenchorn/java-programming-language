package modernjava;

/**
 * Module 13: sealed hierarchies and pattern matching for switch (Java 21).
 */
public class SealedShapeDemo {

    sealed interface Shape permits Circle, Square {
        double area();
    }

    record Circle(double radius) implements Shape {
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    record Square(double side) implements Shape {
        public double area() {
            return side * side;
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = { new Circle(2), new Square(3) };

        for (Shape shape : shapes) {
            String description = switch (shape) {
                case Circle circle -> "Circle with radius " + circle.radius();
                case Square square -> "Square with side " + square.side();
            };
            System.out.printf("%s -> area %.2f%n", description, shape.area());
        }
    }
}
