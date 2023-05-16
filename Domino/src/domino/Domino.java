package domino;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Domino {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //CREACIÓN DE VARIABLES
        int tam = 0;
        boolean acabar = false;
        boolean empezar1 = false;
        boolean empezar2 = false;
        boolean eleccion = false;
        int posicion;
        int orient;

        //CREACIÓN DE LISTAS 
        LinkedList<Ficha> listaFichas = new LinkedList();
        LinkedList<Ficha> listaJugador1 = new LinkedList();
        LinkedList<Ficha> listaJugador2 = new LinkedList();
        LinkedList<Ficha> tablero = new LinkedList();

        //CREACIÓN DE FICHAS
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= tam; j++) {
                listaFichas.add(new Ficha(i, j));
            }
            tam++;
        }

        //MEZCLAR FICHAS
        Collections.shuffle(listaFichas);
        /*System.out.println(listaFichas);*/

        //REPARTIR FICHAS
        for (int i = 0; i < 7; i++) {
            listaJugador1.add(listaFichas.pollFirst());
            listaJugador2.add(listaFichas.pollFirst());
        }
        /* System.out.println(listaFichas);
        System.out.println(listaJugador1);
        System.out.println(listaJugador2);*/
        int repetido = 0;
        int repetido2 = 0;
        int indice = 0;
        int indice2 = 0;
        System.out.println("El juego va a empezar, los jugadores tienen las fichas: ");
        for (int i = 0; i < 7; i++) {
            if (listaJugador1.get(i).compararNumero() == true) {
                if (listaJugador1.get(i).getNumero1() >= repetido) {
                    repetido = listaJugador1.get(i).getNumero1();
                    indice = i;
                }

            }
            if (listaJugador2.get(i).compararNumero() == true) {
                if (listaJugador2.get(i).getNumero1() >= repetido2) {
                    repetido2 = listaJugador2.get(i).getNumero1();
                    indice2 = i;
                }
            }
        }
        System.out.println(listaJugador1);
        System.out.println(listaJugador2);
        if (repetido > repetido2) {
            System.out.println("Empieza el Jugador 1 con la ficha " + repetido + "|" + repetido);
            tablero.add(listaJugador1.get(indice));
            listaJugador1.remove(indice);
            empezar1 = true;
        } else {
            System.out.println("Empieza el Jugador 2 con la ficha " + repetido2 + "|" + repetido2);
            tablero.add(listaJugador2.get(indice2));
            listaJugador2.remove(indice2);
            empezar2 = true;
        }
        if (empezar1) {
            System.out.println("Ya se ha soltado la primera ficha,  ahora es turno del Jugador 2");
            while (!acabar) {
                System.out.println("Este es el tablero: " + tablero);
                while (!eleccion) {
                    System.out.println("Jugador 2,  ¿qué ficha deseas poner (Introduce la posición)? Estas son tus fichas: \n" + listaJugador2);
                    posicion = entrada.nextInt();

                    System.out.println("Has elegido la ficha " + listaJugador2.get(posicion));
                    if (listaJugador2.get(posicion).getNumero1() == tablero.getFirst().getNumero1() || listaJugador2.get(posicion).getNumero2() == tablero.getFirst().getNumero1()
                            || listaJugador2.get(posicion).getNumero1() == tablero.getLast().getNumero2() || listaJugador2.get(posicion).getNumero2() == tablero.getLast().getNumero2()) {

                        System.out.println("¿Dónde quieres ponerla? 1 para izquierda o 2 para derecha");

                        orient = entrada.nextInt();
                        switch (orient) {
                            case 1:
                                if (listaJugador2.get(posicion).getNumero1() == tablero.getFirst().getNumero1()) {
                                    tablero.addFirst(new Ficha(listaJugador2.get(posicion).getNumero2(), listaJugador2.get(posicion).getNumero1()));
                                    listaJugador2.remove(posicion);
                                    break;
                                } else if (listaJugador2.get(posicion).getNumero2() == tablero.getFirst().getNumero1()) {
                                    tablero.addFirst(listaJugador2.get(posicion));
                                    listaJugador2.remove(posicion);
                                    break;
                                }

                                break;

                            case 2:
                                if (listaJugador2.get(posicion).getNumero1() == tablero.getLast().getNumero2()) {
                                    tablero.addLast(listaJugador2.get(posicion));
                                    listaJugador2.remove(posicion);
                                    break;
                                } else if (listaJugador2.get(posicion).getNumero2() == tablero.getLast().getNumero2()) {
                                    tablero.addLast(new Ficha(listaJugador2.get(posicion).getNumero2(), listaJugador2.get(posicion).getNumero1()));
                                    listaJugador2.remove(posicion);
                                    break;
                                }
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                        eleccion = true;
                    } else {
                        System.out.println("No es válida esa ficha, vas a tener que robar, se te ha asociado la siguiente ficha: " + listaFichas.get(0));
                        listaJugador2.add(listaFichas.get(0));
                        listaFichas.remove(0);
                        System.out.println("Tus fichas ahora son: \n " + listaJugador2);
                    }
                }
                System.out.println(tablero);
                while (eleccion) {
                    System.out.println("Es tu turno Jugador 1, ¿qué deseas hacer? Estas son tus fichas: \n" + listaJugador1);
                    posicion = entrada.nextInt();
                }
                acabar = true;

            }
        }
        if (empezar2) {
            System.out.println("Ya se ha soltado la primera ficha, ahora es turno del Jugador 1");
            while (!acabar) {
                System.out.println("Este es el tablero: " + tablero);
                acabar = true;
            }
        }

    }

}
