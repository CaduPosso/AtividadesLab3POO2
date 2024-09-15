
public class Main {
	public static void main(String[] args) {
        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();

        CalculadoraDecimal calculadora = new CalculadoraAdapter(calculadoraBinaria);

        // Testando operações
        System.out.println("Operações com números decimais usando a calculadora adaptada:");
        System.out.println("Somar 5 + 3 = " + calculadora.somar(5, 3));
        System.out.println("Subtrair 10 - 4 = " + calculadora.subtrair(10, 4));
        System.out.println("Multiplicar 6 * 7 = " + calculadora.multiplicar(6, 7));
    }
}
