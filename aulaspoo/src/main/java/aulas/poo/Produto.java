package aulas.poo;

public class Produto {

    public double pre;
    public String pag;
    
    public double valorFinal(){

        double VF = pre;

        // 0 = dinheiro ou pix
        // 1 = cartão a vista
        // 2 = cartão 2x
        // 3 = cartão 3x

        if(pag.equals("0")){

            VF = pre*0.85;
            return VF;

        }
        if(pag.equals("1")){

            VF = pre*0.9;
            return VF;

        }
        if(pag.equals("2")){

            VF = pre;
            return VF;

        }
        if(pag.equals("3")){

            VF = pre*1.1;
            return VF;

        }
        else{

            System.out.println("Tipo de pagamento inexistente");

        }

        return VF;

    }

}
