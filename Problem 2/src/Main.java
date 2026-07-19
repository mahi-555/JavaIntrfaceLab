public class Main {

    public static void main(String[] args) {

        CreditCardPayment creditCard = new CreditCardPayment("1234567890");

        creditCard.processPayment(1500);
        System.out.println(creditCard.generateReceipt());
        System.out.println("Loyalty Points: " + creditCard.calculateLoyaltyPoints(1500));
        creditCard.refund(300);
        creditCard.setupRecurringBilling(30);
        creditCard.cancelRecurringBilling();

        System.out.println("\n-----------------------------\n");

        PayPalPayment paypal = new PayPalPayment("user@gmail.com");

        paypal.processPayment(800);
        System.out.println(paypal.generateReceipt());
        paypal.refund(200);
        paypal.setupRecurringBilling(30);
        paypal.cancelRecurringBilling();

        System.out.println("\n-----------------------------\n");

        BankTransferPayment bank = new BankTransferPayment("9876543210");

        bank.processPayment(2500);
        System.out.println(bank.generateReceipt());

        System.out.println("\n-----------------------------\n");

        CryptoPayment crypto = new CryptoPayment("0xABC123XYZ");

        crypto.processPayment(5000);
        System.out.println(crypto.generateReceipt());
    }
}