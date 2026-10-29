package fundamentals;

/**
 * Module 01: declaring variables and printing their values.
 *
 * Run: ./scripts/run.sh fundamentals.Variables
 */
public class Variables {

    public static void main(String[] args) {
        String name = "Thoen";
        int age = 20;
        double salary = 700.00;
        boolean isLearningJava = true;

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.printf("My salary is $%.2f%n", salary);
        System.out.println("Learning Java: " + isLearningJava);
    }
}
