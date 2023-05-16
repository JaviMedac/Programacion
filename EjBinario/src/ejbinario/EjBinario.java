package ejbinario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EjBinario {

    public static void main(String[] args) {
        double numero;
        double numero2;
        Scanner entrada = new Scanner(System.in);
        try {
            ObjectOutputStream flujosalida;
            flujosalida = new ObjectOutputStream(new FileOutputStream("Double.dat", false));
            System.out.println("Introduce un número real: ");
            numero = entrada.nextDouble();
            flujosalida.writeDouble(numero);
            flujosalida.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            ObjectInputStream flujoentrada;
            flujoentrada = new ObjectInputStream(new FileInputStream("Double.dat"));
            numero2 = flujoentrada.readDouble();
            flujoentrada.close();
            System.out.println(numero2);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
