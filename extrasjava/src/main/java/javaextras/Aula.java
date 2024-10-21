package javaextras;
import java.util.*;
@SuppressWarnings("unused")

public class Aula {

    private double nota_1;
    private double nota_2;
    private double media;

    public double getNota_1() {
        return nota_1;
    }

    public void setNota_1(double nota_1) {
        this.nota_1 = nota_1;
    }

    public double getNota_2() {
        return nota_2;
    }

    public void setNota_2(double nota_2) {
        this.nota_2 = nota_2;
    }

    public double getMedia() {
        media = (getNota_1()+getNota_2())/2;
        return media;
    }

    public void setMedia(double media) {
        
    }

    
    
}
