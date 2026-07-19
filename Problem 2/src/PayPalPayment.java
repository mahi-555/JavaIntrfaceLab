public class PayPalPayment extends Payment
        implements Refundable, RecurringBillable {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        if (authorize(amount)) {
            System.out.println("PayPal payment successful.");
        }
    }

    @Override
    public String generateReceipt() {
        return "PayPal Receipt\nTransaction ID: " + transactionId;
    }

    @Override
    public boolean refund(double amount) {
        System.out.println("Refunded $" + amount + " to PayPal.");
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
}