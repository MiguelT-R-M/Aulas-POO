package novatv;

public class CamaroteInferior extends VIP{

    private static String LOCCI = "A";

    public String getLOC(){

        return(LOCCI);

    }


    public void imprimeLOC(){

        System.out.println("A localização do camarote inferior é em: " + getLOC());

    }

    public void imprimeValorCI(){

        System.out.println("O valor do camarote inferior é " + "R$" + retornaValorVIP());

    }


}
