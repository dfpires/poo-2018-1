package br.com.unifacef.comp.codigo;
public class Carro {
    // variáveis
    public float velAtual;
    public boolean statusMotor; // t - ligado e f - desligado
    // métodos
    // método construtor
    public Carro(){ // valores default
        this.velAtual = 0;
        this.statusMotor = false;
    }
    public Carro(float velAtual, boolean statusMotor){
        this.velAtual = velAtual;
        this.statusMotor = statusMotor;
    }
    // liga o carro
    // void - não retorna nada
    public void ligar(){
        this.statusMotor = true;
        this.velAtual = 0;
    }
    // desliga o carro
    // void - não retorna nada
    public void desligar(){
        this.statusMotor = false;
        this.velAtual = 0;
    }
    public void acelerar(float x){
        if (this.statusMotor){
            this.velAtual = this.velAtual + x;
        }
    }
    public void frear(float x){
        if (this.statusMotor){
            this.velAtual = this.velAtual - x;
        }
    }
    public String paraString(){
        String auxiliar;
        // operador ternário
        auxiliar = (this.statusMotor == true) ? "ligado" : "desligado";
        // if (this.statusMotor == true){
            //auxiliar = "ligado";
        //}
        // else {
        //    auxiliar = "desligado";
        //}
        return " Velocidade: " + this.velAtual + 
                " Status " + auxiliar;
    }
}
