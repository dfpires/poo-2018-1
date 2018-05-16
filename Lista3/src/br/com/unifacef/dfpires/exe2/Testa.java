package br.com.unifacef.dfpires.exe2;
public class Testa {
    public static void main(String[] args) {
        Passageiro pa1 = new Passageiro("Carlos", 10);
        Passageiro pa2 = new Passageiro("João", 12);
        Passageiro pa3 = new Passageiro("Roberto", 14);
        Passageiro pa4 = new Passageiro("Pedro", 16);
        
        Onibus on1 = new Onibus();
        on1.setNumero("23-x");
        on1.adicionaPassageiro(pa1);
        on1.adicionaPassageiro(pa2);
        
        Onibus on2 = new Onibus();
        on2.setNumero("32-y");
        on2.adicionaPassageiro(pa3);
        on2.adicionaPassageiro(pa4);
        
        Rodoviaria r = new Rodoviaria();
        r.setNome("Rodo de Franca city");
        r.setCidade("Franca");
        r.adicionaOnibus(on1);
        r.adicionaOnibus(on2);
        
        Passageiro pa5 = new Passageiro("Adalberto", 24);
        Passageiro pa6 = new Passageiro("Thales", 43);
        Onibus on3 = new Onibus();
        on3.setNumero("009");
        r.adicionaPassageiro(pa5, on1);
        r.adicionaPassageiro(pa6, on3);
        System.out.println(r.toString());
        
   /*     if (!on1.removePassageiro(pa2)){
            System.out.println("Remoção inválida");
        }
        Passageiro pa5 = new Passageiro("Martos", 20);
        if (!on1.removePassageiro(pa5)){
            System.out.println("Remoção inválida");
        }
        System.out.println(on1.toString());
        
        on1.atualizaPassageiro(pa3, pa5);
        System.out.println(on1.toString()); */
        
    }
    
}
