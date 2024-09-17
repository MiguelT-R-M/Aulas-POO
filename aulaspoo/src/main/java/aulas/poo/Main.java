package aulas.poo;

import java.util.*;

public class Main {

    public static Produto Inst = new Produto();
    public static Scanner input = new Scanner(System.in); 
    public static String SKY = "Blue";
    public static String LE = "";
    public static void main(String[] args) {

       valorLoop();        
       input.close(); 
        
    }
    public static void valorLoop(){

        // Os loops são feitos como classes, nesse caso a classe SKY. Se eu quebrar um loop, só um quebra, se eu mudar o SKY, todos da "classe" quebram em cadeia//
        while(SKY.equals("Blue")){
            
            System.out.println("");
            System.out.println("Informe o valor do produto: ");
            Inst.pre = input.nextDouble();

            System.out.println("");
            System.out.println("informe se o valor vai ser: ");
            System.out.println("0 - dinheiro ou pix(-15%)");
            System.out.println("1 - A vista no cartão(-10%)");
            System.out.println("2 - Parcelado duas vezes no cartão sem juros(0)");
            System.out.println("3 - Parcelado 3 vezes no cartão com juros(+10%)");
            Inst.pag = input.next();

            System.out.println("");
            System.out.println("O valor final é " + Inst.valorFinal());

            escolhaLoop();
            
        }

    }
    public static void escolhaLoop(){

        while(SKY.equals("Blue")){

            System.out.println("Existem mais produtos?");
            System.out.println("0 - sim");
            System.out.println("1 - não");
            LE = input.next();

            if(LE.equals("0")){

                System.out.println("");
                break;

            }
            else if(LE.equals("1")){

                SKY = "Red";
                            
            }
            else{

                System.out.println("Valor inválido");

            }            

        }

    }
}