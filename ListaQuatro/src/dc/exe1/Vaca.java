package dc.exe1;
public class Vaca extends Mamifero{
    public Vaca(){
        super();
    }
    public Vaca(String nome){
        super(nome);
    }
    @Override
    public String fala(){
        return "Muuuuuu";
    }
}
