package prácticaclaseb;
import java.util.Scanner;
// Crear un triángulo rectángulo
// Javier Toledo Carbonell 06/10/2022
public class PrácticaClaseB {

   
    public static void main(String[] args) {
        int lado = 0;
        //Pedimos por teclado el valor que le queremos dar al lado del triángulo
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el tamaño del lado: ");
        lado = entrada.nextInt();
        // Una vez pedido el dato, creamos un primer bucle for que corresponde
        //  a las "filas" en las que dividiremos el triángulo. 
        for (int filas = 0; filas < lado; filas++){
            // Creamos un segundo bucle for que imprima '*' por cada vez que se cumpla cierta 
           for (int columnas = 0; columnas < filas+1; columnas++){
               // Por cada valor de fila, se cumplirá una condición de columna, por lo que imprimirá un asterisco
               // La condición se resume a una operación matemática simple: cada valor de columna < cada valor de fila+1
               // De esta forma para el primer valor de fila (0), solo se cumplirá la condición para el primer valor (0) de columna
               System.out.print('*');
           }
               // Creamos un System.out que nos imprima un salto de linea para que no se nos queden todos en la misma linea
               System.out.println();
           }
        }
       
            
        
                                 
    }
    