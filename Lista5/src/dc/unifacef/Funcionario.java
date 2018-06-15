package dc.unifacef;
public abstract class Funcionario {
    protected String nome, matricula;
    protected float salarioBase;
    public Funcionario() {

    }
    public Funcionario(String nome, String matricula, float salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public float getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", matricula=" + matricula + ", salarioBase=" + salarioBase + '}';
    }
    public abstract float calculaSalario();
}
