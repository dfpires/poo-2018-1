package dc.unifacef;
public class Americano extends Pessoa implements Cidadao, Contribuinte{
    private String ssn;

    public Americano() {
        super();
    }

    public Americano(String ssn, int idade) {
        super(idade);
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
   
    @Override
    public String tiraIdentidade() {
         return "Americando tirando identidade " + this.ssn;
    }

    @Override
    public String vota() {
         if (this.idade >= 18){
            return "Americano votando ";
        }
        else return "Não pode votar";
    }

    @Override
    public String pagaIr() {
        return "Americano pagando IR";
    }

    @Override
    public String declaraIr() {
         return "Americano declarando IR"; 
    }

    @Override
    public String toString() {
        return "Americano{" + "ssn=" + ssn + super.toString() + '}';
    }
    
    
}
