package fundamentals;

/**
 * Module 01: widening and narrowing conversions.
 */
public class TypeCasting {

    public static void main(String[] args) {
        // Widening is automatic because no data can be lost.
        int wholeNumber = 42;
        double asDouble = wholeNumber;
        System.out.println("int -> double: " + asDouble);

        // Narrowing requires an explicit cast and may lose data.
        double price = 19.99;
        int roundedDown = (int) price;
        System.out.println("double -> int: " + roundedDown);

        // char values can be used as numbers.
        char letter = 'A';
        int code = letter;
        char nextLetter = (char) (code + 1);
        System.out.println("'A' code = " + code + ", next letter = " + nextLetter);

        // Strings must be parsed; use a default when conversion fails.
        String input = "123";
        int parsed = Integer.parseInt(input);
        System.out.println("parsed + 1 = " + (parsed + 1));
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
    }
}
