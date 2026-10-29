package payment;

public class BankTransferPayment implements Payment {
    private String bankAccountNumber;

    public BankTransferPayment(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Processing Bank Transfer of $%.2f from account: %s%n", amount, bankAccountNumber);
    }

    @Override
    public void refund(double amount) {
        System.out.printf("Refunding $%.2f to Bank Account: %s%n", amount, bankAccountNumber);
    }
}
