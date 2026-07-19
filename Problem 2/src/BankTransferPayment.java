public class BankTransferPayment extends Payment {

    private String accountNumber;

    public BankTransferPayment(String accountNumber) {
        super();
        this.accountNumber = accountNumber;
    }

    @Override
    public void processPayment(double amount) {

        if (validateAccountDetails(accountNumber) && authorize(amount)) {
            System.out.println("Bank Transfer completed successfully.");
        }
    }

    @Override
    public String generateReceipt() {
        return "----- Bank Transfer Receipt -----\n"
                + "Transaction ID: " + transactionId;
    }
}