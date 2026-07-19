public class CreditCardPayment extends Payment
        implements Refundable, RecurringBillable, LoyaltyPointsEarner {

    private String accountNumber;

    public CreditCardPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void processPayment(double amount) {
        if (validateAccountDetails(accountNumber) && authorize(amount)) {
            System.out.println("Credit Card payment successful.");
        }
    }

    @Override
    public String generateReceipt() {
        return "Credit Card Receipt\nTransaction ID: " + transactionId;
    }

    @Override
    public boolean refund(double amount) {
        System.out.println("Refunded $" + amount + " to Credit Card.");
        return true;
    }

    @Override
    public void setupRecurringBilling(int intervalDays) {
        System.out.println("Recurring billing every " + intervalDays + " days.");
    }

    @Override
    public void cancelRecurringBilling() {
        System.out.println("Recurring billing cancelled.");
    }

    @Override
    public int calculateLoyaltyPoints(double amount) {
        return (int) (amount / 10);
    }
}