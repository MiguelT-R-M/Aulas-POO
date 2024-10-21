package javaextras;
import java.util.*;
@SuppressWarnings("unused")

public class Encapsulamento {


    public static void main(String[] args) {
        
        Aula a = new Aula();
        a.setNota_1(3);
        a.setNota_2(5);
        System.out.println(a.getNota_1());
        System.out.println(a.getNota_2());
        System.out.println(a.getMedia());
        

    }
}
