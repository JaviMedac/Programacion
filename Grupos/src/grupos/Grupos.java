/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupos;

import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class Grupos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno[] clase = new Alumno[27];
        String[] alumnos = new String[27];
        LinkedList<String> capitanes = new LinkedList();
        LinkedList<String> lista = new LinkedList();
        clase[0] = new Alumno("Manuel");
        clase[1] = new Alumno("Ana");
        clase[2] = new Alumno("Pablo");
        clase[3] = new Alumno("Fran");
        clase[4] = new Alumno("Pedro");
        clase[5] = new Alumno("DanielDi");
        clase[6] = new Alumno("DanielJe");
        clase[7] = new Alumno("DarioGa");
        clase[8] = new Alumno("Ferlain");
        clase[9] = new Alumno("AlejaGa");
        clase[10] = new Alumno("Raul");
        clase[11] = new Alumno("DanielJA");
        clase[12] = new Alumno("AlejaLo");
        clase[13] = new Alumno("Manuela");
        clase[14] = new Alumno("Irene");
        clase[15] = new Alumno("Jose");
        clase[16] = new Alumno("Vincent");
        clase[17] = new Alumno("Juan");
        clase[18] = new Alumno("Sandra");
        clase[19] = new Alumno("Mech");
        clase[20] = new Alumno("Alvaro");
        clase[21] = new Alumno("Luis");
        clase[22] = new Alumno("Samu");
        clase[23] = new Alumno("Javi");
        clase[24] = new Alumno("DarioVA");
        clase[25] = new Alumno("Alberto");
        clase[26] = new Alumno("Hugo");

        alumnos[0] = "Manuel";
        alumnos[1] = "Ana";
        alumnos[2] = "Pablo";
        alumnos[3] = "Fran";
        alumnos[4] = "Pedro";
        alumnos[5] = "DanielDi";
        alumnos[6] = "DanielJe";
        alumnos[7] = "DarioGa";
        alumnos[8] = "Ferlain";
        alumnos[9] = "AlejaGa";
        alumnos[10] = "Raul";
        alumnos[11] = "DanielJA";
        alumnos[12] = "AlejaLo";
        alumnos[13] = "Manuela";
        alumnos[14] = "Irene";
        alumnos[15] = "Jose";
        alumnos[16] = "Vincent";
        alumnos[17] = "Juan";
        alumnos[18] = "Sandra";
        alumnos[19] = "Mech";
        alumnos[20] = "Alvaro";
        alumnos[21] = "Luis";
        alumnos[22] = "Samu";
        alumnos[23] = "Javi";
        alumnos[24] = "DarioVA";
        alumnos[25] = "Alberto";
        alumnos[26] = "Hugo";

        hacerCapitanes(capitanes, alumnos);
        rellenar(lista, alumnos, capitanes);
        rellenar(lista, alumnos, capitanes);
        rellenar(lista, alumnos, capitanes);
        rellenar(lista, alumnos, capitanes);
        rellenar(lista, alumnos, capitanes);
        rellenar(lista, alumnos, capitanes);
        rellenar(lista, alumnos, capitanes);
        rellenar(lista, alumnos, capitanes);
        rellenar(lista, alumnos, capitanes);

    }

    public static void hacerCapitanes(LinkedList capitanes, String[] clase) {
        capitanes.add(clase[2]);
        capitanes.add(clase[4]);
        capitanes.add(clase[9]);
        capitanes.add(clase[10]);
        capitanes.add(clase[12]);
        capitanes.add(clase[14]);
        capitanes.add(clase[19]);
        capitanes.add(clase[23]);
        capitanes.add(clase[25]);
    }

    public static void rellenar(LinkedList lista, String[] clase, LinkedList capitanes) {
        lista.add(capitanes.get(0));
        capitanes.remove(0);
        int random = (int) (Math.random() * 27);
        
        int repetido = random;
        lista.add(clase[random]);
        while (repetido == random) {
            random = (int) (Math.random() * 27);

        }
        lista.add(random);
        repetido = random;
        System.out.println(lista.toString());

        lista.clear();
    }

}
