package caixa.eletronico;

public class TesteConstrutor {

    public static void main(String[] args) {
        
        Conta c = new Conta();
        
        System.out.println("SALDO:  " + c.retornaSaldo());
        System.out.println("AGÊNCIA: " + c.getAgencia());
        System.out.println("ATIVA: " + c.isAtiva());
    }
    
}
