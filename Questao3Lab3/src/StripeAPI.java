
public class StripeAPI {
	public void charge(double amount) {
        System.out.println("Cobrando $" + amount + " via Stripe.");
    }

    public void refund(String transactionId) {
        System.out.println("Reembolsando transação Stripe com ID: " + transactionId);
    }

    public String getTransactionInfo(String transactionId) {
        return "Transação Stripe info: " + transactionId;
    }
}
