package dc.unifacef;
public class Papel extends Recurso{
    @Override
    public String quemSouEu(){
        return "Papel";
    }
    
    @Override
    public String compara(Recurso camaleao){
        switch(camaleao.quemSouEu()){ // polimorfismo
            case "Papel": return "Papel empata Papel";
            case "Pedra": return "Papel ganha Pedra";
            case "Tesoura": return "Papel perde Tesoura";
            default: return "Impossível comparar";
        }
    }
}
