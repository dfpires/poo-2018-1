package br.com.unifacef.comp.codigo;
import javax.swing.JOptionPane;
public class TestaCarro {
    public static void main(String[] args) {
       Carro obj1 = new Carro();
       Carro obj2 = new Carro();
       Carro obj3 = new Carro();
       
       Carro obj4 = new Carro();
       
       Carro obj5 = new Carro(50, true);
       
        obj5.velAtual = 300;
        
        obj5.velAtual = -50;
        
       // liga o carro obj1 e acelera de 30
       obj1.ligar();
       float a = Float.parseFloat(JOptionPane.showInputDialog("Quanto vai acelerar?"));
       obj1.acelerar(a);
        // liga o carro obj2 e acelera de 30
       obj2.ligar();
       obj2.acelerar(100);
        // liga o carro obj3 e acelera de 60
       obj3.ligar();
       obj3.acelerar(60);
       
       JOptionPane.showMessageDialog(null, "Obj1 " + obj1.paraString());
       JOptionPane.showMessageDialog(null, "Obj2 " + obj2.paraString());
       JOptionPane.showMessageDialog(null, "Obj3 " + obj3.paraString());
    }

}
