
package ejerciciobuclefor;
import java.util.Scanner;


public class EjercicioBucleFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  
        int a;
        System.out.println("Introduce un número para saber su factorial: ");
        a = entrada.nextInt();
        int resultado = 1;
        for (int factorial = a; factorial > 1; factorial--){         
           resultado= resultado * factorial;
           System.out.println(resultado);
           
        }
        
        
        
        
        
            
        
    }
    
}
