
package br.com.unifacef.dfpires.exe2;

public class TestaProduto {

   
    public static void main(String[] args) {
      Produto prod1 = new Produto();
      prod1.id = 10;
      prod1.descricao = "Sabão em Pó";
      prod1.preco = 6.50f;
      prod1.qtde = 3;
      
      prod1.comprar(2);
      prod1.vender(1);
      
      prod1.subir(1);
      prod1.descer(0.50f);
      Produto prod2 = new Produto(30, 5, "Bola de basquete", 55.0f);
      
      prod2.comprar(1);
      prod2.vender(1);
      
      prod2.subir(2);
      prod2.descer(0.50f);
      
      System.out.println("Conteúdo de obj1 " + prod1.mostra());
      System.out.println("Conteúdo de obj2 " + prod2.mostra());
      
    }
    
}
