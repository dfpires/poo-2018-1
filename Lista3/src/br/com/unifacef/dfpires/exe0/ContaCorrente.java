package br.com.unifacef.dfpires.exe0;
public class ContaCorrente {
    private String numero, nome, agencia;
    private float saldo;
    public ContaCorrente() {
    }
    public ContaCorrente(String numero, String nome, String agencia, float saldo) {
        this.numero = numero;
        this.nome = nome;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return "ContaCorrente{" + "numero=" + numero + ", nome=" + nome + 
                ", agencia=" + agencia + ", saldo=" + saldo + '}';
    }
    
}
