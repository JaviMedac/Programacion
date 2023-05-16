package ficherosbinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FicherosBinarios {

    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        Persona persona = new Persona();
        persona.setNombre("PabloZara");
        persona.setDni("345454X");
        persona.setEdad(24);
        File file;
        FileReader filereader;
        FileWriter filewriter;
        int array[] = new int[10];
        int array2[] = new int[10];
        /*try{
            ObjectOutputStream flujosalida;
            flujosalida = new ObjectOutputStream(new FileOutputStream("Datos.dat",false));
            for(int i = 0; i < array.length; i++){
                array[i] = i +1;
                /*flujosalida.writeInt(array[i]);
            }
            flujosalida.writeObject(array);
            flujosalida.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
        ObjectInputStream flujoentrada;
        flujoentrada = new ObjectInputStream(new FileInputStream("Datos.dat"));
        for(int i = 0; i < array2.length;i++){
            /*array2[i] =flujoentrada.readInt();
            System.out.println(array2[i]);
        }
        array2 = (int[]) flujoentrada.readObject();
        flujoentrada.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }*/

 /*try {
            ObjectOutputStream flujosalida;
            flujosalida = new ObjectOutputStream(new FileOutputStream("Persona.dat", false));
            flujosalida.writeObject(persona);
            flujosalida.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            ObjectInputStream flujoentrada;
            flujoentrada = new ObjectInputStream(new FileInputStream("Persona.dat"));
            Persona persona2 = new Persona();
            persona2 = (Persona) (flujoentrada.readObject());
            flujoentrada.close();
            System.out.println(persona2.toString());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/
        Persona[] arrayPersona = new Persona[3];
        arrayPersona[0] = new Persona("Jose", "747547X", 23);
        arrayPersona[1] = new Persona("Jose2", "747547X", 23);
        arrayPersona[2] = new Persona("Jose3", "747547X", 23);
        arrayPersona[3] = new Persona("Jose4", "747547X", 23);

        try {
            ObjectOutputStream flujosalida;
            flujosalida = new ObjectOutputStream(new FileOutputStream("Persona2.dat", false));
            flujosalida.writeObject(arrayPersona);
            flujosalida.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            ObjectInputStream flujoentrada;
            flujoentrada = new ObjectInputStream(new FileInputStream("Persona2.dat"));
            Persona persona2 = new Persona();
            persona2 = (Persona) (flujoentrada.readObject());
            flujoentrada.close();
            System.out.println(persona2.toString());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
