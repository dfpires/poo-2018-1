package br.com.unifacef.dfpires.exe2;
import java.util.ArrayList;
public class Rodoviaria {
    private String nome, cidade;
    private ArrayList<Onibus> onibus;

    public Rodoviaria() {
        this.onibus = new ArrayList();
    }

    public Rodoviaria(String nome, String cidade, ArrayList<Onibus> onibus) {
        this.nome = nome;
        this.cidade = cidade;
        this.onibus = onibus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Onibus> getOnibus() {
        return onibus;
    }

    public void setOnibus(ArrayList<Onibus> onibus) {
        this.onibus = onibus;
    }

    @Override
    public String toString() {
        return "Rodoviaria{" + "nome=" + nome + ", cidade=" + cidade + ", onibus=" + onibus + '}';
    }
    
     // adiciona
    public boolean adicionaOnibus(Onibus onibus){
        return this.onibus.add(onibus);
    }
    public boolean removeOnibus(Onibus onibus){
        return this.onibus.remove(onibus);
    }
    public boolean buscaOnibus(Onibus onibus){
        return this.onibus.contains(onibus);
    }
    public boolean atualizaOnibus(Onibus atual, Onibus novo){
        if (this.buscaOnibus(atual) == true){
            int posicao = this.onibus.indexOf(atual);
            this.onibus.set(posicao, novo);
            return true;
        }
        else return false;
    }
    public void adicionaPassageiro(Passageiro passageiro, Onibus onibus){
        if (!this.buscaOnibus(onibus)){
                this.adicionaOnibus(onibus);
        }
        onibus.adicionaPassageiro(passageiro);
    }
}
