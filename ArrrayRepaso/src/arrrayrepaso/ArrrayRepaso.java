package arrrayrepaso;

public class ArrrayRepaso {

    public static void main(String[] args) {
        char tablero[][] = new char[4][4];
        System.out.println("Tu posición inicial es 1,3");
        for (int fila = 0; fila < tablero.length; fila++){
            System.out.println("");
            for(int columna = 0; columna < tablero[fila].length; columna++){
                tablero[fila][columna] = 'A';
                tablero[1][3] = 'X';
                System.out.print(tablero[fila][columna]);
            }
        }
        System.out.println("");
        if (tablero[random()][random2()] != 'X') {
            tablero[random()][random2()] = 'X';
            tablero[1][3] = 'A';      
        } 
        else {
            tablero[random()][random2()] = 'X';
            tablero[1][3] = 'A';
        }
        System.out.println("");
        System.out.println("Tu nueva posición es:");
        for (int fila = 0; fila < tablero.length; fila++){
            System.out.println("");
            for(int columna = 0; columna < tablero[fila].length; columna++){
                System.out.print(tablero[fila][columna]);
            }
        }
        System.out.println("");
    }

    public static int random() {
        double x = Math.random() * 4;
        int aleatorio1 = (int) x;
        return aleatorio1;
    }

    public static int random2() {
        double x = Math.random() * 4;
        int aleatorio2 = (int) x;
        return aleatorio2;
    }

}
