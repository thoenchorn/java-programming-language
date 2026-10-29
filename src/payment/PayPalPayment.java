package payment;

public class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Processing PayPal payment of $%.2f from account: %s%n", amount, email);
    }

    @Override
    public void refund(double amount) {
        System.out.printf("Refunding $%.2f to PayPal account: %s%n", amount, email);
    }
}
