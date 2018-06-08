
package dc.unifacef;


public class Testa {

    
    public static void polimorficoContribuinte(Contribuinte camaleao){
        System.out.println(camaleao.declaraIr() + " \n " + camaleao.pagaIr());
    }
    
    public static void polimorficoCidadao(Cidadao camaleao){
        System.out.println(camaleao.tiraIdentidade() + " \n " + camaleao.vota());
    }
    
    public static void main(String[] args) {
        
        Americano jordan = new Americano("1234567", 41);
        
        Brasileiro pele = new Brasileiro("434343-5", 99);
        
        polimorficoContribuinte(jordan);
        polimorficoContribuinte(pele);
        
        polimorficoCidadao(jordan);
        polimorficoCidadao(pele);
        
        
    }
    
}
