package novatv;

public class Main {

    private static Normal N = new Normal();
    private static CamaroteInferior CI = new CamaroteInferior();
    private static CamaroteSuperior CS = new CamaroteSuperior();
    public static void main(String[] args) {

        N.setV(50.0);
        CI.setV(N.getV());
        CI.setVA(50.0);
        CS.setV(N.getV());
        CS.setVA(100.0);
        
        N.imprimeNormal();
        CI.imprimeLOC();
        CI.imprimeValorCI();
        CS.imprimeLOC();
        CS.imprimeValorCS();
    }
}