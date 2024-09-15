
public class Main {
	public static void main(String[] args) {
        // Criando instâncias de aves
        Ave pato = new Pato();
        Ave patoDomestico = new PatoDomestico();
        Ave pavao = new Pavao();
        Ave pavaoAzul = new PavaoAzul();

        // Utilizando Adapter para o pavão
        Ave pavaoAdaptado = new AdapterPavao(new Pavao());

        // Testando as aves
        System.out.println("Comportamento do Pato:");
        pato.voar();
        pato.emitirSom();

        System.out.println("\nComportamento do Pato Doméstico:");
        patoDomestico.voar();
        patoDomestico.emitirSom();

        System.out.println("\nComportamento do Pavão:");
        pavao.voar();
        pavao.emitirSom();

        System.out.println("\nComportamento do Pavão Azul:");
        pavaoAzul.voar();
        pavaoAzul.emitirSom();

        System.out.println("\nComportamento do Pavão (adaptado para não voar):");
        pavaoAdaptado.voar();
        pavaoAdaptado.emitirSom();
    }
}
