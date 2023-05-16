package practica3;

import java.util.Scanner;

public class Hotel {

    private Persona persona;
    private Factura factura;
    private String nombre;
    private String dirección;
    private int n_plantas;
    private Factura[] facturas;

    // Creamos los constructores del hotel
    public Hotel(String n, String d, int np) {
        this.nombre = n;
        this.dirección = d;
        this.n_plantas = np;
    }

    public void setFacturas(Factura[] facturas) {
        this.facturas = facturas;
    }

    public void ObtenerDatosNumero() { // Con este metodo pedimos un numero de factura que lo asociará a la posición del array de facturas.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige un número de factura: ");
        int numero = entrada.nextInt();
        numero = numero - 1;
        System.out.println("Para el número de factura " + numero + " corresponde la siguiente factura: " + facturas[numero]);
    }

    public void ObtenerDatosFecha() { // Con este método sacamos todas las facturas con un for a raiz de la fecha indicada.
        System.out.println("Para la fecha: 22/05/2022 tenemos las siguientes facturas: ");
        for (int i = 0; i < facturas.length; i++) {
            System.out.print(facturas[i]);
            System.out.println("");
        }
    }

    public void ObtenerDatosNombre() { //Con este método sacamos los datos a raiz del nombre de una persona.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una persona del 1 al 5 para sacar sus datos"); //Ordenamos por orden de llegada las personas para acomodar el proceso.
        int personas = entrada.nextInt();
        personas = personas - 1;
        System.out.println("Para la persona: " + personas + " tenemos los siguientes datos: " + facturas[personas]);
    }
    public void ObtenerFacturas(){ //Con este método sacaremos todas las facturas.
        for(int i = 0; i < facturas.length; i++){
            System.out.print(facturas[i]);
            System.out.println("");
        }
    }
    @Override  // Creamos un toString que nos enseñe todos los datos del hotel.
    public String toString() {
        return "Hotel " + nombre + "\nDirección " + dirección + "\nNº de plantas: " + n_plantas;
    }

}
