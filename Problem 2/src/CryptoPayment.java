public class CryptoPayment extends Payment {

    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        super();
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment(double amount) {

        if (authorize(amount)) {
            System.out.println("Cryptocurrency payment processed successfully.");
        }
    }

    @Override
    public String generateReceipt() {
        return "----- Crypto Receipt -----\n"
                + "Transaction ID: " + transactionId;
    }
}