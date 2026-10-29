package strings;

/**
 * Module 05: String is immutable, so every operation returns a new String.
 */
public class StringDemo {

    public static void main(String[] args) {
        String text = "  Java Programming  ";

        System.out.println("Original: [" + text + "]");
        System.out.println("Trimmed: [" + text.trim() + "]");
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Substring: " + text.trim().substring(0, 4));
        System.out.println("Replace: " + text.replace("Java", "Kotlin"));
        System.out.println("Contains 'Program': " + text.contains("Program"));
        System.out.println("Starts with spaces: " + text.startsWith("  "));

        String[] words = text.trim().split(" ");
        System.out.println("Word count: " + words.length);
        for (String word : words) {
            System.out.println("  - " + word);
        }

        // == compares references; equals() compares content.
        String first = "Java";
        String second = new String("Java");
        System.out.println("first == second: " + (first == second));
        System.out.println("first.equals(second): " + first.equals(second));

        System.out.printf("Formatted: %-10s | %5.2f | %d%n", "score", 95.5, 42);
    }
}
