package novatv;


public class Ingresso {

    private Double V;

    public Double getV(){

        return(V);

    }

    public void setV(Double V){

        this.V = V;
        
    }
    
    
    public void imprimeValor(){

        System.out.println("o valor do ingresso normal é:" + "R$" + getV());;

    }

}
