public interface RecurringBillable {

    void setupRecurringBilling(int intervalDays);

    void cancelRecurringBilling();
}