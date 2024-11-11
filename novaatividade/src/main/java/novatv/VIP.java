package novatv;

public class VIP extends Ingresso{

    private Double VA;

    public Double getVA() {
        return VA;
    }

    public void setVA(Double VA) {

        this.VA = VA;

    }

    public Double retornaValorVIP(){

        return(getV()+getVA());

    }

}
