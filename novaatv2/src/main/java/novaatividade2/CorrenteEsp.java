package novaatividade2;

public class CorrenteEsp extends Corrente{

    
    @Override
    public void sacSaldo(double saldo) {
        
        saldo = saldo + (saldo/100)*0.1;
        setSaldo(getSaldo()- saldo);
        
    }



    
}
