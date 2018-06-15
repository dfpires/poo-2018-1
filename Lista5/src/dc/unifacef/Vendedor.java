package dc.unifacef;
public class Vendedor extends Funcionario{
    private float comissao;
    public Vendedor() {
        super();
    }
    public Vendedor(float comissao, String nome, 
            String matricula, float salarioBase) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    @Override
    public float calculaSalario() {
        return this.salarioBase + (this.salarioBase*this.comissao)/100;
    }
    @Override
    public String toString() {
        return "Vendedor{" + "comissao=" + comissao + 
                super.toString() + '}';
    }
}