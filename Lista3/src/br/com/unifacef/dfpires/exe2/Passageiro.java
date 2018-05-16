package br.com.unifacef.dfpires.exe2;
public class Passageiro {
    private String nome;
    private int poltrona;

    public Passageiro() {
    }

    public Passageiro(String nome, int poltrona) {
        this.nome = nome;
        this.poltrona = poltrona;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    @Override
    public String toString() {
        return "\n Passageiro{" + "nome=" + nome + ", poltrona=" + poltrona + '}';
    }
    
}
