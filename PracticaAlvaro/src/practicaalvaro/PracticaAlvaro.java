package practicaalvaro;

import java.util.Date;
import java.util.Random;

public class PracticaAlvaro {

    public static void main(String[] args) {
        Date objeto = new Date();
        int[][] tablero = new int[4][4];
        System.out.println(tablero[0][0]);
        rellenarTablero(tablero);
        tablero = añadirFila(tablero);
        tablero = añadirColumna(tablero);
        for (int i = 0; i < tablero.length; i++) {
            System.out.println("");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
        }
        /*ablero = eliminarFila(tablero);
        tablero = eliminarColumna(tablero);
        for (int i = 0; i < tablero.length; i++) {
            System.out.println("");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
        }*/
        /*TABLERO ESTATICO DE INT
        NO SE PUEDE UTILIZAR MATH
        HAY QUE HACER FUNCION QUE DEVUELVA UN RANDOM ENTRE 0 Y 10
        HAY QUE HACER FUNCION QUE TABLERO DE 4 X 4 RELLENADO
        HAY QUE HACER FUNCION QUE AÑADE FILA 
        HAY QUE HACER FUNCION QUE AÑADE COLUMNA
        HAY QUE HACER FUNCION QUE ELIMINA FILA 
        HAY QUE HACER FUNCION QUE ELIMINA COLUMNA
         */
    }

    public static int devolverRandom() {
        Random random = new Random();
        int a = random.nextInt(10);
        while (a > 10 || a < 0) {
            a = random.nextInt(10);
        }
        return a;
    }

    public static void rellenarTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = devolverRandom();
            }
        }
    }

    private static int[][] añadirFila(int[][] tablero) {
        int[][] tableroClone = new int[tablero.length + 1][tablero.length];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tableroClone[i][j] = tablero[i][j];
            }
        }
        return tableroClone;
    }

    private static int[][] añadirColumna(int[][] tablero) {
        int[][] tableroClone = new int[tablero.length][tablero.length + 1];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tableroClone[i][j] = tablero[i][j];
            }
        }
        return tableroClone;
    }

    private static int[][] eliminarFila(int[][] tablero) {
        int[][] tableroClone = new int[tablero.length - 1][tablero.length];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tableroClone[i][j] = tablero[i][j];
            }
        }
        return tableroClone;
    }

    private static int[][] eliminarColumna(int[][] tablero) {
        int[][] tableroClone = new int[tablero.length][tablero.length - 1];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tableroClone[i][j] = tablero[i][j];
            }
        }
        return tableroClone;
    }

}
