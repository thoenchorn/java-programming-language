package methods;

/**
 * Module 03: defining methods, parameters, return values, overloading, and varargs.
 */
public class MethodBasics {

    public static void main(String[] args) {
        System.out.println("Sum of 2 and 3: " + add(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + add(2.5, 3.5));
        System.out.println("Sum of 1, 2, 3, 4: " + add(1, 2, 3, 4));

        int value = 10;
        changeValue(value);
        System.out.println("After changeValue: " + value + " (primitives are passed by value)");

        MethodBasics demo = new MethodBasics();
        System.out.println("Square of 7: " + demo.square(7));

        printGreeting("Java learner");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    /** Varargs let a method accept any number of arguments. */
    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static void changeValue(int number) {
        number = 99; // only the local copy changes
    }

    int square(int number) {
        return number * number;
    }

    static void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
