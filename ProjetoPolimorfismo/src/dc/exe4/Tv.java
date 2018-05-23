package dc.exe4;
public class Tv extends Produto{
    private int canal;
    public Tv() {
        super();
        this.canal = 0;
    }
    public Tv(int canal, int volume, int serial) {
        super(volume, serial);
        this.canal = canal;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Tv{" + "canal=" + canal + 
                super.toString() + '}';
    }
    
    
}
