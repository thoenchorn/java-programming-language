package exceptions;

/**
 * Module 07: checked vs unchecked exceptions and try/catch/finally.
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        divideSafely(10, 0);
        parseNumber("123");
        parseNumber("Java");

        System.out.println("Finally always runs:");
        try {
            System.out.println("Inside try");
        } finally {
            System.out.println("Inside finally");
        }
    }

    static void divideSafely(int dividend, int divisor) {
        try {
            int result = dividend / divisor;
            System.out.println(dividend + " / " + divisor + " = " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero: " + exception.getMessage());
        }
    }

    static void parseNumber(String text) {
        try {
            int value = Integer.parseInt(text);
            System.out.println("Parsed: " + value);
        } catch (NumberFormatException exception) {
            System.out.println("'" + text + "' is not a whole number");
        }
    }
}
