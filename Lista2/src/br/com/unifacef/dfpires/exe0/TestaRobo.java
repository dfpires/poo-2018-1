
package br.com.unifacef.dfpires.exe0;


public class TestaRobo {

       public static void main(String[] args) {
        Robo obj1 = new Robo();
        obj1.setMovimento("parado");
        obj1.setVelocidade(0);
        
        obj1.setVelocidade(7);
        obj1.setMovimento("diagonal");
        
        System.out.println("Obj1: Movimento " + obj1.getMovimento() + 
                " Velocidade " + obj1.getVelocidade());
        
        Robo obj2 = new Robo("diagonal", 10);
       
    }
    
}
