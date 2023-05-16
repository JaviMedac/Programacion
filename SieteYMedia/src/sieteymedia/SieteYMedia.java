package sieteymedia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SieteYMedia {

    public static void main(String[] args) {
        ArrayList<Cartas> mazo = new ArrayList();
        boolean acabar = false;
        Scanner entrada = new Scanner(System.in);
        int respuesta;
        for (int i = 0; i < 13; i++) {
            if (i == 8) {
                i = i + 2;
            }
            mazo.add(new Cartas(i, "Oro"));
            mazo.add(new Cartas(i, "Copa"));
            mazo.add(new Cartas(i, "Bastos"));
            mazo.add(new Cartas(i, "Espada"));

        }
        ArrayList<Cartas> player1 = new ArrayList();
        ArrayList<Cartas> player2 = new ArrayList();
        Collections.shuffle(mazo);
        player1.add(mazo.get(0));
        mazo.remove(0);
        player2.add(mazo.get(0));
        mazo.remove(0);
        do {
            System.out.println("¿Qué quieres hacer Jugador 1?\n1. Plantar\n2. Robar");
            respuesta = entrada.nextInt();
            switch (respuesta) {
                case 1:
                    break;
                case 2:

                    break;
                default:
                    break;
            }
            System.out.println("¿Qué quieres hacer Jugador 1?\n1. Plantar\n2. Robar");
            respuesta = entrada.nextInt();
            switch (respuesta) {
                case 1:
                    break;
                case 2:

                    break;
                default:
                    break;
            }
        } while (!acabar);

    }

    private static void sumar() {

    }

}
