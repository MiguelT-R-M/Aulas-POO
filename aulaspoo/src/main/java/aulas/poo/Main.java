package aulas.poo;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        
        int[] A = {2, 3, -4, 5};
        System.out.println(Arrays.toString(A));
        System.out.println(retornaNegativo(A));

        
    }

    public static String retornaNegativo(int[] x){

        int[] AN = new int[x.length];

        for(int y = 0; y<x.length; y++){

            int NE = -(x[y]);
            AN[y] = NE;

        }

        return Arrays.toString(AN);

    }

}