package pkg1000km;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //CREACION DE LISTAS DE CARTAS
        ArrayList<Carta> mazo = new ArrayList();
        ArrayList<Carta> j1 = new ArrayList();
        ArrayList<Carta> j2 = new ArrayList();
        ArrayList<Carta> j3 = new ArrayList();
        ArrayList<Carta> j4 = new ArrayList();
        ArrayList<Carta> tablero1 = new ArrayList();
        ArrayList<Carta> tablero2 = new ArrayList();

        //LLAMADA A METODOS PARA RELLENAR
        completarBaraja(mazo);
        Collections.shuffle(mazo);
        llenarMazos(j1, mazo);
        llenarMazos(j2, mazo);
        llenarMazos(j3, mazo);
        llenarMazos(j4, mazo);

        //LLAMAMOS AL COMPARE DE LA CLASE CARTAS PARA ORDENAR LAS CARTAS POR VALOR
        //CREAMOS LOS 2 JUGADORES PRINCIPALES
        Jugador player1 = new Jugador(j1, 0);
        Jugador player2 = new Jugador(j2, 0);
        Jugador player3 = new Jugador(j3, player1.getKilometros());
        Jugador player4 = new Jugador(j4, player2.getKilometros());
        Collections.sort(player1.getMazo());
        Collections.sort(player2.getMazo());
        Collections.sort(player3.getMazo());
        Collections.sort(player4.getMazo());
        /*IMPORTANTE, SE DESORDENA AL ROBAR CARTAS, HABRÍA QUE AÑADIR EL COLLECTIONS.SORT
        AL FINAL DE CADA ROBO
         */

        //DECLARACION DE VARIABLES
        Scanner entrada = new Scanner(System.in);
        boolean acabar = false;
        int respuesta;
        boolean verde = false;
        int turno = 1;
        int limite = 0;
        int limite2 = 0;
        //EMPIEZA EL JUEGO
        System.out.println("Bienvenido a 1000 kilómetros, donde el objetivo es ver qué "
                + "jugador es capaz de recorrer la distancia de 1000 kilometros en menos tiempo");
        tablero1.add(new Carta("Semaforo rojo", false));
        tablero2.add(new Carta("Semaforo rojo", false));

        do {
            System.out.println("Turno Jugador 1");
            System.out.println("A continuación, robas una carta");
            if (mazo.isEmpty()) {
                System.out.println("No hay más cartas para robar, vamos a volver a repartir");
                completarBaraja(mazo);
                Collections.shuffle(mazo);
            }
            player1.getMazo().add(mazo.get(0));
            System.out.println("Has robado la carta:" + mazo.get(0));
            mazo.remove(0);
            System.out.println("Jugador 1, estas son tus cartas, elige cual quieres usar \n" + player1.toString());
            respuesta = entrada.nextInt();
            if (player1.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Semaforo Verde")) {
                System.out.println("Utilizas la carta Semáforo Verde");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Semaforo Vede")) {
                    System.out.println("Ya tienes una carta verde, no tuvo ningun efecto");
                    player1.getMazo().remove(respuesta);
                } else {
                    tablero1.remove(0);
                    tablero1.add(player1.getMazo().get(respuesta));
                    player1.getMazo().remove(respuesta);
                }
            } else if (player1.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Semaforo Rojo")) {
                System.out.println("Utilizas la carta Semaforo Rojo");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Semaforo Verde")) {
                    System.out.println("Anulas al rival el efecto de su semáforo en verde, ahora lo tiene en rojo");
                    tablero2.remove(0);
                    tablero2.add(player1.getMazo().get(respuesta));
                    player1.getMazo().remove(respuesta);
                } else {
                    System.out.println("El rival no tiene ninguna carta de semáforo verde incorporada, desechas tu carta por falta de efecto");
                    player1.getMazo().remove(respuesta);
                }
            } else if (player1.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Gasolina")) {
                System.out.println("Utilizas la carta Gasolina");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("No Gasolina")) {
                    System.out.println("Has repostado, ya puedes volver a moverte, pero necesitarás sacar un semáforo verde para el siguiente turno");
                    tablero1.remove(0);
                    tablero1.add(player1.getMazo().get(respuesta));
                    player1.getMazo().remove(respuesta);

                } else {
                    System.out.println("Ya tienes gasolina, la carta no surte ningún efecto");
                    player1.getMazo().remove(respuesta);
                }
            } else if (player1.getMazo().get(respuesta).getNombre().equalsIgnoreCase("No Gasolina")) {
                System.out.println("Utilizas la carta No Gasolina");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("No Gasolina")) {
                    System.out.println("La carta no supuso ningún efecto");
                    player1.getMazo().remove(respuesta);
                } else {
                    System.out.println("Anulas la gasolina del rival, ahora necesita repostar");
                    tablero2.remove(0);
                    tablero2.add(player1.getMazo().get(respuesta));
                    player1.getMazo().remove(respuesta);
                }
            } else if (player1.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Distancia")) {
                System.out.println("Has utilizado la carta Distancia");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Semaforo Verde")) {
                    if (limite == 50) {
                        if (player1.getMazo().get(respuesta).getValor() <= 50) {
                            System.out.println("Puedes avanzar, has avanzado: " + player1.getMazo().get(respuesta).getValor());
                            player1.setKilometros(player1.getMazo().get(respuesta).getValor());
                            player1.getMazo().remove(respuesta);
                            if (player1.getKilometros() >= 1000) {
                                acabar = true;
                                break;
                            }
                        } else {
                            System.out.println("No puedes pasar del límite de velocidad");
                            player1.getMazo().remove(respuesta);
                        }
                    } else {
                        System.out.println("Puedes avanzar, has avanzado: " + player1.getMazo().get(respuesta).getValor());
                        player1.setKilometros(player1.getMazo().get(respuesta).getValor());
                        player1.getMazo().remove(respuesta);
                        if (player1.getKilometros() >= 1000) {
                            acabar = true;
                            break;
                        }
                    }

                } else {
                    System.out.println("No cuenta con un semaforo en verde para moverte");
                    player1.getMazo().remove(respuesta);
                }
            } else if (player1.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Crear Accidente")) {
                System.out.println("Has utilizado la carta Crear Accidente");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Crear Accidente")) {
                    System.out.println("La carta no ha tenido ningun efecto, ya ha ocurrido un accidente");
                    player1.getMazo().remove(respuesta);
                } else {
                    System.out.println("Has ocasionado un accidente al rival, estarás contento");
                    tablero2.remove(0);
                    tablero2.add(player1.getMazo().get(respuesta));
                    player1.getMazo().remove(respuesta);
                }
            } else if (player1.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Arreglar Accidente")) {
                System.out.println("Has utilizado la carta Arreglar Accidente");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Crear Accidente")) {
                    System.out.println("Has arreglado el accidente, recuerda que necesitarás un semáforo verde para poder moverte");
                    tablero1.remove(0);
                    player1.getMazo().remove(respuesta);
                } else {
                    System.out.println("No hay ningún accidente que arreglar");
                    player1.getMazo().remove(respuesta);
                }

            } else if (player1.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Limite de Velocidad")) {
                System.out.println("Has utilizado la carta Limite de Velocidad");
                if (limite == 0) {
                    System.out.println("Has establecido un límite de velocidad para el rival");
                    limite = 50;
                    player1.getMazo().remove(respuesta);
                } else {
                    System.out.println("Ya hay un límite establecido, no ha tenido ningun efecto");
                    player1.getMazo().remove(respuesta);
                }

            } else if (player1.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Arreglar Limite")) {
                System.out.println("Has utilizado la carta Arreglar Límite");
                if (limite == 50) {
                    System.out.println("Has arreglado el límite de velocidad");
                    limite = 0;
                    player1.getMazo().remove(respuesta);
                } else {
                    System.out.println("No había ningun limite establecido, no ha tenido ningun efecto");
                    player1.getMazo().remove(respuesta);
                }
            } else if (player1.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Pinchar Rueda")) {
                System.out.println("Has utilizado la carta Pinchar Rueda");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Pinchar Rueda")) {
                    System.out.println("La rueda ya estaba pinchada, no ha surgido ningun efecto");
                    player1.getMazo().remove(respuesta);
                } else {
                    System.out.println("Has pinchado las ruedas del rival");
                    tablero2.remove(0);
                    tablero2.add(player2.getMazo().get(respuesta));
                    player1.getMazo().remove(respuesta);
                }
            } else if (player1.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Arreglar Rueda")) {
                System.out.println("Has utilizado la carta Arreglar Rueda");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Pinchar Rueda")) {
                    System.out.println("Has arreglado tu rueda pinchada, recuerda que necesitas un semaforo verde para continuar");
                    tablero1.remove(0);
                    player1.getMazo().remove(respuesta);
                } else {
                    System.out.println("No tenías ninguna carta pinchada, no ha tenido ningun efecto");
                    player1.getMazo().remove(respuesta);
                }
            }
            System.out.println("Tablero 1:");
            System.out.println(tablero1.toString() + "Limite: " + limite + " Kilometros recorridos: " + player1.getKilometros());
            System.out.println("Tablero2");
            System.out.println(tablero2.toString() + " Limite: " + limite + " Kilometros recorridos: " + player2.getKilometros());
            //  MISMO CODIGO PERO PARA JUGADOR 2
            System.out.println("Turno Jugador 2");
            System.out.println("A continuación, robas una carta");
            if (mazo.isEmpty()) {
                System.out.println("No hay más cartas para robar, vamos a volver a repartir");
                completarBaraja(mazo);
                Collections.shuffle(mazo);
            }
            player2.getMazo().add(mazo.get(0));
            System.out.println("Has robado la carta:" + mazo.get(0));
            mazo.remove(0);
            System.out.println("Jugador 2 , estas son tus cartas, elige cual quieres usar \n" + player2.toString());
            respuesta = entrada.nextInt();
            if (player2.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Semaforo Verde")) {
                System.out.println("Utilizas la carta Semáforo Verde");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Semaforo Vede")) {
                    System.out.println("Ya tienes una carta verde, no tuvo ningun efecto");
                    player2.getMazo().remove(respuesta);
                } else {
                    tablero2.remove(0);
                    tablero2.add(player2.getMazo().get(respuesta));
                    player2.getMazo().remove(respuesta);
                }
            } else if (player2.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Semaforo Rojo")) {
                System.out.println("Utilizas la carta Semaforo Rojo");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Semaforo Verde")) {
                    System.out.println("Anulas al rival el efecto de su semáforo en verde, ahora lo tiene en rojo");
                    tablero1.remove(0);
                    tablero1.add(player1.getMazo().get(respuesta));
                    player2.getMazo().remove(respuesta);
                } else {
                    System.out.println("El rival no tiene ninguna carta de semáforo verde incorporada, desechas tu carta por falta de efecto");
                    player2.getMazo().remove(respuesta);
                }
            } else if (player2.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Gasolina")) {
                System.out.println("Utilizas la carta Gasolina");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("No Gasolina")) {
                    System.out.println("Has repostado, ya puedes volver a moverte, pero necesitarás sacar un semáforo verde para el siguiente turno");
                    tablero2.remove(0);
                    player2.getMazo().remove(respuesta);

                } else {
                    System.out.println("Ya tienes gasolina, la carta no surte ningún efecto");
                    player2.getMazo().remove(respuesta);
                }
            } else if (player2.getMazo().get(respuesta).getNombre().equalsIgnoreCase("No Gasolina")) {
                System.out.println("Utilizas la carta No Gasolina");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("No Gasolina")) {
                    System.out.println("La carta no supuso ningún efecto");
                    player2.getMazo().remove(respuesta);
                } else {
                    System.out.println("Anulas la gasolina del rival, ahora necesita repostar");
                    tablero1.remove(0);
                    tablero1.add(player2.getMazo().get(respuesta));
                    player2.getMazo().remove(respuesta);
                }
            } else if (player2.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Distancia")) {
                System.out.println("Has utilizado la carta Distancia");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Semaforo Verde")) {
                    if (limite2 == 50) {
                        if (player2.getMazo().get(respuesta).getValor() <= 50) {
                            System.out.println("Puedes avanzar, has avanzado: " + player2.getMazo().get(respuesta).getValor());
                            player2.setKilometros(player1.getMazo().get(respuesta).getValor());
                            player2.getMazo().remove(respuesta);
                            if (player2.getKilometros() >= 1000) {
                                acabar = true;
                                break;
                            }
                        } else {
                            System.out.println("No puedes pasar del límite de velocidad");
                            player2.getMazo().remove(respuesta);
                        }
                    } else {
                        System.out.println("Puedes avanzar, has avanzado: " + player2.getMazo().get(respuesta).getValor());
                        player2.setKilometros(player1.getMazo().get(respuesta).getValor());
                        player2.getMazo().remove(respuesta);
                        if (player2.getKilometros() >= 1000) {
                            acabar = true;
                            break;
                        }
                    }

                } else {
                    System.out.println("No cuenta con un semaforo en verde para moverte");
                    player2.getMazo().remove(respuesta);
                }
            } else if (player2.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Crear Accidente")) {
                System.out.println("Has utilizado la carta Crear Accidente");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Crear Accidente")) {
                    System.out.println("La carta no ha tenido ningun efecto, ya ha ocurrido un accidente");
                    player2.getMazo().remove(respuesta);
                } else {
                    System.out.println("Has ocasionado un accidente al rival, estarás contento");
                    tablero1.remove(0);
                    tablero1.add(player2.getMazo().get(respuesta));
                    player2.getMazo().remove(respuesta);
                }
            } else if (player2.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Arreglar Accidente")) {
                System.out.println("Has utilizado la carta Arreglar Accidente");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Crear Accidente")) {
                    System.out.println("Has arreglado el accidente, recuerda que necesitarás un semáforo verde para poder moverte");
                    tablero2.remove(0);
                    player2.getMazo().remove(respuesta);
                } else {
                    System.out.println("No hay ningún accidente que arreglar");
                    player2.getMazo().remove(respuesta);
                }

            } else if (player2.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Limite de Velocidad")) {
                System.out.println("Has utilizado la carta Limite de Velocidad");
                if (limite2 == 0) {
                    System.out.println("Has establecido un límite de velocidad para el rival");
                    limite2 = 50;
                    player2.getMazo().remove(respuesta);
                } else {
                    System.out.println("Ya hay un límite establecido, no ha tenido ningun efecto");
                    player2.getMazo().remove(respuesta);
                }

            } else if (player2.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Arreglar Limite")) {
                System.out.println("Has utilizado la carta Arreglar Límite");
                if (limite2 == 50) {
                    System.out.println("Has arreglado el límite de velocidad");
                    limite2 = 0;
                    player2.getMazo().remove(respuesta);
                } else {
                    System.out.println("No había ningun limite establecido, no ha tenido ningun efecto");
                    player2.getMazo().remove(respuesta);
                }
            } else if (player2.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Pinchar Rueda")) {
                System.out.println("Has utilizado la carta Pinchar Rueda");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Pinchar Rueda")) {
                    System.out.println("La rueda ya estaba pinchada, no ha surgido ningun efecto");
                    player2.getMazo().remove(respuesta);
                } else {
                    System.out.println("Has pinchado las ruedas del rival");
                    tablero1.remove(0);
                    tablero1.add(player2.getMazo().get(respuesta));
                    player2.getMazo().remove(respuesta);
                }
            } else if (player2.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Arreglar Rueda")) {
                System.out.println("Has utilizado la carta Arreglar Rueda");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Pinchar Rueda")) {
                    System.out.println("Has arreglado tu rueda pinchada, recuerda que necesitas un semaforo verde para continuar");
                    tablero2.remove(0);
                    player2.getMazo().remove(respuesta);
                } else {
                    System.out.println("No tenías ninguna carta pinchada, no ha tenido ningun efecto");
                    player2.getMazo().remove(respuesta);
                }
            }
            System.out.println("Tablero 1:");
            System.out.println(tablero1.toString() + "Limite: " + limite2 + " Kilometros recorridos: " + player1.getKilometros());
            System.out.println("Tablero2");
            System.out.println(tablero2.toString() + " Limite: " + limite2 + " Kilometros recorridos: " + player2.getKilometros());
            //IGUAL PERO PARA JUGADOR 3 
            System.out.println("Turno Jugador 3");
            System.out.println("A continuación, robas una carta");
            if (mazo.isEmpty()) {
                System.out.println("No hay más cartas para robar, vamos a volver a repartir");
                completarBaraja(mazo);
                Collections.shuffle(mazo);
            }
            player3.getMazo().add(mazo.get(0));
            System.out.println("Has robado la carta:" + mazo.get(0));
            mazo.remove(0);
            System.out.println("Jugador 3, estas son tus cartas, elige cual quieres usar \n" + player3.toString());
            respuesta = entrada.nextInt();
            if (player3.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Semaforo Verde")) {
                System.out.println("Utilizas la carta Semáforo Verde");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Semaforo Vede")) {
                    System.out.println("Ya tienes una carta verde, no tuvo ningun efecto");
                    player3.getMazo().remove(respuesta);
                } else {
                    tablero1.remove(0);
                    tablero1.add(player3.getMazo().get(respuesta));
                    player3.getMazo().remove(respuesta);
                }
            } else if (player3.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Semaforo Rojo")) {
                System.out.println("Utilizas la carta Semaforo Rojo");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Semaforo Verde")) {
                    System.out.println("Anulas al rival el efecto de su semáforo en verde, ahora lo tiene en rojo");
                    tablero2.remove(0);
                    tablero2.add(player3.getMazo().get(respuesta));
                    player3.getMazo().remove(respuesta);
                } else {
                    System.out.println("El rival no tiene ninguna carta de semáforo verde incorporada, desechas tu carta por falta de efecto");
                    player3.getMazo().remove(respuesta);
                }
            } else if (player3.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Gasolina")) {
                System.out.println("Utilizas la carta Gasolina");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("No Gasolina")) {
                    System.out.println("Has repostado, ya puedes volver a moverte, pero necesitarás sacar un semáforo verde para el siguiente turno");
                    tablero1.remove(0);
                    tablero1.add(player3.getMazo().get(respuesta));
                    player3.getMazo().remove(respuesta);

                } else {
                    System.out.println("Ya tienes gasolina, la carta no surte ningún efecto");
                    player3.getMazo().remove(respuesta);
                }
            } else if (player3.getMazo().get(respuesta).getNombre().equalsIgnoreCase("No Gasolina")) {
                System.out.println("Utilizas la carta No Gasolina");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("No Gasolina")) {
                    System.out.println("La carta no supuso ningún efecto");
                    player3.getMazo().remove(respuesta);
                } else {
                    System.out.println("Anulas la gasolina del rival, ahora necesita repostar");
                    tablero2.remove(0);
                    tablero2.add(player3.getMazo().get(respuesta));
                    player3.getMazo().remove(respuesta);
                }
            } else if (player3.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Distancia")) {
                System.out.println("Has utilizado la carta Distancia");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Semaforo Verde")) {
                    if (limite == 50) {
                        if (player3.getMazo().get(respuesta).getValor() <= 50) {
                            System.out.println("Puedes avanzar, has avanzado: " + player3.getMazo().get(respuesta).getValor());
                            player1.setKilometros(player3.getMazo().get(respuesta).getValor());
                            player3.getMazo().remove(respuesta);
                            if (player1.getKilometros() >= 1000) {
                                acabar = true;
                                break;
                            }
                        } else {
                            System.out.println("No puedes pasar del límite de velocidad");
                            player3.getMazo().remove(respuesta);
                        }
                    } else {
                        System.out.println("Puedes avanzar, has avanzado: " + player3.getMazo().get(respuesta).getValor());
                        player1.setKilometros(player3.getMazo().get(respuesta).getValor());
                        player3.getMazo().remove(respuesta);
                        if (player1.getKilometros() >= 1000) {
                            acabar = true;
                            break;
                        }
                    }

                } else {
                    System.out.println("No cuenta con un semaforo en verde para moverte");
                    player1.getMazo().remove(respuesta);
                }
            } else if (player3.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Crear Accidente")) {
                System.out.println("Has utilizado la carta Crear Accidente");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Crear Accidente")) {
                    System.out.println("La carta no ha tenido ningun efecto, ya ha ocurrido un accidente");
                    player3.getMazo().remove(respuesta);
                } else {
                    System.out.println("Has ocasionado un accidente al rival, estarás contento");
                    tablero2.remove(0);
                    tablero2.add(player3.getMazo().get(respuesta));
                    player3.getMazo().remove(respuesta);
                }
            } else if (player3.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Arreglar Accidente")) {
                System.out.println("Has utilizado la carta Arreglar Accidente");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Crear Accidente")) {
                    System.out.println("Has arreglado el accidente, recuerda que necesitarás un semáforo verde para poder moverte");
                    tablero1.remove(0);
                    player3.getMazo().remove(respuesta);
                } else {
                    System.out.println("No hay ningún accidente que arreglar");
                    player3.getMazo().remove(respuesta);
                }

            } else if (player3.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Limite de Velocidad")) {
                System.out.println("Has utilizado la carta Limite de Velocidad");
                if (limite == 0) {
                    System.out.println("Has establecido un límite de velocidad para el rival");
                    limite = 50;
                    player3.getMazo().remove(respuesta);
                } else {
                    System.out.println("Ya hay un límite establecido, no ha tenido ningun efecto");
                    player3.getMazo().remove(respuesta);
                }

            } else if (player3.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Arreglar Limite")) {
                System.out.println("Has utilizado la carta Arreglar Límite");
                if (limite == 50) {
                    System.out.println("Has arreglado el límite de velocidad");
                    limite = 0;
                    player3.getMazo().remove(respuesta);
                } else {
                    System.out.println("No había ningun limite establecido, no ha tenido ningun efecto");
                    player3.getMazo().remove(respuesta);
                }
            } else if (player3.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Pinchar Rueda")) {
                System.out.println("Has utilizado la carta Pinchar Rueda");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Pinchar Rueda")) {
                    System.out.println("La rueda ya estaba pinchada, no ha surgido ningun efecto");
                    player3.getMazo().remove(respuesta);
                } else {
                    System.out.println("Has pinchado las ruedas del rival");
                    tablero2.remove(0);
                    tablero2.add(player3.getMazo().get(respuesta));
                    player3.getMazo().remove(respuesta);
                }
            } else if (player3.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Arreglar Rueda")) {
                System.out.println("Has utilizado la carta Arreglar Rueda");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Pinchar Rueda")) {
                    System.out.println("Has arreglado tu rueda pinchada, recuerda que necesitas un semaforo verde para continuar");
                    tablero1.remove(0);
                    player3.getMazo().remove(respuesta);
                } else {
                    System.out.println("No tenías ninguna carta pinchada, no ha tenido ningun efecto");
                    player3.getMazo().remove(respuesta);
                }
            }
            System.out.println("Tablero 1:");
            System.out.println(tablero1.toString() + "Limite: " + limite + " Kilometros recorridos: " + player1.getKilometros());
            System.out.println("Tablero2");
            System.out.println(tablero2.toString() + " Limite: " + limite + " Kilometros recorridos: " + player2.getKilometros());
            //  MISMO CODIGO PERO PARA JUGADOR 4
            System.out.println("Turno Jugador 4");
            System.out.println("A continuación, robas una carta");
            if (mazo.isEmpty()) {
                System.out.println("No hay más cartas para robar, vamos a volver a repartir");
                completarBaraja(mazo);
                Collections.shuffle(mazo);
            }
            player2.getMazo().add(mazo.get(0));
            System.out.println("Has robado la carta:" + mazo.get(0));
            mazo.remove(0);
            System.out.println("Jugador 4 , estas son tus cartas, elige cual quieres usar \n" + player2.toString());
            respuesta = entrada.nextInt();
            if (player4.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Semaforo Verde")) {
                System.out.println("Utilizas la carta Semáforo Verde");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Semaforo Vede")) {
                    System.out.println("Ya tienes una carta verde, no tuvo ningun efecto");
                    player4.getMazo().remove(respuesta);
                } else {
                    tablero2.remove(0);
                    tablero2.add(player2.getMazo().get(respuesta));
                    player4.getMazo().remove(respuesta);
                }
            } else if (player4.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Semaforo Rojo")) {
                System.out.println("Utilizas la carta Semaforo Rojo");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Semaforo Verde")) {
                    System.out.println("Anulas al rival el efecto de su semáforo en verde, ahora lo tiene en rojo");
                    tablero1.remove(0);
                    tablero1.add(player1.getMazo().get(respuesta));
                    player4.getMazo().remove(respuesta);
                } else {
                    System.out.println("El rival no tiene ninguna carta de semáforo verde incorporada, desechas tu carta por falta de efecto");
                    player4.getMazo().remove(respuesta);
                }
            } else if (player4.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Gasolina")) {
                System.out.println("Utilizas la carta Gasolina");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("No Gasolina")) {
                    System.out.println("Has repostado, ya puedes volver a moverte, pero necesitarás sacar un semáforo verde para el siguiente turno");
                    tablero2.remove(0);
                    player4.getMazo().remove(respuesta);

                } else {
                    System.out.println("Ya tienes gasolina, la carta no surte ningún efecto");
                    player4.getMazo().remove(respuesta);
                }
            } else if (player4.getMazo().get(respuesta).getNombre().equalsIgnoreCase("No Gasolina")) {
                System.out.println("Utilizas la carta No Gasolina");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("No Gasolina")) {
                    System.out.println("La carta no supuso ningún efecto");
                    player4.getMazo().remove(respuesta);
                } else {
                    System.out.println("Anulas la gasolina del rival, ahora necesita repostar");
                    tablero1.remove(0);
                    tablero1.add(player2.getMazo().get(respuesta));
                    player4.getMazo().remove(respuesta);
                }
            } else if (player4.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Distancia")) {
                System.out.println("Has utilizado la carta Distancia");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Semaforo Verde")) {
                    if (limite2 == 50) {
                        if (player4.getMazo().get(respuesta).getValor() <= 50) {
                            System.out.println("Puedes avanzar, has avanzado: " + player4.getMazo().get(respuesta).getValor());
                            player2.setKilometros(player4.getMazo().get(respuesta).getValor());
                            player4.getMazo().remove(respuesta);
                            if (player2.getKilometros() >= 1000) {
                                acabar = true;
                                break;
                            }
                        } else {
                            System.out.println("No puedes pasar del límite de velocidad");
                            player4.getMazo().remove(respuesta);
                        }
                    } else {
                        System.out.println("Puedes avanzar, has avanzado: " + player4.getMazo().get(respuesta).getValor());
                        player2.setKilometros(player1.getMazo().get(respuesta).getValor());
                        player4.getMazo().remove(respuesta);
                        if (player2.getKilometros() >= 1000) {
                            acabar = true;
                            break;
                        }
                    }

                } else {
                    System.out.println("No cuenta con un semaforo en verde para moverte");
                    player4.getMazo().remove(respuesta);
                }
            } else if (player4.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Crear Accidente")) {
                System.out.println("Has utilizado la carta Crear Accidente");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Crear Accidente")) {
                    System.out.println("La carta no ha tenido ningun efecto, ya ha ocurrido un accidente");
                    player4.getMazo().remove(respuesta);
                } else {
                    System.out.println("Has ocasionado un accidente al rival, estarás contento");
                    tablero1.remove(0);
                    tablero1.add(player2.getMazo().get(respuesta));
                    player4.getMazo().remove(respuesta);
                }
            } else if (player4.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Arreglar Accidente")) {
                System.out.println("Has utilizado la carta Arreglar Accidente");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Crear Accidente")) {
                    System.out.println("Has arreglado el accidente, recuerda que necesitarás un semáforo verde para poder moverte");
                    tablero2.remove(0);
                    player4.getMazo().remove(respuesta);
                } else {
                    System.out.println("No hay ningún accidente que arreglar");
                    player4.getMazo().remove(respuesta);
                }

            } else if (player4.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Limite de Velocidad")) {
                System.out.println("Has utilizado la carta Limite de Velocidad");
                if (limite2 == 0) {
                    System.out.println("Has establecido un límite de velocidad para el rival");
                    limite2 = 50;
                    player4.getMazo().remove(respuesta);
                } else {
                    System.out.println("Ya hay un límite establecido, no ha tenido ningun efecto");
                    player4.getMazo().remove(respuesta);
                }

            } else if (player4.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Arreglar Limite")) {
                System.out.println("Has utilizado la carta Arreglar Límite");
                if (limite2 == 50) {
                    System.out.println("Has arreglado el límite de velocidad");
                    limite2 = 0;
                    player4.getMazo().remove(respuesta);
                } else {
                    System.out.println("No había ningun limite establecido, no ha tenido ningun efecto");
                    player4.getMazo().remove(respuesta);
                }
            } else if (player4.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Pinchar Rueda")) {
                System.out.println("Has utilizado la carta Pinchar Rueda");
                if (tablero1.get(0).getNombre().equalsIgnoreCase("Pinchar Rueda")) {
                    System.out.println("La rueda ya estaba pinchada, no ha surgido ningun efecto");
                    player4.getMazo().remove(respuesta);
                } else {
                    System.out.println("Has pinchado las ruedas del rival");
                    tablero1.remove(0);
                    tablero1.add(player2.getMazo().get(respuesta));
                    player4.getMazo().remove(respuesta);
                }
            } else if (player4.getMazo().get(respuesta).getNombre().equalsIgnoreCase("Arreglar Rueda")) {
                System.out.println("Has utilizado la carta Arreglar Rueda");
                if (tablero2.get(0).getNombre().equalsIgnoreCase("Pinchar Rueda")) {
                    System.out.println("Has arreglado tu rueda pinchada, recuerda que necesitas un semaforo verde para continuar");
                    tablero2.remove(0);
                    player4.getMazo().remove(respuesta);
                } else {
                    System.out.println("No tenías ninguna carta pinchada, no ha tenido ningun efecto");
                    player4.getMazo().remove(respuesta);
                }
            }
            System.out.println("Tablero 1:");
            System.out.println(tablero1.toString() + "Limite: " + limite2 + " Kilometros recorridos: " + player1.getKilometros());
            System.out.println("Tablero2");
            System.out.println(tablero2.toString() + " Limite: " + limite2 + " Kilometros recorridos: " + player2.getKilometros());

            turno++;

        } while (!acabar);
    }
    //METODO PARA RELLENAR EL MAZO PRINCIPAL

    private static void completarBaraja(ArrayList mazo) {
        for (int i = 0; i < 2; i++) {
            mazo.add(new Carta("Semaforo Verde", false));
            mazo.add(new Carta("Semaforo Verde", false));
            mazo.add(new Carta("Semaforo Verde", false));
            mazo.add(new Carta("Semaforo Verde", false));
            mazo.add(new Carta("Semaforo Rojo", true));
            mazo.add(new Carta("Gasolina", false));
            mazo.add(new Carta("No Gasolina", true));
            mazo.add(new Carta("Crear Accidente", true));
            mazo.add(new Carta("Arreglar Accidente", false));
            mazo.add(new Carta("Limite de velocidad", true));
            mazo.add(new Carta("Arreglar Limite", false));
            mazo.add(new Carta("Pinchar Rueda", true));
            mazo.add(new Carta("Arreglar Pinchazo", false));
        }
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                mazo.add(new Carta("Distancia", i));
                mazo.add(new Carta("Distancia", i));
                mazo.add(new Carta("Distancia", i));
                mazo.add(new Carta("Distancia", i));
            }
            mazo.add(new Carta("Distancia", i));
            mazo.add(new Carta("Distancia", i));

        }
    }

    //METODO PARA LLENAR LOS MAZOS DE LOS JUGADORES
    private static void llenarMazos(ArrayList mazo, ArrayList baraja) {
        for (int i = 0; i < 6; i++) {
            mazo.add(baraja.get(0));
            baraja.remove(0);
        }
    }

}
