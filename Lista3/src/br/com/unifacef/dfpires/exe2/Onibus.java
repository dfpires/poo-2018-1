package br.com.unifacef.dfpires.exe2;
import java.util.ArrayList;
public class Onibus {
    private String numero;
    private ArrayList<Passageiro> passageiros;
    public Onibus() {
        // aloca espaço na memória para o ArrayList
        this.passageiros = new ArrayList();
    }
    public Onibus(String numero, ArrayList<Passageiro> passageiros) {
        this.numero = numero;
        this.passageiros = passageiros;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }
    @Override
    public String toString() {
        return "Onibus{" + "numero=" + numero + ", passageiros=" + passageiros + '}';
    }
    // adiciona
    public boolean adicionaPassageiro(Passageiro passageiro){
        return this.passageiros.add(passageiro);
    }
    public boolean removePassageiro(Passageiro passageiro){
        return this.passageiros.remove(passageiro);
    }
    public boolean buscaPassageiro(Passageiro passageiro){
        return this.passageiros.contains(passageiro);
    }
   // public int buscaPassageiro(int poltrona){
   //     for(int i=0;i<this.passageiros.size();i++){
   //         if (this.passageiros.get(i).getPoltrona() == poltrona){
   //             return i;
  //          }
  //      }
  //      return -1; //não achou
  //  }
    public int buscaPassageiro(int poltrona){
        for(Passageiro p: this.passageiros){
            if (p.getPoltrona() == poltrona){
                return this.passageiros.indexOf(p);
            }
        }
        return -1; //não achou
    }
    public boolean atualizaPassageiro(Passageiro atual, Passageiro novo){
        if (this.buscaPassageiro(atual) == true){
            int posicao = this.passageiros.indexOf(atual);
            this.passageiros.set(posicao, novo);
            return true;
        }
        else return false;
    }
}
