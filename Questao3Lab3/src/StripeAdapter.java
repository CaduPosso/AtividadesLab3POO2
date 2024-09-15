
public class StripeAdapter implements Payment {
	private StripeAPI stripeAPI;

    public StripeAdapter() {
        this.stripeAPI = new StripeAPI();
    }

    
    public void processPayment(double amount) {
        stripeAPI.charge(amount);
    }

  
    public void refundPayment(String transactionId) {
        stripeAPI.refund(transactionId);
    }

   
    public String getTransactionDetails(String transactionId) {
        return stripeAPI.getTransactionInfo(transactionId);
    }
}
