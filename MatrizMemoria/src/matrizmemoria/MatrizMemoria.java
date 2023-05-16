package matrizmemoria;

import java.util.Scanner;

public class MatrizMemoria {

    public static void main(String[] args) {
        String memoria[][] = null;
        String intento;
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.println("Vamos a comenzar el juego para poner a prueba tu memoria");
        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.println("A continuación te vamos a mostrar una matriz llena de nombres de animales, intenta memorizarla en 5 segundos");
        System.out.println("");
        System.out.println("--------------------------------------------------------");
        mostrarMatrizLarga(memoria);
        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.println("Se acabó el tiempo, es hora de intentar adivinar, introduce alguna palabra que crees que esté en la matriz");
        System.out.println("A medida que vayas avanzando, se irá rellenando este panel, introduce tu primer intento: ");
        intento = entrada.next();
        jugarJuego(intento);
    }
    // Esta matriz no se llega a usar, asi que la comentamos

    /*public static void mostrarMatriz(String memoria[][]) {
        memoria = new String[3][3];
        memoria[0][0] = "Gato";
        memoria[0][1] = "Perro";
        memoria[0][2] = "Leon";
        memoria[1][0] = "Serpiente";
        memoria[1][1] = "Cerdo";
        memoria[1][2] = "Pato";
        memoria[2][0] = "Cocodrilo";
        memoria[2][1] = "Elefante";
        memoria[2][2] = "Gallina";
        for (int i = 0; i < memoria.length; i++) {
            System.out.println("");
            for (int j = 0; j < memoria[i].length; j++) {
                System.out.print(memoria[i][j]);
                System.out.print(" ");
            }
        }

    }*/
    //Metodo mostrar matriz con tamaño bien hecho
    public static void mostrarMatrizLarga(String memoria[][]) {
        memoria = new String[3][3];
        memoria[0][0] = "Gato";
        memoria[0][1] = "Perro";
        memoria[0][2] = "Leon";
        memoria[1][0] = "Serpiente";
        memoria[1][1] = "Cerdo";
        memoria[1][2] = "Pato";
        memoria[2][0] = "Cocodrilo";
        memoria[2][1] = "Elefante";
        memoria[2][2] = "Gallina";
        //Encontrar palabra mas grande
        int tamañoMax = 0;
        for (int i = 0; i < memoria.length; i++) {
            for (int j = 0; j < memoria[i].length; j++) {
                int a = memoria[i][j].length();
                if (tamañoMax < a) {
                    tamañoMax = a;
                } else {

                }
            }
        }
        //Enseñar la matriz                
        for (int i = 0; i < memoria.length; i++) {
            System.out.println("");
            for (int j = 0; j < memoria[i].length; j++) {
                System.out.print(memoria[i][j]);
                System.out.print(" ");
                for (int x = 0; x < tamañoMax - memoria[i][j].length(); x++) {
                    System.out.print(" ");
                }
            }
        }

    }

    //Metodo matriz vacia, tampoco se usa 
    /*public static void mostrarMatrizVacia(String memoria[][]) {
        memoria = new String[3][3];
        for (int i = 0; i < memoria.length; i++) {
            System.out.println("");
            for (int j = 0; j < memoria[i].length; j++) {
                System.out.print("?");
                System.out.print("");
            }
        }
    }*/

    public static void jugarJuego(String intento) {
        String memoria[][] = new String[3][3];
        boolean completar = false;
        //Creamos otro array vacío que se irá llenando con las soluciones.
        memoria[0][0] = "Gato";
        memoria[0][1] = "Perro";
        memoria[0][2] = "Leon";
        memoria[1][0] = "Serpiente";
        memoria[1][1] = "Cerdo";
        memoria[1][2] = "Pato";
        memoria[2][0] = "Cocodrilo";
        memoria[2][1] = "Elefante";
        memoria[2][2] = "Gallina";

        String memoria2[][] = new String[3][3];
        memoria2[0][0] = "";
        memoria2[0][1] = "";
        memoria2[0][2] = "";
        memoria2[1][0] = "";
        memoria2[1][1] = "";
        memoria2[1][2] = "";
        memoria2[2][0] = "";
        memoria2[2][1] = "";
        memoria2[2][2] = "";
        int contador = 0;
        int contador2 = 0;
        boolean abandonar = false;
        //Do while del metodo jugar que revise si hemos acertado la palabra o no
        do {
            for (int i = 0; i < memoria.length; i++) {
                for (int j = 0; j < memoria[i].length; j++) {
                    if (intento.equals(memoria[i][j])) {
                        System.out.println("Has adivinado una palabra");
                        memoria2[i][j] = memoria[i][j];
                        contador++;
                    } else {
                        contador2++;

                    }
                }
            }
            if (contador == 9) {
                System.out.println("Has fallado");
            }

            System.out.println("Así está tu matriz ahora mismo: ");
            //Volvemos a encontrar la palabra mas grande
            int tamañoMax = 0;
            for (int i = 0; i < memoria.length; i++) {
                for (int j = 0; j < memoria[i].length; j++) {
                    int a = memoria[i][j].length();
                    if (tamañoMax < a) {
                        tamañoMax = a;
                    } else {

                    }
                }
            }
            for (int i = 0; i < memoria.length; i++) {
                System.out.println("");
                for (int j = 0; j < memoria[i].length; j++) {
                    System.out.print(memoria2[i][j]);
                    System.out.print(" ");
                    for (int x = 0; x < tamañoMax - memoria[i][j].length(); x++) {
                        System.out.print(" ");
                    }
                }
            }
            //Preguntamos para seguir jugando o no
            System.out.println("");
            System.out.println("Entendemos que este ejercicio mental es complicado, si desea seguir avanzando teclee Si, para abandonar teclee No)");
            String avanzar;
            Scanner entrada = new Scanner(System.in);
            avanzar = entrada.next();
            if (avanzar.equals("Si") || avanzar.equals("si")) {
                System.out.println("Vuelve a introducir otra palabra: ");
                if (contador < 9) {
                    intento = entrada.next();
                } else {

                }
            } else {
                contador = 9;
                abandonar = false;
            }
        } while (contador < 9);
        if (abandonar == true) {
            System.out.println("¡Enhorabuena, has demostrado tener una memoria prodigiosa y has acertado todas!");
        } else {
            System.out.println("Has perdido el juego por rendición, reinicia el programa para volver a jugar");
        }

    }
}
