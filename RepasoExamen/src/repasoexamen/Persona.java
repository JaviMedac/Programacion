package repasoexamen;

import java.util.Scanner;

public class Persona {

    String nombre;
    String entrada;
    String salida;

    public Persona() {

    }

    public Persona(String nombre, String entrada) {
        this.nombre = nombre;
        this.entrada = entrada;
    }

    public Persona(String nombre, String salida, String entrada) {
        this.nombre = nombre;
        this.entrada = entrada;
        this.salida = salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
    

    public static void comprobarRegistro(String nombre, Persona[] array) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                while (nombre.equalsIgnoreCase(array[i].getNombre())) {
                    System.out.print("Ese número ya está registrado, introduce otro: ");
                    nombre = entrada.next();
                }
            } else {

            }
        }

    }

}
