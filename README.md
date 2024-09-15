Questão 3 - Problema: Integração de Sistema de Pagamentos com Diversos Provedores
Uma empresa de comércio eletrônico está expandindo sua operação para diferentes países e precisa integrar diversos sistemas de pagamento (ex: PayPal, Stripe, Mercado Pago).
Cada provedor de pagamento tem sua própria interface e APIs para realizar operações como processar pagamentos, consultar transações e estornar valores.
O sistema principal da empresa já possui uma interface padrão de pagamentos que espera métodos como processPayment(), refundPayment(), e getTransactionDetails().
No entanto, os provedores de pagamento que precisam ser integrados possuem APIs diferentes, com estruturas próprias para realizar essas operações.
Para resolver esse problema de compatibilidade sem modificar o código existente do sistema de comércio eletrônico, o padrão Adapter pode ser utilizado para encapsular a
lógica de cada provedor de pagamento em adaptadores, tornando-os compatíveis com a interface esperada pelo sistema.
Utilizaremos o padrão Adapter para criar uma interface comum (Payment) que todos os provedores de pagamento devem seguir.
Em seguida, criaremos classes adaptadoras para cada provedor de pagamento específico que implementa essa interface, adaptando as chamadas da API para o formato esperado pelo
sistema principal.
