//Sacar por teclado 2 valores por teclado hasta que sean divisibles por 2.
package ejerciciohuelga3;
import java.util.Scanner;


public class EjercicioHuelga3 {


    public static void main(String[] args) {
        int a,b;
        Scanner entrada = new Scanner(System.in);
        boolean esdivisible = false;
        do {
            System.out.println("Introduce 2 números para ver si ambos son divisibles entre 2");
            a = entrada.nextInt();
            b = entrada.nextInt();
        }while((a*b)% 2 !=0);
        esdivisible = true;
        if (esdivisible){
        System.out.println("La multiplicación de ambos números es divisible entre 2");
        }
      
    }
    
}
