package br.com.unifacef.dfpires.exe1;
public class TestaCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        obj1.setNroConta("345676-7");
        
        Cliente obj2 = new Cliente("43434343", "3423423423", "Yan", 1000) ;
        
        obj2.setNroConta("dfgdfgdf");
        
        obj2.getNroConta();
    
    }
    
}
