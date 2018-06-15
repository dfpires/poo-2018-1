
package dc.unifacef;

public class Tesoura extends Recurso {
    @Override
    public String quemSouEu(){
        return "Tesoura";
    }
      @Override
    public String compara(Recurso camaleao){
        switch(camaleao.quemSouEu()){ // polimorfismo
            case "Papel": return "Tesoura ganha Papel";
            case "Pedra": return "Tesoura perde Pedra";
            case "Tesoura": return "Tesoura empata Tesoura";
            default: return "Impossível comparar";
        }
    }
}
 