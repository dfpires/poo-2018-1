
public class Testa {

    public static void main(String[] args) {

        Batedeira b1 = new Batedeira(1, 20);
        b1.desligar();
        
        b1.aumentaVel(4);
        
        Batedeira.marca = "Wallita";
        
        System.out.println(b1.toString());
    
        Batedeira b2 = new Batedeira(1, 10);
        
        Batedeira b3 = Batedeira.menor(b1, b2);
        
    }
    
}
