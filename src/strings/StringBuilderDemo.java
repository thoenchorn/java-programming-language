package strings;

/**
 * Module 05: StringBuilder avoids creating many intermediate String objects.
 */
public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Java")
                .append(" is")
                .append(" fun");
        System.out.println(builder);

        builder.insert(0, "Learning ");
        System.out.println(builder);

        builder.deleteCharAt(builder.length() - 1);
        System.out.println(builder);

        builder.reverse();
        System.out.println("Reversed: " + builder);

        System.out.println("'racecar' is a palindrome: " + isPalindrome("racecar"));
        System.out.println("'java' is a palindrome: " + isPalindrome("java"));
    }

    static boolean isPalindrome(String text) {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.contentEquals(new StringBuilder(cleaned).reverse());
    }
}
