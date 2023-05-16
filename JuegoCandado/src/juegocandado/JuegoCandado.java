package juegocandado;
import java.util.Scanner;

public class JuegoCandado {

    public static void main(String[] args) {
        int combinación = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer valor del candado: ");
        int candado[] = {2,5,3,6,3};
        for (int i = 0; i<= 4; i++){
            combinación = entrada.nextInt();
            while (combinación != candado[i]){
                boolean pista;
                System.out.println("Valor incorrecto");
                System.out.println("¿Quieres una pista (true para si, false para no): ");
                pista = entrada.nextBoolean();
                if (pista){
                    System.out.println("El número empieza por 2 y acaba en 3");
                    System.out.println("");
                    System.out.println("Inténtalo de nuevo: ");
                    combinación = entrada.nextInt();
                }
                else {
                 System.out.println("Entonces, introduce otro valor: ");
                 combinación = entrada.nextInt();   
                }
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
 
    