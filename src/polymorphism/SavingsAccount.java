package polymorphism;

/**
 * SavingsAccount - subclass of BankAccount
 * Overrides calculateInterest() to provide 5% interest
 */
public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.05; // 5% interest

    // Constructor
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Override calculateInterest() method
    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        System.out.println("Savings Account Interest Calculation:");
        System.out.println("Interest Rate: " + (INTEREST_RATE * 100) + "%");
        System.out.println("Current Balance: $" + balance);
        System.out.println("Interest Earned: $" + interest);
        System.out.println("Balance after interest: $" + (balance + interest));
    }

    // Override displayInfo to show account type
    @Override
    public void displayInfo() {
        System.out.println("Account Type: Savings Account");
        super.displayInfo();
    }
}
