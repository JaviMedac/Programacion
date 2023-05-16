package diccionario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Diccionario {

    public static void main(String[] args) {
        /*Crea un mini diccionario español-ingles, que contenga al menos 20 palabras, con su correspondiente traduccion
        Usa un HashMap. Pedir una palabra en español y te dará la traduccion al ingles. 
         */
        Scanner entrada = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap();
        int respuesta;
        boolean salir = false;
        llenarDiccionario(diccionario);
        System.out.println(diccionario);
        do {
            System.out.println("¿Qué opcion deseas realizar? \n1.Saber traduccion\n2.Adivinar traduccion\n3.Añadir palabras al diccionario\n4.Abandonar programa");
            respuesta = entrada.nextInt();
            switch (respuesta) {
                case 1:
                    devolverTraduccion(diccionario);
                    break;
                case 2:
                    adivinarTraduccion2(diccionario);
                    break;
                case 3:
                    añadirPalabra(diccionario);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta, introduce otro número");
                    break;
            }
        } while (!salir);
    }

    private static void llenarDiccionario(HashMap diccionario) {
        String[] palabras = new String[2];
        String frase = "";
        int contador = 0;
        try {
            File file;
            FileReader filereader;
            BufferedReader bufferedreader;
            file = new File("Palabras.txt");
            filereader = new FileReader(file);
            bufferedreader = new BufferedReader(filereader);
            frase = bufferedreader.readLine();
            while (frase != null) {
                palabras = frase.split("-");
                diccionario.put(palabras[0], palabras[1]);
                frase = bufferedreader.readLine();
            }
            bufferedreader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void devolverTraduccion(HashMap diccionario) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿De qué palabra quieres saber su traducción?");
        String respuesta;
        respuesta = entrada.next();
        if (diccionario.containsKey(respuesta)) {
            System.out.println("La traduccion de la palabra " + respuesta + " es: " + diccionario.get(respuesta));
        } else {
            System.out.println("Esa palabra no está en el diccionario");
        }
    }

    private static void adivinarTraduccion(HashMap diccionario) {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        String respuesta;
        int restantes = 2;
        boolean acabar = false;
        System.out.println("Introduce una palabra de la que quieres adivinar su posible traduccion");
        palabra = entrada.next();
        if (diccionario.containsKey(palabra)) {

            /*System.out.println("Estas son las posibles opciones: ");
            System.out.println(diccionario.values());;
            /*Iterator iterator = diccionario.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getValue());
        }
            System.out.print("¿Cuál crees que es la opción correcta? ");
            respuesta = entrada.next();
            do {
                if (diccionario.get(palabra).equals(respuesta)) {
                    System.out.println("Has acertado, " + respuesta + " es la traducción correcta para " + palabra);
                    acabar = true;
                } else {
                    System.out.println("Esa no es la traducción correcta, te quedan " + (restantes) + "intentos");
                    restantes--;
                    System.out.println("Introduce otra posible palabra, estas son las opciones: ");
                    System.out.println(diccionario.values());
                    respuesta = entrada.next();
                }
            } while (restantes != 0 && !acabar);
            if (restantes == 0) {
                System.out.println("Has perdido por faltas de intentos");
            }*/
        } else {
            System.out.println("Esa palabra no existe en el diccionario");
        }
    } // NO SE UTILIZA, NO FUNCIONA

    private static void añadirPalabra(HashMap diccionario) {
        try {
            File file;
            FileWriter filewriter;
            BufferedWriter bufferedwriter;
            file = new File("Palabras.txt");
            filewriter = new FileWriter(file, true);
            bufferedwriter = new BufferedWriter(filewriter);
            String palabra;
            String traduccion;
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Qué palabra quieres introducir?");
            System.out.print("En español --> ");
            palabra = entrada.next();
            System.out.print("En inglés --> ");
            traduccion = entrada.next();
            bufferedwriter.write("\n" + palabra + "-" + traduccion);
            bufferedwriter.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static void adivinarTraduccion2(HashMap diccionario) {

        //LISTAS 
        Scanner entrada = new Scanner(System.in);
        LinkedList<String> ingles = new LinkedList(diccionario.values());
        LinkedList<String> soluciones = new LinkedList();

        //VARIABLES
        String palabra, respuesta;
        boolean acabar = false;
        int restantes = 3;

        //RELLENAR EL ARRAYLIST DE OPCIONES
        System.out.print("Introduce la palabra de la que quieres saber su traduccion: ");
        palabra = entrada.next();
        if (diccionario.containsKey(palabra)) {
            for (int i = 0; soluciones.size() < 4; i++) {
                soluciones.add(ingles.get((int) (Math.random() * ingles.size())));
                ingles.remove(soluciones.get(i));
            }
            if (!soluciones.contains(diccionario.get(palabra))) {
                soluciones.add((int) (Math.random() * 5), (String) diccionario.get(palabra));
            } else {
                soluciones.add(ingles.get((int) (Math.random() * ingles.size())));
            }

            //UNA VEZ LLENO, JUGAR A ADIVINAR, CON UN DO WHILE
            do {
                System.out.println("Estas son tus posibles opciones : " + soluciones);
                System.out.println("Intenta adivinar la palabra, tienes " + restantes + " intentos: ");
                respuesta = entrada.next();
                if (diccionario.get(palabra).equals(respuesta)) {
                    System.out.println("Enhorabuena, la traduccion para la palabra " + palabra + " era " + respuesta);
                    acabar = true;
                } else {
                    restantes--;
                    System.out.println("Esa palabra no es correcta");
                    soluciones.remove(respuesta);

                }
            } while (!acabar && restantes != 0);
            /* ingles.clear();
            soluciones.clear();*/
        } else {
            System.out.println("Esa palabra no está en el diccionario");
        }

    }
}
