package quién.es.quién;
import java.util.Scanner;


public class QuiénEsQuién {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean bigote = false, sombrero = false, gafas = false, pelo = false;
        System.out.println("¿Tiene bigote?");
        bigote = entrada.nextBoolean();
        System.out.println("¿Tiene sombrero?");
        sombrero = entrada.nextBoolean();
        System.out.println("¿Lleva gafas?");
        gafas = entrada.nextBoolean();
        System.out.println("¿TIene pelo?");
        pelo = entrada.nextBoolean();
        
        if (sombrero && !gafas && bigote && pelo){
            System.out.println("Es Kerry"); 
        }     
        else if (bigote && gafas && pelo && !sombrero){
            System.out.println("Es Vegeta");
        }
        else if (gafas && pelo && !bigote && !sombrero){
            System.out.println("Es Pepe");
        }
        else if (!pelo && bigote && !sombrero && !gafas){
            System.out.println("Es Dani");
        }
        else if (!gafas && pelo && !sombrero && !bigote){
            System.out.println("Es Michael");
        }
        else {
            System.out.println("No cumple con ninguna descripción");
        }
        
    }
    
}
