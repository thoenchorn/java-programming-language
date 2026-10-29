package payment;

public class PaymentApp {
    public static void main(String[] args) {
        // Create objects of all three payment types using polymorphism
        Payment p1 = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        Payment p2 = new PayPalPayment("john.doe@example.com");
        Payment p3 = new BankTransferPayment("9876543210");

        // Demonstrating polymorphic method calls
        System.out.println("--- Payment Operations ---");
        p1.pay(100);
        p2.pay(250);

        System.out.println("\n--- Refund Operations ---");
        p1.refund(20);
        p2.refund(50);
        p3.refund(50);

        System.out.println("\n--- Dynamic Method Calling ---");
        Payment[] payments = { p1, p2, p3 };
        for (Payment p : payments) {
            p.pay(50.0);
        }
    }
}
