package payment;

public class CreditCardPayment implements Payment {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Processing Credit Card payment of $%.2f for %s (%s)%n", amount, cardHolderName, maskCardNumber());
    }

    @Override
    public void refund(double amount) {
        System.out.printf("Refunding $%.2f to Credit Card %s%n", amount, maskCardNumber());
    }

    private String maskCardNumber() {
        if (cardNumber.length() > 4) {
            return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        }
        return cardNumber;
    }
}
