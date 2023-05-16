package ejerciciotreeset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EjercicioTreeSet {

    public static void main(String[] args) {
        /*Crear una colección de 20 numeros enteros aleatorios distintos y menores que 100, guardadlo 
        por orden decreciente a medida que se vayan generando y mostrar la colección por pantalla.
         */

        TreeSet<Integer> lista = new TreeSet(new EnterosDecreciente());
        Iterator<Integer> it = lista.iterator();
        while (lista.size() != 20) {
            lista.add((int) (Math.random() * 100));
        }
        /*System.out.println(lista);*/

 /*Repetir el mismo ejercicio pero permitir numeros repetidos y numeros aleatorios menores que 10.*/
        LinkedList<Integer> lista2 = new LinkedList();

        while (lista2.size() != 20) {
            lista2.add((int) (Math.random() * 10));
        }
        Collections.sort(lista2, new EnterosDecreciente());
        /*System.out.println(lista2);*/

 /*Introducir por teclado hasta que se introduzca "fin" una serie de nombres, insertar por orden alfabético,
        no permite nombres repetidos, mostrar la lista al final*/
 /* List<String> lista3 = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un nombre para introducir en la lista");
        String nombre = "";
        while (!nombre.equalsIgnoreCase("fin")) {
            nombre = entrada.next();
            if (nombre.equalsIgnoreCase("fin")) {
                System.out.println("Saliendo del programa...");
            } else {
                if (lista3.contains(nombre)) {
                    System.out.print("Ese nombre ya existe, no se va a introducir, introduce otro : ");
                } else {
                    System.out.print("Has introducido el nombre " + nombre + " introduce otro: ");
                    lista3.add(nombre);
                }
            }
        }
        if (lista3.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println(lista3);
        }*/
        //CON METODOS
        /* List< String> lista4 = new ArrayList();
        String temp = entrada.next();
        while (!temp.equalsIgnoreCase("fin")) {
            lista4.add(temp);
            temp = entrada.next();
        }
        System.out.println(lista4);
        lista4 = eliminarRepetidos(lista4);
        System.out.println(lista4);*/

 /*Introducir por consola una frase que conste exclusivamente de palabras separadas por espacio
        Almacenar en una lista las palabras de la frase, una en  cada nodo , y mostrar las palabras que esten repetidas y las que no*/
 /*String frase;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        frase = entrada.nextLine();
        List<String> frases = new LinkedList();
        List<String> repetidas = new LinkedList();
        Set<String> norep = new TreeSet();
        frases.addAll(Arrays.asList(frase.split(" ")));
        for (int i = 0; i < frases.size(); i++) {
            if (Collections.frequency(frases, frases.get(i)) == 1) {
                norep.add(frases.get(i));
            } else {
                repetidas.add(frases.get(i));
            }
        }
        System.out.println(repetidas);
        System.out.println(norep);
         */
    }

    public static List eliminarRepetidos(List l) {
        Set temp = new LinkedHashSet(l);
        return new ArrayList(temp);
    }

}
