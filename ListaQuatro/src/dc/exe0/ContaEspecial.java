package dc.exe0;
public class ContaEspecial extends ContaCorrente{
    private float limite;
    public ContaEspecial() {
        super(); // chama construtor
        this.limite = 0;
    }
    public ContaEspecial(float limite, String numero, float saldo) {
        super(numero, saldo);
        this.limite = limite;
    }
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    // ANULAÇÃO DE MÉTODO

    @Override
    public String toString() {
        return "ContaEspecial{" + "limite=" + limite + 
                super.toString() + '}';
    }
    
}
