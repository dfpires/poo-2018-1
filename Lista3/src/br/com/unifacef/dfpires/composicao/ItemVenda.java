package br.com.unifacef.dfpires.composicao;
public class ItemVenda {
    private int codigo;
    private float valor;
    private String descricao;
    private int qtde;

    public ItemVenda(int codigo, float valor, String descricao, int qtde) {
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
        this.qtde = qtde;
    }

    public ItemVenda() {
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ItemVenda{" + "codigo=" + codigo + ", valor=" + valor + ", descricao=" + descricao + 
                "qtde " + qtde + '}';
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
}
