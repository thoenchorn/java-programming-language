package fundamentals;

/**
 * Module 01: variables, constants, and the eight primitive types.
 */
public class DataTypes {

    public static void main(String[] args) {
        byte smallNumber = 100;
        short shortNumber = 30_000;
        int age = 20;
        long population = 8_100_000_000L;
        float temperature = 36.5f;
        double salary = 750.50;
        char grade = 'A';
        boolean isStudent = true;

        // A final variable cannot be reassigned.
        final double PI = Math.PI;

        System.out.println("byte:      " + smallNumber);
        System.out.println("short:     " + shortNumber);
        System.out.println("int:       " + age);
        System.out.println("long:      " + population);
        System.out.println("float:     " + temperature);
        System.out.println("double:    " + salary);
        System.out.println("char:      " + grade);
        System.out.println("boolean:   " + isStudent);
        System.out.println("constant:  " + PI);

        // Non-primitive types store a reference to an object.
        String name = "Thoen";
        int[] scores = { 90, 85, 100 };

        System.out.println("String:    " + name);
        System.out.println("array:     " + scores.length + " scores");
    }
}
