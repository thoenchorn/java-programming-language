package methods;

/**
 * Module 03: recursion with a base case and a recursive case.
 */
public class RecursionDemo {

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("Fibonacci(10) = " + fibonacci(10));
        System.out.println("Sum of digits of 12345 = " + sumDigits(12345));
        System.out.println("2^10 = " + power(2, 10));
    }

    static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n <= 1) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive case
    }

    static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int sumDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + sumDigits(number / 10);
    }

    static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
}
