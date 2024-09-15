
public class CalculadoraAdapter implements CalculadoraDecimal{
	 private CalculadoraBinaria calculadoraBinaria;

	    public CalculadoraAdapter(CalculadoraBinaria calculadoraBinaria) {
	        this.calculadoraBinaria = calculadoraBinaria;
	    }
	    public int somar(int a, int b) {
	        // Converte os números decimais para binários, usa a calculadora binária e converte o resultado para decimal
	        String resultadoBinario = calculadoraBinaria.somar(Integer.toBinaryString(a), Integer.toBinaryString(b));
	        return Integer.parseInt(resultadoBinario, 2);
	    }
	    public int subtrair(int a, int b) {
	        String resultadoBinario = calculadoraBinaria.subtrair(Integer.toBinaryString(a), Integer.toBinaryString(b));
	        return Integer.parseInt(resultadoBinario, 2);
	    }
	    public int multiplicar(int a, int b) {
	        return a * b;
	    }
}
