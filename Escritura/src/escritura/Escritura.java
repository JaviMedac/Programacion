package escritura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

    public static void main(String[] args) {
        File file;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        String frase = "";
        try{
            file = new File("Prueba2.txt");
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            frase = "Voy a probar que funciona escritura con un archivo de texto";
            bufferedWriter.write(frase);
            bufferedWriter.newLine();
            bufferedWriter.write("cuidado que eres un paquete programando");
            bufferedWriter.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }

}
