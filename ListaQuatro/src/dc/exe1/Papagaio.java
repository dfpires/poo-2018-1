package dc.exe1;
public class Papagaio extends Passaro{
    private String vocabulario;
    public Papagaio(){
       super();
       this.vocabulario = "não definido";
    }
    public Papagaio(String nome, String vocabulario){
        super(nome);
        this.vocabulario = vocabulario;
    }
    public String getVocabulario() {
        return vocabulario;
    }
    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }
    @Override
    public String fala(){
        return this.vocabulario;
    }
    @Override
    public String toString() {
        return "Papagaio{" + "vocabulario=" + vocabulario + 
                super.toString() + '}';
    }
}
