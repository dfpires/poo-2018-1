public class Batedeira {
    private int status; // 0 ou 1
    private int vel; // 0, 5, 10, 15, 20
    public static String marca;
    
    public Batedeira() {
        this.status = 0;
        this.vel = 0;
    }
    public Batedeira(int status, int vel) {
        this.trataStatus(status);
        this.trataVel(vel);
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.trataStatus(status);
    }
    public int getVel() {
        return vel;
    }
    public void setVel(int vel) {
        this.trataVel(vel);
    }
    private void trataStatus(int status) {
        switch(status){
            case 0: this.status = 0; break;
            case 1: this.status = 1; break;
            default: System.out.println("Status inválido"); break;    
        }
    }
    private void trataVel(int vel) {
        switch(vel){
            case 0: this.vel = 0; break;
            case 5: this.vel = 5; break;
            case 10: this.vel = 10; break;
            case 15: this.vel = 15; break;
            case 20: this.vel = 20; break;     
            default: System.out.println("velocidade inválido"); break;    
        }
    }
    public void desligar(){
        if (this.vel == 0){
            this.status = 0;
        }
        else System.out.println("Impossível desligar");    
    }
    public void aumentaVel(int x){
        this.trataVel(this.vel + x);
    }

    @Override
    public String toString() {
        return "Batedeira{" + "status=" + status + ", vel=" + vel + 
                "Marca " + Batedeira.marca + '}';
    }
    
    public static Batedeira menor(Batedeira x, Batedeira y){
        if (x.vel <= y.vel){
            return x;
        }
        else return y;
    }
    
}
