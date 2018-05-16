package br.com.unifacef.dfpires.exe0;
public class Robo {
    private String movimento;
    private float velocidade;
    
    public Robo(){
        this.velocidade = 0;
        this.movimento = "parado";
    }
    public Robo(String movimento, float velocidade){
        this.trataVelocidade(velocidade);
        this.trataMovimento(movimento);
    }
    public String getMovimento(){
        return this.movimento; // retorn o valor da variável
    }
    public float getVelocidade(){
        return this.velocidade;
    }
    public void setMovimento(String movimento){
      trataMovimento(movimento);
    }
    private void trataMovimento(String movimento){
        switch(movimento){
            case "parado": 
                    this.movimento = movimento;
                    System.out.println("Movimento parado realizado"); 
                    break;
            case "direita": 
                    this.movimento = movimento; 
                    System.out.println("Movimento direita realizado"); 
                    break;
            case "esquerda": 
                    this.movimento = movimento; 
                    System.out.println("Movimento esquerda realizado"); 
                    break;
            case "cima": 
                    this.movimento = movimento; 
                    System.out.println("Movimento cima realizado"); 
                    break;
            case "baixo": 
                    this.movimento = movimento; 
                    System.out.println("Movimento baixo realizado"); 
                    break;
            default: System.out.println("Movimento inválido");   
        }
    }
    public void setVelocidade(float velocidade){
       trataVelocidade(velocidade);
    }
    private void trataVelocidade(float velocidade){
     if ((velocidade >= 0) && (velocidade <= 3)){
            this.velocidade = velocidade;
            System.out.println("Velocidade alterada para " + velocidade); 
        }
        else {
            System.out.println("Velocidade inválido"); 
        }
    }
}
