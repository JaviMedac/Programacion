//Introducir numero N, solicitar que teclee N numeros, decir media pos, neg, número  de ceros.
package ejerciciohuelga2;
import java.util.Scanner;
import java.util.Arrays;

public class EjercicioHuelga2 {

    public static void main(String[] args) {
        int N,num,neg = 0,pos = 0,contador1 = 0, contador2 = 0,contador3 = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números con la que queremos trabajar: ");
        N = entrada.nextInt();
        int array[] = new int[N];
        for(int i = 0; i < array.length; i++){
            System.out.println("Introduce un número: ");
            num = entrada.nextInt();
            array [i] = num;
            if(num == 0){              
                contador1++;           
            }
            if (array[i] < 0){
                neg = neg + array[i];
                contador2++;
            }
            if (array[i] > 0){
                pos = pos + array[i];
                contador3++;
            }
        }
        double media = neg/N;
        double media2 = pos/N;
        int array0[] = new int[contador1];
        if(contador2 > 0){
        System.out.println("La media de los negativos es: " + media);                   
        }
        if(contador3 > 0){
            System.out.println("La media de los positivos es: " + media2);   
        }
        System.out.println("El número de 0 es: " + contador1);
        }
    }
