package novaatividade2;

public class Main {

    private static Corrente C = new Corrente();
    private static CorrenteEsp CE = new CorrenteEsp();
    public static void main(String[] args) {
        
        System.out.println(C.getSaldo());
        C.depSaldo(1000);
        System.out.println(C.getSaldo());
        C.sacSaldo(100);
        System.out.println(C.getSaldo());
        System.out.println("");

        System.out.println(CE.getSaldo());
        CE.depSaldo(1000);
        System.out.println(CE.getSaldo());
        CE.sacSaldo(100);
        System.out.println(CE.getSaldo());

        
    }
}