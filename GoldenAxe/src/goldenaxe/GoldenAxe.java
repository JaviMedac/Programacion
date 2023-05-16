package goldenaxe;

import java.util.Scanner;

public class GoldenAxe {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Creamos las variables de numero de jugadores y el tipo de jugador que se selecciona
        int jugadores;
        int tipo;
        System.out.println("Elige el número de jugadores con los que deseas jugar entre 1 y 5");
        jugadores = entrada.nextInt();
        //Creamos un array que contendrá todos los jugadores.
        Jugador tipoJugador[] = new Jugador[5];
        Cthulhu cthulhu = new Cthulhu(20, true);
        //Cambiamos la vida respecto al número de jugadores.
        cthulhu.setVida(20 + (jugadores * 2));
        //Creamos el bucle para llenar el array de jugadores.
        for (int i = 0; i < jugadores; i++) {
            System.out.println("Elige un tipo de jugador entre: \n 1:ENANO \n 2:GUERRERO \n 3:AMAZONA");
            tipo = entrada.nextInt();
            if (tipo == 1) {
                tipoJugador[i] = new Enano(3, 3, "ENANO", true);
            }
            if (tipo == 2) {
                tipoJugador[i] = new Guerrero(5, 2, "GUERRERO", true);
            }
            if (tipo == 3) {
                tipoJugador[i] = new Amazona(6, 1, "AMAZONA", true);
            }
        }
        //Mostramos los datos de los jugadores
        System.out.println("El juego va a comenzar, estos son tus soldados para el juego: ");
        for (int i = 0; i < jugadores; i++) {
            System.out.println(tipoJugador[i].toString());
        }
        //Empezamos la partida, establecemos los turnos con un while, y vamos seleccionando a cada jugador con un for.
        int turnos = 8 - jugadores;
        int decision;
        int turnoInicio = 0;
        while (turnoInicio < turnos) {
            if (cthulhu.isEstaVivo()) {
                System.out.println("TURNO " + turnoInicio);
                for (int i = 0; i < jugadores; i++) {
                    System.out.println(tipoJugador[i].getNombre() + ", Selecciona una decisión para tomar: \n 1:Luchar contra Cthulhu \n 2:Coger una carta \n 3:Descansar");
                    decision = entrada.nextInt();
                    if (decision == 1) {
                        lucharCthulhu(tipoJugador[i], cthulhu);
                    }
                    if (decision == 2) {
                        cogerCarta(tipoJugador[i]);
                    }
                    if (decision == 3) {
                        reponerVida(tipoJugador[i]);
                    }
                }
                turnoInicio++;

            } else {
                System.out.println("Has ganado, ¡ENHORABUENA!");
                break;
            }
        }
        System.out.println("Te has quedado sin turnos, lamentablemente has perdido el juego");
    }

    //Funcion para establecer vida del Cthuhulu(Menos eficiente)
    /*public static int vidaCthulhu(int jugadores) {
    int vida;
    vida = 20 + (jugadores * 2);
    return vida;
    }*/

    //Metodo para luchar contra Cthulhu
    public static void lucharCthulhu(Jugador j, Cthulhu boss) {
        int dado1 = (int) ((Math.random() * 6) + 1);
        int dado2 = (int) ((Math.random() * 6) + 1);
        int sumaDados = dado1 + dado2;
        System.out.println("Es tu turno de atacar, tu poder de ataque es: " + sumaDados + "y la vida de Cthulhu es: " + boss.getVida() + " así que decides atacar, la vida del Cthulhu ahora es: " + (boss.getVida() - sumaDados));
        boss.setVida(boss.getVida() - sumaDados);
        if (boss.getVida() > 0) {
            j.setVida(j.getVida() - boss.getFuerza());
            System.out.println("El Cthulhu te ha atacado porque no le has derrotado, tu vida ahora es: " + j.getVida());
        } else {
            System.out.println("Has vencido a Cthulhu, has superado el juego");
            boss.setEstaVivo(false);

        }
    }

    //Metodo para coger carta
    public static void cogerCarta(Jugador j) {
        int pos = (int) (Math.random() * 4);
        Carta carta = j.getCarta(pos);
        System.out.println(carta.getFraseCarta());
        if (pos == 0) {
            j.setVida(j.getVida() + 1);
        }
        if (pos == 1) {
            j.setVida(j.getVida() - 1);
        }
        if (pos == 2) {
            j.setFuerza(j.getVida() + 1);
        }
        if (pos == 3) {
            j.setFuerza(j.getVida() - 1);
        }
        if (pos == 4) {
            j.setVida(j.getVida() + 2);
        }

    }

    //Metodo para reponer Vida
    public static void reponerVida(Jugador j) {
        j.setVida(j.getVida() + 1);
        System.out.println("Has descansado plácidamente, ahora tu vida es: " + j.getVida());
    }
}
