package br.com.unifacef.dfpires.exe0;
public class Testa {
    public static void main(String[] args) {
            ContaCorrente cc1 = new ContaCorrente("99197-9", "Jeferson Silva", "58-2", 800);
            
            CartaoDebito cd1 = new CartaoDebito(55556666, "12/23", "Jefin", "Cielo", 
            "socialmente", 300, cc1);
            
            cd1.getBandeira();
            cd1.getNome();
            cd1.getSaldo();
            cd1.getSenha();
            cd1.getValidade();
            cd1.getContaCorrente().getAgencia();
            cd1.getContaCorrente().getSaldo();

            cd1.getContaCorrente().setNome("Salomão");
            
    }
}
