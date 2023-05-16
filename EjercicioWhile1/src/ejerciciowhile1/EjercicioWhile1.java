
package ejerciciowhile1;
import java.util.Scanner;

public class EjercicioWhile1 {

    //Introduzo número en teclado, while número !=¨0 , hacer su cuadrado, si es par o impar, si es positivo o negativo,
    // Si es 0 cerrar bucle
    public static void main(String[] args) {
        int a = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        a = entrada.nextInt();
        while (a!=0)
        {
            System.out.println("El cuadrado de " + a + " es: " + a*a);
            if (a % 2 == 0){
                System.out.println("El número es par");
            }
            else{
                System.out.println("El número es impar");
            }
            if (a>=0){
                System.out.println("El número es positivo");
            }
            else{
                System.out.println("El número es negativo");
            }
         System.out.println("");
         System.out.println("Introduce otro número: ");
         a = entrada.nextInt();
        }
    System.out.println("Fin del bucle");
    }   
    
}
