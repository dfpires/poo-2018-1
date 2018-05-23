package dc.exe4;
public class Produto {
    protected int volume, serial;
    protected String teste;
    public Produto(){
        this.volume = 0; this.serial = 0;
        this.teste = "não testado";
    }
    public Produto(int volume, int serial){
        this.volume = volume; this.serial = serial;
        this.teste = "não testado";
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getSerial() {
        return serial;
    }
    public void setSerial(int serial) {
        this.serial = serial;
    }
    public String getTeste() {
        return teste;
    }
    private void setTeste(String teste) {
        this.teste = teste;
    }
    @Override
    public String toString() {
        return "Produto{" + "volume=" + volume + ", serial=" + serial + ", teste=" + teste + '}';
    }
    
}
