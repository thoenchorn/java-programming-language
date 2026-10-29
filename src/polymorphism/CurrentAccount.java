package polymorphism;

/**
 * CurrentAccount - subclass of BankAccount
 * Overrides calculateInterest() to indicate no interest
 */
public class CurrentAccount extends BankAccount {

    // Constructor
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Override calculateInterest() method
    @Override
    public void calculateInterest() {
        System.out.println("Current account has no interest");
    }

    // Override displayInfo to show account type
    @Override
    public void displayInfo() {
        System.out.println("Account Type: Current Account");
        super.displayInfo();
    }
}
