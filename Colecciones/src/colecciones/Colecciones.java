package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Colecciones {

    public static void main(String[] args) {
        ArrayList<Integer> arrayLi = new ArrayList();
        arrayLi.add(5);
        arrayLi.add(3);
        arrayLi.add(2);
        System.out.println(arrayLi);
        System.out.println(arrayLi.size());
        arrayLi.remove(1);
        System.out.println(arrayLi.size());
        System.out.println(arrayLi);
        for (int i = 0; i < 6; i++) {
            arrayLi.add(i, i + 1);
        }
        System.out.println(arrayLi);
        System.out.println(arrayLi.get(2));
        arrayLi.set(2, 6);
        System.out.println(arrayLi);
        System.out.println(arrayLi);

        ArrayList<String> arraySt = new ArrayList();
        arraySt.add("Antonio");
        System.out.println(arraySt);

        //ARRAYLIST DE CLASE PERSONA
        ArrayList<Persona> personas = new ArrayList();
        Persona persona1 = new Persona("Antonio", "7742348Q", 13);
        personas.add(persona1);
        personas.add(new Persona("Jose", "dfdfdfd", 14));
        personas.add(new Persona("Juan", "123123", 19));
        /*System.out.println(personas);*/

        //3 FORMAS DE RECORRER UN ARRAYLIST
        /*FOR CONVENCIONAL
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }*/

 /*FOR EACH
        for (Persona i : personas) {
            System.out.println(i);
        }*/

 /*ITERATOR
        Iterator<Integer> iT = arrayLi.iterator();
        while (iT.hasNext()) {
            System.out.print(iT.next() + ", ");
        }*/

 /*lista.add("Pepe");
        lista.add("Juan");
        lista.add("Jose");*/
 /*for (String nombre : lista) {
            if (nombre.equals("Pepe")) {
                lista.remove("Pepe");
            }
        }*/
        ArrayList<String> lista = new ArrayList();
        lista.add("Pepe");
        lista.add("Juan");
        lista.add("Jose");
        Iterator<String> lista2 = lista.iterator();

        while (lista2.hasNext()) {
            String nombre = lista2.next();
            if (nombre.equals("Pepe")) {
                lista2.remove();
            }
        }
        System.out.println(lista);

        //LINKED LIST
        LinkedList<Integer> arrayLink = new LinkedList();
        arrayLink.add(5);
        arrayLink.add(7);
        arrayLink.remove(1);
        System.out.println(arrayLink);
        arrayLink.add(2);
        arrayLink.add(4);
        Collections.sort(arrayLink);
        System.out.println(arrayLink);
        Collections.sort(personas);
        System.out.println(personas);

        //EJERCICIO PRÁCTICA
        boolean salir = false;
        Scanner entrada = new Scanner(System.in);
        int respuesta;
        ArrayList<Integer> listaEj = new ArrayList();
        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Agregar Numero \n2. Buscar número \n3. Modificar número \n4. Eliminar Número \n5. Agregar en Posición");
            respuesta = entrada.nextInt();
            switch (respuesta) {
                case 1:
                    AñadirNumero(listaEj);
                    break;
                case 2:
                    BuscarNumero(listaEj);
                    break;
                case 3:
                    ModificarNumero(listaEj);
                    break;
                case 4:
                    EliminarNumero(listaEj);
                    break;
                case 5:
                    ModificarPosicion(listaEj);
                    break;
                default:
                    salir = true;
                    break;
            }
        } while (!salir);

    }

    public static void AñadirNumero(ArrayList lista) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        System.out.print("¿Qué numero quiere añadir? --> ");
        numero = entrada.nextDouble();
        lista.add(numero);
    }

    public static void BuscarNumero(ArrayList lista) {
        Scanner entrada = new Scanner(System.in);

    }

    public static void ModificarNumero(ArrayList lista) {
        double numero;
        int posicion;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce qué número de la lista quiere modificar: ");
        numero = entrada.nextDouble();
        if (lista.contains(numero)) {
            double numero2 = entrada.nextDouble();
            lista.set(lista.indexOf(numero), numero);
        } else {
            System.out.println("En esa posición no hay ningún número");
        }
    }

    public static void EliminarNumero(ArrayList lista) {
        int posicion;
        Double numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Qué número quieres eliminar? --> ");
        numero = entrada.nextDouble();
        if (lista.contains(numero)) {
            lista.remove(numero);
        } else {
            System.out.println("En esa posición no hay ningún número");
        }
    }

    public static void ModificarPosicion(ArrayList lista) {
        double numero;
        int posicion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Posicion: ");
        posicion = entrada.nextInt();
        System.out.println("Numero2: ");
        numero = entrada.nextDouble();
        if (lista.size() > posicion) {
            System.out.println("Numero1: ");
            numero = entrada.nextDouble();
            lista.add(posicion, numero);
        } else {
            int conversion = posicion - lista.size();
            for (int i = conversion; i < posicion; i++) {
                lista.add(1, 0.0);
            }
            lista.add(numero);
        }
    }

}
