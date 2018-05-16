package br.com.unifacef.dfpires.exe2;
public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;
    // construtores
    public Produto(){
        this.id = 1;
        this.qtde = 0;
        this.descricao = "sem descrição";
        this.preco = 0;
    }
    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    
     public void vender(int x){
        this.qtde = this.qtde - x;
    }
     
      public void subir(float x){
        this.preco = this.preco + x;
    }
    
     public void descer(float x){
        this.preco = this.preco - x;
    }
     
    public String mostra(){
        return "Id " + this.id + "Descrição " + this.descricao + 
                "Preço " + this.preco + "Qtde " + this.qtde;
    } 
}
