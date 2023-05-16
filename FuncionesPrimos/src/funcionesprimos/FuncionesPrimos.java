package funcionesprimos;
import java.util.Scanner;

public class FuncionesPrimos {

    
    public static void main(String[] args) {
        int a;
        boolean resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        a = entrada.nextInt();
        resultado = esPrimo(a);
        if (resultado){
            System.out.println(a + " es primo");
        }
        else{
            System.out.println(a + " no es primo");
        }
           
    }
    public static boolean esPrimo(int b){
        int contador = 2;
        while (b%contador!=0 && b>=contador){
            contador++;    
        }
    return contador==b;    
    }   
}