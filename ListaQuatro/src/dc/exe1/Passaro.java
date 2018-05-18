package dc.exe1;
public class Passaro extends Animal{
    public Passaro(){
        super(); // chama método construtor sem parâmetro da superclasse
    }
    public Passaro(String nome){
        super(nome); // chama método construtor com parâmetro da superclasse
    }
    // anulação do método herdado da superclasse
    @Override
    public String fala(){
        return "piu, piu";
    }
}
