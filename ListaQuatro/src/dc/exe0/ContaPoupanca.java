package dc.exe0;
public class ContaPoupanca extends ContaCorrente{
    private float txRendimento;
    public ContaPoupanca() {
        super();
        this.txRendimento = 0;
    }
    public ContaPoupanca(float txRendimento, String numero, float saldo) {
        super(numero, saldo);
        this.txRendimento = txRendimento;
    }
    public float getTxRendimento() {
        return txRendimento;
    }
    public void setTxRendimento(float txRendimento) {
        this.txRendimento = txRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" + "txRendimento=" + txRendimento + 
                super.toString() + '}';
    }
    
}
