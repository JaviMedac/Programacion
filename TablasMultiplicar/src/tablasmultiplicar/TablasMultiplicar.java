
package tablasmultiplicar;
import java.util.Scanner;


public class TablasMultiplicar {

  
    public static void main(String[] args) {
        int resultado;
        for (int a = 1; a <= 10; a++){
            System.out.println("La tabla del " + a + ":");
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++){
                resultado = a * multiplicador; 
                System.out.println(a + " * " + multiplicador + " " + "= " + resultado);
            }
                
        }
            
       
    }
    
}
