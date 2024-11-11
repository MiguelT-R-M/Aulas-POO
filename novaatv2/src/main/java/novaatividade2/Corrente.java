package novaatividade2;



public class Corrente {


    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depSaldo(double saldo){

        this.saldo = this.saldo + saldo;

    }
    
    public void sacSaldo(double saldo){

        saldo = saldo + (saldo/100)*0.5;
        this.saldo = this.saldo - saldo;
        

    }

}
