package arraybidimensional;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayBidimensional {


    public static void main(String[] args) {
        /*int array1[] = {1,5,2,5,3};
        int array2[] = new int[5];
        array2 = Arrays.copyOf(array1, 5);
        for (int i = 0; i < array2.length; i++){
            
        }
       */   
         Scanner entrada = new Scanner(System.in);
        int matriz1 [][] = new int [2][3];
        for (int fila = 0; fila < matriz1.length; fila++){
            for (int columna = 0; columna < matriz1[fila].length; columna++){
                System.out.println("Introduce los valores de la matriz por filas: ");
                matriz1[fila][columna] = entrada.nextInt();      
               
            }
            System.out.println(" ");
            
        }
        
     for (int fila = 0; fila < matriz1.length; fila++){
            for (int columna = 0; columna < matriz1[fila].length; columna++){
                System.out.print(matriz1[fila][columna]);    
            }
             System.out.println("");
     }
}
}
