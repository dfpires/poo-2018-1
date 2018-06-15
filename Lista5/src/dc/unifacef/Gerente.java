package dc.unifacef;
public class Gerente extends Funcionario{
    public Gerente() {
        super();
    }
    public Gerente(String nome, String matricula, float salarioBase) {
        super(nome, matricula, salarioBase);
    }
    @Override
    public float calculaSalario() {
        return 2 * this.salarioBase;
    }
}
