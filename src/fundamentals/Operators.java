package fundamentals;

/**
 * Module 01: arithmetic, comparison, logical, and assignment operators.
 */
public class Operators {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a + b  = " + (a + b));
        System.out.println("a - b  = " + (a - b));
        System.out.println("a * b  = " + (a * b));
        System.out.println("a / b  = " + (a / b) + " (integer division)");
        System.out.println("a % b  = " + (a % b));
        System.out.println("a / 3.0 = " + (a / 3.0));

        System.out.println("a > b  : " + (a > b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a > 5 && b < 5 : " + (a > 5 && b < 5));
        System.out.println("a > 50 || b < 5 : " + (a > 50 || b < 5));
        System.out.println("!(a > b) : " + !(a > b));

        int counter = 0;
        counter += 5; // same as counter = counter + 5
        counter++;    // increment by 1
        System.out.println("counter = " + counter);
    }
}
