package práctica2;
import java.util.Scanner;
import java.util.Arrays;
// Práctica 2 Javier Toledo, mi personaje es : ELIAS SIMON 


public class Práctica2 {


    public static void main(String[] args) {
        // Creamos las variables iniciales
        int id[] = {4,5,3,1,6,2,0,7,8};
        String uniforme1 = "Bigote, gorra, chaqueta y pantalón corto";
        String uniforme2 = "Peluca, sombrero, chaqueta y pantalón largo";
        String uniforme3 = "Gafas, abrigo y pantalón pinza";
        boolean u1 = false;
        boolean u2 = false;
        boolean u3 = false;
        boolean ip = false;
        boolean ganar = false;
        // Creamos un array bidimensional de char que usaremos como tablero
        
        char tablero[][] = new char[10][10];      
        for(int i = 0; i < tablero.length; i++){
            // System.out.println("");
            for (int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = 'X';
                //System.out.print(tablero[i][j]);
                // System.out.print(" ");
            }
        }
        // System.out.println(" ");
         System.out.println("Comencemos el juego, te encuentras en la posición [6,6]");
        // A continación, colocaremos nuestro equipo de fuga en las posiciones que nos pide el ejercicio.
        for(int i = 0; i < tablero.length; i++){
            System.out.println("");
            for(int j = 0; j < tablero[i].length; j++){
                tablero[0][3] = 'P';
                tablero[0][4] = 'P';
                tablero[0][5] = 'P';
                tablero[3][9] = 'U';
                tablero[4][9] = 'U';
                tablero[5][9] = 'U';
                tablero[9][4] = 'A';
                tablero[9][5] = 'A';
                tablero[9][6] = 'A'; 
                tablero[6][6] = 'J'; //Indicamos ya nuestra posición inicial del jugador.
                System.out.print(tablero[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println(" ");
        //Creamos otro tablero que será nuestra copia del tablero sin los centinelas colocados  
        int tablero2[][] = new int [10][10];
        for (int i = 0; i < tablero2.length; i++){
            for(int j = 0; j < tablero2[i].length; j++){
                tablero2[i][j] = tablero[i][j];
            }
        }
        
        // Acto seguido, colocamos de forma aleatoria los 10 centinelas en el tablero, este nuevo tablero no lo
        // verá el jugador, así que seguiremos mostrando el tablero anterior.
        // Para ello, usaremos contadores y while.
        
        int contador = 0;
        while (contador < 10){
            if(tablero[random()][random()] == 'X'){ //Usamos esta condición para que los centinelas solo se coloquen en posiciones vacías
            tablero[random()][random()] = 'C';
            contador++;
            }
            else{                
            }
        }
        // Este for muestra el tablero con los centinelas, asi que lo ocultamos.
        // for(int i = 0; i < tablero.length; i++){
            // System.out.println("");
            // for(int j = 0; j < tablero[i].length; j++){
                //System.out.print(tablero[i][j]);
                // System.out.print(" ");
            //}
        //}
        int a, b;
        while (!u1 || !ip || !ganar){ //Creamos un bucle while para repetir el juego mientras continue.
        System.out.println("Se tira el dado, y el resultado es: " + dado());  
        System.out.println("Con el resultado obtenido, elige de tus 4 posibles opciones a donde te quieres mover: ");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Fila: ");
        a = entrada.nextInt();
        System.out.println("Columna: ");
        b = entrada.nextInt();
        if (tablero[a][b] == 'P'){ //Para el juego del pasaporte, ordenaremos nuestro array creado para el pasaporte y lo mostraremos por pantalla.
            System.out.println("Estas en la casilla pasaporte");
            Arrays.sort(id);
            System.out.println("Tu pasaporte ordenado es: ");
            for (int i = 0; i < id.length; i++){
                System.out.print(id[i]);
            }
            ip = true;
        }
        else if (tablero[a][b] == 'U'){ // Para el juego del uniforme, crearemos 3 ifs que actuen de switchs para los booleanos creados al principio.
            System.out.println("Estas en la casilla uniforme");
            int x;
            System.out.println("Elige un uniforme (1 para uniforme1, 2 para el 2, 3 para el 3): ");
            x = entrada.nextInt();
            if (x == 1){
                System.out.println("Tu uniforme es: " + uniforme1);
                u1 = true;
            }
            else if (x == 2){
                System.out.println("Tu uniforme es: " + uniforme2);
                u1 = true;                
            }
            else if (x == 3){
                System.out.println("Tu uniforme es: " + uniforme3);
                u1 = true;
            }
        }
        else if (tablero[a][b] == 'A'){ //Para jugar piedr papel tijeras, haremos trampa y mostraremos la mano del rival para no poder perder.
            System.out.println("Estas en la casilla alicates, vamos a jugar a piedra, papel o tijeras.");
            int tumano;
            System.out.println("El centinela ha sacado: " + juego());
            System.out.println("¿Qué quieres usar, 1 para piedra, 2 para papel, 3 para tijera: ");
            tumano = entrada.nextInt();
            System.out.println("Enhorabuena, le has ganado");
            ganar = true;                                       
        }
        else if (tablero[a][b] == 'C'){
            System.out.println("Hay un centinela, has perdido");
            break;
        }
        else if (tablero[a][b] == 'X'){
            System.out.println("Estas en una casilla vacía, tira otra vez");
        }
            System.out.println("");
            System.out.println("Ahora tu posición es: " + "[" + a + "," + b + "]");
        }
        if(ganar && ip && u1){ // Creamos un último if que nos saque por pantalla en función de si hemos salido del bucle ganando o perdiendo, que nos lo indique
            System.out.println("Enhorabuena, has conseguido escapar, has ganado.");
            System.out.println("Este es el panel final: ");
            for (int i = 0; i < tablero.length; i++){
                System.out.println("");
                for(int j = 0; j < tablero.length; j++){
                    System.out.print(tablero[i][j]);
                    System.out.print(" ");
                }
            }
        }
        else{
            System.out.println("Se acabó");
        }
        
    }           
    // Creamos otra función auxiliar para generar los centinelas aleatorios.
    public static int random(){
        double numero = Math.random() * 10;
        int azar = (int) numero;
        return azar;
    }
    // Creamos otra función auxiliar para generar el valor del dado.
    public static int dado(){
        double numero = Math.random() * 7;
        while ((int)numero == 0){
        numero = Math.random() * 7;
        }
        int azar = (int) numero;
        return azar;
    }
    //Creamos otra función auxiliar para generar piedra papel o tijera.
    public static String juego(){
        String resultado = "";
        double random = Math.random() * 3;
        int numero = (int) random;
        if (numero == 0){
            resultado = "piedra";
        }
        else if (numero == 1){
            resultado = "papel";
        }
        else if (numero ==  2){
            resultado = "tijera";
        }
        return resultado;
    }
    
}
