package novatv;

public class CamaroteSuperior extends VIP{

    private static String LOCCS = "B";

    public String getLOC(){

        return(LOCCS);

    }


    public void imprimeLOC(){

        System.out.println("A localização do camarote superior é em: " + getLOC());

    }

    public void imprimeValorCS(){

        System.out.println("O valor do camarote Superior é " + "R$" + retornaValorVIP());

    }

}
