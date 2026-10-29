package polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 2: Banking System Demo
 * Demonstrates polymorphism with BankAccount hierarchy
 */
public class BankingSystemDemo {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   BANKING SYSTEM - POLYMORPHISM DEMO");
        System.out.println("========================================\n");

        // Create List<BankAccount> - polymorphic collection
        List<BankAccount> accounts = new ArrayList<>();

        // Add SavingsAccount
        SavingsAccount savings = new SavingsAccount("SA-001", 10000.00);
        accounts.add(savings);

        // Add CurrentAccount
        CurrentAccount current = new CurrentAccount("CA-001", 5000.00);
        accounts.add(current);

        // Display all accounts
        System.out.println("ACCOUNT INFORMATION:");
        System.out.println("========================================");
        for (BankAccount account : accounts) {
            account.displayInfo();
            System.out.println("----------------------------------------");
        }

        // Demonstrate deposit and withdraw
        System.out.println("\nTRANSACTION DEMONSTRATIONS:");
        System.out.println("========================================");

        System.out.println("\n1. Deposit $2000 to Savings Account:");
        savings.deposit(2000.00);

        System.out.println("\n2. Withdraw $1500 from Current Account:");
        current.withdraw(1500.00);

        System.out.println("\n3. Try to withdraw more than balance:");
        current.withdraw(10000.00);

        // Loop through accounts and call calculateInterest()
        System.out.println("\n\nINTEREST CALCULATION (Polymorphism in Action):");
        System.out.println("========================================");

        for (BankAccount account : accounts) {
            System.out.println("\nAccount: " + account.getAccountNumber());
            System.out.println("----------------------------------------");
            // Polymorphic method call - different behavior based on actual object type
            account.calculateInterest();
            System.out.println();
        }

        // Demonstrate polymorphism explicitly
        System.out.println("\nPOLYMORPHISM EXPLANATION:");
        System.out.println("========================================");
        System.out.println("Notice how we used:");
        System.out.println("  List<BankAccount> accounts = new ArrayList<>();");
        System.out.println("\nBoth SavingsAccount and CurrentAccount objects");
        System.out.println("are stored as BankAccount references.");
        System.out.println("\nWhen we call account.calculateInterest():");
        System.out.println("  - SavingsAccount calculates 5% interest");
        System.out.println("  - CurrentAccount shows no interest");
        System.out.println("\nThis is RUNTIME POLYMORPHISM!");
        System.out.println("The JVM determines which method to call");
        System.out.println("based on the actual object type at runtime.");
        System.out.println("========================================");
    }
}
