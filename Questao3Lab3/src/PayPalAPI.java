
public class PayPalAPI {
	public void sendPayment(double amount) {
        System.out.println("Processo de pagamento de $" + amount + " através da PayPal.");
    }

    public void reversePayment(String transactionId) {
        System.out.println("Reembolsando pagamento do PayPal com transação ID: " + transactionId);
    }

    public String retrieveTransactionDetails(String transactionId) {
        return "Detalhes da transação PayPal: " + transactionId;
    }
}
