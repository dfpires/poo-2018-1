
package dc.unifacef;


public class Pedra extends Recurso{
    @Override
    public String quemSouEu(){
        return "Pedra";
    }
    
    @Override
    public String compara(Recurso camaleao){
        switch(camaleao.quemSouEu()){ // polimorfismo
            case "Papel": return "Pedra perde Papel";
            case "Pedra": return "Pedra empata Pedra";
            case "Tesoura": return "Pedra ganha Tesoura";
            default: return "Impossível comparar";
        }
    }
}
