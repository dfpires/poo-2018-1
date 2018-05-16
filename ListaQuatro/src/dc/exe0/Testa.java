package dc.exe0;
public class Testa {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente("99187-x", 200);
        
        ContaEspecial ce = new ContaEspecial(400, "6969-2", 1000);
        
        ContaPoupanca cp = new ContaPoupanca(0.6f, "65564-4", 4000);
        
        System.out.println(cc.toString());
        
        System.out.println(ce.toString());
        
        System.out.println(cp.toString());
        
    }
    
}
