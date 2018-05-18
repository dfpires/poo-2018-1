package dc.exe0;
public class ContaCorrente {
    protected String numero;
    protected float saldo;
    public ContaCorrente() {
        this.numero = "não definido";
        this.saldo = 0;
    }
    public ContaCorrente(String numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "numero=" + numero + ", saldo=" + saldo + '}';
    }
    
        
}
