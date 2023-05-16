package ejercicioclaserepaso;
import java.util.Scanner;

public class EjercicioClaseRepaso {

    public static void main(String[] args) {
        int combinación = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer valor del candado: ");
        int candado[] = new int[5];
        for (int i = 0; i<= 4; i++){
            combinación = entrada.nextInt();
            int azar = aleatorio(5,0);
            candado[i] = azar;
            while (combinación != azar){
            
                System.out.println("Valor incorrecto");
                System.out.println("Prueba otra vez: ");
                combinación = entrada.nextInt();
            }
            System.out.println("El valor es correcto");
            System.out.println("Introduce el valor " +(i+1) + ": ");

        } 
        System.out.println("Enhorabuena, adivinaste la contraseña");
        System.out.println("-->");
        recorrer (candado);
        } 
    
    public static int aleatorio(int max, int min){
        double azar = Math.random()*(max+1-min) + min;
        int numeros = (int)azar;
        
    return numeros;
    }
    public static void recorrer(int candado[]){
        for (int i = 0; i<candado.length;i++)
            System.out.print(candado[i] + " ");
    }
    }       
 
    


