package juegoalvaro;
import java.util.Scanner;
import java.util.Arrays;


public class JuegoAlvaro {

    public static void main(String[] args) {
        // Para indicar los números de cada jugador, creamos 5 arrays para indicar cada número.
        int jugador1[] = new int[4];
        int jugador2[] = new int[4];
        int jugador3[] = new int[4];
        int jugador4[] = new int[4];
        int jugador5[] = new int[4];
        int ganador[] = new int[5];
        jugador1 = rellenar();
        jugador2 = rellenar();
        jugador3 = rellenar();
        jugador4 = rellenar();
        jugador5 = rellenar();
        // Creamos las 2 variables que el árbitro usa para el juego y acto seguido generamos el rango usando la función random
        // Creamos 5 contadores que nos servirán para clasificar cuantos números estan comprendidos en el rango del árbitro.
        int c1 = 0 ,c2 = 0,c3 = 0,c4 = 0,c5 = 0;
        int a, b;
        int max;
        a = random();
        b = random();
        int arbitro[] = new int [2];
        arbitro[0] = a;
        arbitro[1] = b;
        Arrays.sort(arbitro);
        System.out.print("El árbitro ha generado el siguiente intervalo: ");
        for(int i = 0; i < arbitro.length;i++){
            System.out.print(arbitro[i] + " ");
        }
        System.out.println("");
        System.out.print("El primer jugador tiene los numeros: ");
        for(int j = 0; j < jugador1.length; j++){
            System.out.print(jugador1[j] + " ");          
            if(jugador1[j]>arbitro[0] && jugador5[j] < arbitro[1]){
                c1++;
            }
        }
        System.out.println("");
        System.out.print("El segundo jugador tiene los números: ");
        for(int j = 0; j < jugador2.length; j++){
            System.out.print(jugador2[j] + " ");
            if(jugador2[j]>arbitro[0] && jugador5[j] < arbitro[1]){
                c2++;
            }
        }
        System.out.println("");
        System.out.print("El tercer jugador tiene los números: ");
        for(int j = 0; j < jugador3.length; j++){
            System.out.print(jugador3[j] + " ");
            if(jugador3[j]>arbitro[0] && jugador5[j] < arbitro[1]){
                c3++;
            }
        }
        System.out.println("");
        System.out.print("El cuarto jugador tiene los números: ");
        for(int j = 0; j < jugador4.length; j++){
            System.out.print(jugador4[j] + " ");
            if(jugador4[j]>arbitro[0] && jugador5[j] < arbitro[1]){
                c4++;
            }
        }
        System.out.println("");
        System.out.print("El quinto jugador tiene los números: ");
        for(int j = 0; j < jugador5.length; j++){
            System.out.print(jugador5[j] + " ");
            if(jugador5[j]>arbitro[0] && jugador5[j] < arbitro[1]){
                c5++;
            }
        }
        ganador[0] = c1;
        ganador[1] = c2;
        ganador[2] = c3;
        ganador[3] = c4;
        ganador[4] = c5;
        max = 0;
        for(int j = 0; j < ganador.length; j++){
            if(ganador[j] > ganador[max]){
                max = j;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //Cada número aleatorio de cada jugador comprendido entre los rangos A y B, sumará un punto, quedando la clasificicación así:
        System.out.println("El árbitro ha evaluado la situación, esta es la clasificación: ");
        System.out.println("El jugador 1 tiene: " + c1 + "puntos");
        System.out.println("El jugador 2 tiene: " + c2 + "puntos");
        System.out.println("El jugador 3 tiene: " + c3 + "puntos");
        System.out.println("El jugador 4 tiene: " + c4 + "puntos");
        System.out.println("El jugador 5 tiene: " + c5 + "puntos");
        System.out.println("");
        for(int i = 0; i < ganador.length; i++){
            if(ganador[i] == ganador[max]){
                System.out.println("El jugador " + (i + 1) + " ha ganado");
            }
        }
        
    }
    // Creamos una función que nos cree un número aleatorio entre  1 y 10 para "rellenar" nuestros Arrays
    public static int random(){
        double numero = Math.random() * 11;
        while ((int)numero == 0){
        numero = Math.random() * 11;
        }
        int azar = (int) numero;
        return azar;
    }
    // Para evitar crear 5 for, creamos una función que llene de forma estándar nuestros Arrays
    public static int[] rellenar(){
        int array[] = new int[4];
        for(int i = 0; i < 4; i++){
            array[i] = random();
          
        }        
     return array;
    }
    
}
