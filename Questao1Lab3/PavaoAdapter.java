
public class PavaoAdapter implements Ave{
	private Pavao pavao;

    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

   
    public void voar() {
        System.out.println("Adaptando para comportamento: este pavão não pode voar."); 
    }

   
    public void emitirSom() {
        pavao.emitirSom();
    }
}
