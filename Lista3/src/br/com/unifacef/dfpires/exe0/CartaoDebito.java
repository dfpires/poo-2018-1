package br.com.unifacef.dfpires.exe0;
public class CartaoDebito {
    private int numero;
    private String validade, nome, bandeira, senha;
    private float saldo;
    private ContaCorrente contaCorrente; // associação

    public CartaoDebito() {
    }

    
    public CartaoDebito(int numero, String validade, String nome, String bandeira, 
            String senha, float saldo, ContaCorrente contaCorrente) {
        this.numero = numero;
        this.validade = validade;
        this.nome = nome;
        this.bandeira = bandeira;
        this.senha = senha;
        this.saldo = saldo;
        this.contaCorrente = contaCorrente; // agregação
    }
    
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getValidade() {
        return validade;
    }
    public void setValidade(String validade) {
        this.validade = validade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getBandeira() {
        return bandeira;
    }
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    @Override
    public String toString() {
        return "CartaoDebito{" + "numero=" + numero + ", validade=" + validade + ", nome=" + nome + ", bandeira=" + bandeira + ", senha=" + senha + ", saldo=" + saldo + ", contaCorrente=" + contaCorrente + '}';
    }
    
}
