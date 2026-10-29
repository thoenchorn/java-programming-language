
package oop;

/**
 * A small class that calculates circle measurements.
 */
public class CircleCalculator {

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        CircleCalculator calculator = new CircleCalculator();

        System.out.printf("Circle radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", calculator.area(radius));
        System.out.printf("Circumference: %.2f%n", calculator.circumference(radius));
    }
}
