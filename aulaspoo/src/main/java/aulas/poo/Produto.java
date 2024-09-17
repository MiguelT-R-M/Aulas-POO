package aulas.poo;

public class Produto {

    public double pre;
    public String pag;
    
    public void valorFinal(){

        double VF = pre;

        // 0 = dinheiro ou pix
        // 1 = cartão a vista
        // 2 = cartão 2x
        // 3 = cartão 3x

        switch(pag){
            case("0"):
                VF = pre*0.85;
                System.out.println("O valor final é " + VF);
                break;

            case("1"):

                VF = pre*0.9;
                System.out.println("O valor final é " + VF);
                break;

            case("2"):

                VF = pre;
                System.out.println("O valor final é " + VF);
                break;


            case("3"):

                VF = pre*1.1;
                System.out.println("O valor final é " + VF);
                break;

            default:

                System.out.println("Tipo de pagamento inexistente");
                Main.valorLoop();

        }

    }

}
