
public interface Payment {
	void processPayment(double amount);
    void refundPayment(String transactionId);
    String getTransactionDetails(String transactionId);
}
