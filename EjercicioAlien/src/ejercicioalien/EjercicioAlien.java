package ejercicioalien;

public class EjercicioAlien {

    public static void main(String[] args) {
        String tablero[][] = new String[10][10];
        Jugador[] jugadores = new Jugador[10];
        jugadores[0] = new Jugador("Pepito");
        jugadores[1] = new Jugador("Salva");
        jugadores[2] = new Jugador("Kiko");
        jugadores[3] = new Jugador("Javi");
        jugadores[4] = new Jugador("Paca");
        jugadores[5] = new Jugador("Antonio");
        jugadores[6] = new Jugador("Bernardo");
        jugadores[7] = new Jugador("Eusebio");
        jugadores[8] = new Jugador("Josefa");
        jugadores[9] = new Jugador("Francisco");
        tablero(tablero,jugadores);
        mostrarTablero(tablero);
        infectado(jugadores);
        do{
            infectar();
        }while(solouno(jugadores)!= 9);
    }
    public static void tablero(String tablero[][], Jugador[] jugadores){
        for(int x = 0; x<tablero.length; x++){
            for(int y = 0; y<tablero.length; y++){
                tablero[x][y] = "  |";
            }
        }
        for(int x = 0; x < tablero.length; x++){
            tablero[jugadores[x].getPosicionx()][jugadores[x].getPosiciony()] = "J"+(x+1)+ "|";
        }
    }
    public static void mostrarTablero(String tablero[][]){
        for(int x = 0; x<tablero.length;x++){
            System.out.println("");
            for(int y = 0; y<tablero[x].length;y++){
                System.out.print(tablero[x][y]);
            }
        }
    }
    /*public static void infectado(Jugador[] jugadores){
        int infectado = (int)(Math.random()*10);
        jugadores[infectado].setInfectado(true);
    }*/
    public static int solouno(Jugador[] jugadores){
        int numInfectados = 0;
        for(int nJugador = 0; nJugador < jugadores.length; nJugador++){
            if(jugadores[nJugador].isInfectado() == true){
                numInfectados++;
            }
        }
        return numInfectados;
        
    }
    public static void infectar(String tablero[][], Jugador[] jugadores){
        for(int nJugador = 0; nJugador < jugadores.length; nJugador++){
            if (jugadores[nJugador].isInfectado() == true){
                if(jugadores[nJugador].getPosicionx() == 9){
                    
                }
        }
    }
    }
        if(jugadores[nJugador])
    }

}
