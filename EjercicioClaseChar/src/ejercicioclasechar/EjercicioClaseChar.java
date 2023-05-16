package ejercicioclasechar;
import java.util.Arrays;
import java.util.Scanner;


public class EjercicioClaseChar {

   
    public static void main(String[] args) {
        String a, b;
        System.out.println("Introduce la primera palabra: ");
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextLine();
        System.out.println("Introduce la segunda palabra: ");
        b = teclado.nextLine();
        if (a.length()< b.length()){
            System.out.println("La palabra más corta es: " + a);
        }
        else if (a.length() == b.length()){
            System.out.println("Tienen los mismos carácteres.");
        }
        else{
            System.out.println("La palabra más corta es: " + b);
        }
        
        
    }
    
}
