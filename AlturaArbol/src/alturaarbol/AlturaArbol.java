package alturaarbol;

import java.util.Scanner;

/* Introducir altura de arboles, cuando se utilice menos 1 cortar, etiquetas desde 0 para cada arbol*/
public class AlturaArbol {

    public static void main(String[] args) {
        int mayor, a, contador = 1;
        Scanner entrada = new Scanner(System.in);
        a = entrada.nextInt();
        mayor = a;
        while (a != -1) {
            contador++;
            if (a > mayor) {
                mayor = a;
            }
            a = entrada.nextInt();
        }
        System.out.println("El mayor es: " + mayor + " con la etiqueta: " + contador);
    }

}
