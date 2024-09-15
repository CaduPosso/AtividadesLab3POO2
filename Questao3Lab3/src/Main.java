
public class Main {
	public static void main(String[] args) {
        Payment paypalProcessor = new PayPalAdapter();
        Payment stripeProcessor = new StripeAdapter();

        // Processando pagamentos
        paypalProcessor.processPayment(150.00);
        stripeProcessor.processPayment(250.00);

        // Estornando pagamentos
        paypalProcessor.refundPayment("TXN12345");
        stripeProcessor.refundPayment("TXN67890");

        // Obtendo detalhes de transações
        System.out.println(paypalProcessor.getTransactionDetails("TXN12345"));
        System.out.println(stripeProcessor.getTransactionDetails("TXN67890"));
    }
}
