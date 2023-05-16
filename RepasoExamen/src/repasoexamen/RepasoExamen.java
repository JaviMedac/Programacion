package repasoexamen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/*Hacer un registro horario que registre cuando uno entra al medac y cuando sale
necesita nombre, y horario entrada/salida, Almacenar en fichero de texto*/
public class RepasoExamen {

    public static void main(String[] args) {
        File file;
        FileReader filereader;
        FileWriter filewriter;
        BufferedReader bufferedreader;
        BufferedWriter bufferedwriter;
        Scanner entrada = new Scanner(System.in);
        Persona[] arrayPersona = new Persona[20];
        String nombre, horario_entrada, horario_salida;
        int respuesta, contador = 0;
        boolean salir = false;
        String frase = "";
        String[] nombreYhorario = new String[3];
        try {
            file = new File("horarios.txt");
            filereader = new FileReader(file);
            bufferedreader = new BufferedReader(filereader);
            frase = bufferedreader.readLine();
            while (frase != null) {
                nombreYhorario = frase.split(",");
                arrayPersona[contador] = new Persona();
                arrayPersona[contador].setNombre(nombreYhorario[0]);
                arrayPersona[contador].setEntrada(nombreYhorario[1]);
                arrayPersona[contador].setSalida(nombreYhorario[2]);
                contador++;
                frase = bufferedreader.readLine();
            }
            bufferedreader.close();
        } catch (IOException e) {
            System.out.println("Excepcion lectura " + e.getMessage());
        }
        do {
            System.out.println("¿Qué quieres hacer? \n 1. Registrar entrada \n 2. Registrar salida \n 3. Guardar y Salir");
            respuesta = entrada.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.print("Introduce tus datos y tu horario de entrada:\nNombre: ");
                    nombre = entrada.next();
                    Persona.comprobarRegistro(nombre, arrayPersona);
                    System.out.print("Horario de entrada: ");
                    horario_entrada = entrada.next();
                    arrayPersona[contador] = new Persona(nombre, horario_entrada);
                    contador++;
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Ese número no realiza ninguna acción");
                    break;
            }

        } while (!salir);

    }

}
