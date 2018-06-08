package dc.unifacef;
public class Pessoa {
    protected int idade;
    public Pessoa() {
    }
    public Pessoa(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Pessoa{" + "idade=" + idade + '}';
    }
}
