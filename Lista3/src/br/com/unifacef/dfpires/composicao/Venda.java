package br.com.unifacef.dfpires.composicao;
import java.util.ArrayList;
public class Venda {
    private float total;
    private String data;
    private ArrayList<ItemVenda> itens;
    public Venda(float total, String data) {
        this.total = total;
        this.data = data;
    }
    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public ArrayList<ItemVenda> getItens() {
        return itens;
    }
    @Override
    public String toString() {
        return "Venda{" + "total=" + total + ", data=" + data + ", itens=" + itens + '}';
    }
    public void adicionaItemVenda(int codigo, float valor, String descricao, int qtde){
        this.itens.add(new ItemVenda(codigo, valor, descricao, qtde));
    }
}
