
package dc.unifacef;

public class Assistente extends Funcionario{

    public Assistente() {
        super();
    }

    public Assistente(String nome, String matricula, float salarioBase) {
        super(nome, matricula, salarioBase);
    }
    
    @Override
    public float calculaSalario() {
        return this.salarioBase;
    }
    
}
