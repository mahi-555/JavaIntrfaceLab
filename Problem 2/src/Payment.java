public abstract class Payment {

    private static int counter = 1000;
    protected String transactionId;

    public Payment() {
        transactionId = generateTransactionId();
    }

    // Shared Transaction ID Generator
    protected String generateTransactionId() {
        counter++;
        return "TXN-" + System.currentTimeMillis() + "-" + counter;
    }

    // Shared Validation Method
    protected boolean validateAccountDetails(String accountNumber) {

        if (accountNumber == null || accountNumber.length() < 8) {
            System.out.println("Invalid Account Number!");
            return false;
        }

        System.out.println("Account details verified.");
        return true;
    }

    // Common for all payment methods
    public boolean authorize(double amount) {

        if (amount <= 0) {
            System.out.println("Authorization Failed!");
            return false;
        }

        System.out.println("Payment Authorized.");
        return true;
    }

    // Must be implemented by subclasses
    public abstract void processPayment(double amount);

    public abstract String generateReceipt();
}