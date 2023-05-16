
package ejerciciowhile2;
import java.util.Scanner;

public class EjercicioWhile2 {

    // Desarrolla un programa que solicite los valores máximos y minimos de un rango
    // Es decir, que diga de 1 a 20 ( metiendo numero por teclado), si el valor no corresponde
    // sucesivamente;
    
    public static void main(String[] args) {
        int min_rango = 0; 
        int max_rango = 0;
        int numero=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el mínimo del rango: ");
        min_rango = entrada.nextInt();
        System.out.println("Introduce el máximo del rango: ");
        max_rango = entrada.nextInt();
       
        do{
           System.out.println("Escribe un número: ");
           numero = entrada.nextInt();
           System.out.println(numero + " no está en el rango");
           
      } while ((numero < min_rango) || (numero > max_rango));
        System.out.println(numero + " está en el rango");
        System.out.println("");
        System.out.println("Fin del bucle");
    }
    
    
    
    
}
