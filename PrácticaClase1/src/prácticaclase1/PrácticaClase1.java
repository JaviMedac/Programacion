package prácticaclase1;
import java.util.Scanner;
// Creamos una variable int cualquiera,imprimir un triángulo rectángulo por pantalla, lado = 4
public class PrácticaClase1 {

   
    public static void main(String[] args) {
        int lado = 4;
        // Creamos un primer bucle for 
        for (int filas = 0; filas < lado; filas++){
           for (int columnas = 0; columnas < filas+1; columnas++)
               System.out.print('*');
               System.out.println();
           
        }
       
            
        
                                 
    }
    
}
