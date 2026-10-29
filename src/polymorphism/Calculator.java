package polymorphism;

/**
 * Calculator class - demonstrates Compile-time Polymorphism (Method
 * Overloading)
 * Method overloading: Same method name, different parameters
 */
public class Calculator {

    // Method 1: Add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers: " + a + " + " + b);
        return a + b;
    }

    // Method 2: Add three integers (overloaded - different number of parameters)
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers: " + a + " + " + b + " + " + c);
        return a + b + c;
    }

    // Method 3: Add two doubles (overloaded - different parameter types)
    public double add(double a, double b) {
        System.out.println("Adding two doubles: " + a + " + " + b);
        return a + b;
    }

    // Method 4: Add two strings (overloaded - different parameter types)
    public String add(String a, String b) {
        System.out.println("Concatenating two strings: " + a + " + " + b);
        return a + b;
    }

    // Method 5: Multiply two integers
    public int multiply(int a, int b) {
        System.out.println("Multiplying two integers: " + a + " * " + b);
        return a * b;
    }

    // Method 6: Multiply two doubles (overloaded)
    public double multiply(double a, double b) {
        System.out.println("Multiplying two doubles: " + a + " * " + b);
        return a * b;
    }

    // Method 7: Multiply three integers (overloaded)
    public int multiply(int a, int b, int c) {
        System.out.println("Multiplying three integers: " + a + " * " + b + " * " + c);
        return a * b * c;
    }
}
