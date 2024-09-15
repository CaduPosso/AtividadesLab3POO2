
public class PayPalAdapter implements Payment {
	private PayPalAPI paypalAPI;

    public PayPalAdapter() {
        this.paypalAPI = new PayPalAPI();
    }

    
    public void processPayment(double amount) {
        paypalAPI.sendPayment(amount);
    }

   
    public void refundPayment(String transactionId) {
        paypalAPI.reversePayment(transactionId);
    }

   
    public String getTransactionDetails(String transactionId) {
        return paypalAPI.retrieveTransactionDetails(transactionId);
    }
}
