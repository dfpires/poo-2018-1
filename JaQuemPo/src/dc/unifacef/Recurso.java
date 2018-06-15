package dc.unifacef;
public abstract class Recurso {
    public String quemSouEu(){
        return "Recurso";
    }
    public abstract String compara(Recurso recurso);
}
