// cuantos numeros introducir, introducir dichos números, mostrar el orden inverso.
package ejercicioclasehuelga;
import java.util.Scanner;
import java.util.Arrays;


public class EjercicioClaseHuelga {

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad, nº,orden;       
        System.out.println("Introduce cuántos números quieres ordenar: ");
        cantidad = entrada.nextInt();
        int array[] = new int [cantidad];
        for (int num = 0; num < array.length; num++){
            System.out.println("Introduce un número: ");
            array[num] = entrada.nextInt();
            }
        for (int i = cantidad-1; i >= 0;i--){
            System.out.print("[" + array[i] + "]");
        }
            
        }
        
    }
    

