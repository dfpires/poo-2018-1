package dc.exe1;
public class Cachorro extends Mamifero{
   private boolean lateMuito;
    public Cachorro() {
        super();
        this.lateMuito = false;
    }
    public Cachorro(boolean lateMuito, String nome) {
        super(nome);
        this.lateMuito = lateMuito;
    }
    public boolean isLateMuito() {
        return lateMuito;
    }
    public void setLateMuito(boolean lateMuito) {
        this.lateMuito = lateMuito;
    }
    @Override
    public String fala(){
        return (this.lateMuito) ? "AU, AU": "au, au"; // operador ternário
    }
    @Override
    public String toString() {
        return "Cachorro{" + "lateMuito=" + lateMuito + 
                super.toString() + '}';
    }
}
