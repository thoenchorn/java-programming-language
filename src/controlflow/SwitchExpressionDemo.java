package controlflow;

/**
 * Module 02: switch statements and Java 14+ switch expressions.
 */
public class SwitchExpressionDemo {

    public static void main(String[] args) {
        printDayType("MONDAY");
        printDayType("SATURDAY");
        printDayType("FUNDAY");

        for (int day = 1; day <= 7; day++) {
            System.out.println("Day " + day + " -> " + dayType(day));
        }

        String grade = "B";
        String result = switch (grade) {
            case "A", "B", "C" -> "Pass";
            case "D" -> "Conditional pass";
            default -> "Fail";
        };
        System.out.println("Grade " + grade + ": " + result);
    }

    private static void printDayType(String day) {
        switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" ->
                System.out.println(day + " is a weekday");
            case "SATURDAY", "SUNDAY" ->
                System.out.println(day + " is a weekend day");
            default ->
                System.out.println(day + " is not a valid day");
        }
    }

    private static String dayType(int day) {
        return switch (day) {
            case 6, 7 -> "Weekend";
            case 1, 2, 3, 4, 5 -> "Weekday";
            default -> "Invalid";
        };
    }
}
