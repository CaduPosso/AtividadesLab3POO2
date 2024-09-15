
public class CalculadoraBinaria {
	public String somar(String a, String b) {
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(numA + numB);
    }

    public String subtrair(String a, String b) {
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(numA - numB);
    }
}
