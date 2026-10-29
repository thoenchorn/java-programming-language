package exceptions;

/**
 * Module 07: creating and throwing a custom checked exception.
 */
public class CustomExceptionDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        try {
            account.withdraw(150);
        } catch (InsufficientFundsException exception) {
            System.out.println("Transaction failed: " + exception.getMessage());
            System.out.println("Shortfall: $" + exception.getShortfall());
        }

        System.out.println("Balance: $" + account.getBalance());
    }

    static class InsufficientFundsException extends Exception {
        private static final long serialVersionUID = 1L;

        private final double shortfall;

        public InsufficientFundsException(double shortfall) {
            super("Insufficient funds, missing $" + shortfall);
            this.shortfall = shortfall;
        }

        public double getShortfall() {
            return shortfall;
        }
    }

    static class BankAccount {
        private double balance;

        BankAccount(double balance) {
            this.balance = balance;
        }

        void withdraw(double amount) throws InsufficientFundsException {
            if (amount > balance) {
                throw new InsufficientFundsException(amount - balance);
            }
            balance -= amount;
        }

        double getBalance() {
            return balance;
        }
    }
}
