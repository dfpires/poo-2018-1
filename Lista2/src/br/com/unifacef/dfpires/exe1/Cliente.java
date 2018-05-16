package br.com.unifacef.dfpires.exe1;
public class Cliente {
    // variáveis
    private String nroConta, nroAgencia, nome;
    private float saldo;
    // construtores
    public Cliente(){
        this.nroConta = "000000-0"; this.nroAgencia = "0000-0";
        this.nome = "sem nome"; this.saldo = 0;
    }
    public Cliente(String nroConta, String nroAgencia, String nome, float saldo){
        this.trataNroConta(nroConta); 
        this.trataNroAgencia(nroAgencia);
        this.trataNome(nome); 
        this.saldo = saldo;
    }
    private void trataNroConta(String nroConta){
        if ((nroConta.length() ==8) && (nroConta.charAt(6) == '-')){
            this.nroConta = nroConta;
        }
        else System.out.println("Nro de conta inválido");
    }
    public void setNroConta(String nroConta){
        this.trataNroConta(nroConta);
    }
    private void trataNroAgencia(String nroAgencia){
        if ((nroAgencia.length() == 6) && (nroAgencia.charAt(4) == '-')){
            this.nroAgencia = nroAgencia;
        }
        else System.out.println("Nro de agência inválido");
    }
    public void setNroAgencia(String nroAgencia){
        this.trataNroAgencia(nroAgencia);
    }
    private void trataNome(String nome){
        if (nome.length() <= 30 ) {
            this.nome = nome;
        }
        else System.out.println("Nome inválido");
    }
    public void setNome(String nome){
        this.trataNome(nome);
    }
     public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public String getNroConta(){
        return this.nroConta;
    }
    public String getNroAgencia(){
        return this.nroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void deposita(float x){
        this.saldo += x;
    }
    public void sacar(float x){
        this.saldo -= x;
    }
    public String dadosCliente(){
        return this.nome + " " + this.nroAgencia + " " + this.nroConta + " " + this.saldo;
    }
}
