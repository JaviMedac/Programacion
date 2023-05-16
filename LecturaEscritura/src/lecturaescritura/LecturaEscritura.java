package lecturaescritura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LecturaEscritura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo: ");
        String nombreArchivo = entrada.next();
        BufferedReader bufferedReader;
        File file;
        FileReader fileReader;
        String Texto = " ";
        String frase="";
        String frase2 = "";
        try {
            file = new File(nombreArchivo);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            if (file.canRead()) {
                frase = bufferedReader.readLine();
                System.out.println("Se puede leer el archivo");
            } else {
                System.out.println("No se puede leer");
            }
            int c = fileReader.read();
            while (frase != null) {
                frase2 = frase2 + frase + "\n";
                frase = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Excepción lectura" + e.getMessage());
        }
        System.out.println(frase2);
    }

}
