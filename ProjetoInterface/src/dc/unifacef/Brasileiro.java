package dc.unifacef;
public class Brasileiro extends Pessoa implements Cidadao, Contribuinte {
    private String rg;
    public Brasileiro(String rg, int idade) {
        super(idade);
        this.rg = rg;
    }
    public Brasileiro() {
        super();
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    @Override
    public String tiraIdentidade() {
        return "Brasileiro tirando identidade " + this.rg;
    }
    @Override
    public String vota() {
        if (this.idade >= 16){
            return "Brasileiro votando ";
        }
        else return "Não pode votar";
    }
    @Override
    public String pagaIr() {
        return "Brasileiro pagando IR";
    }
    @Override
    public String declaraIr() {
        return "Brasileiro declarando IR";
    }
    @Override
    public String toString() {
        return "Brasileiro{" + "rg=" + rg + super.toString() + '}';
    }
}
