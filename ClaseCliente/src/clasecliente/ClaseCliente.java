
package clasecliente;

import clases.Persona;


public class ClaseCliente {

    
    public static void main(String[] args) {
        Cliente array[] = new Cliente[10];
        array[0] = new Cliente("Juan", "Perez", "jp@gmail", "7676767X", 654154875);
        array[1] = new Cliente("Pepe", "Toledo", "pt@gmail.com", "5564575X", 615716715);
        array[2] = new Cliente("Fran", "Kilo", "fk@gmail.com", "56548686X", 568429168);
        array[3] = new Cliente("Jose", "Martin", "jm@gmail.com", "65945946Y", 654946716);
        array[4] = new Cliente("Luis", "Ruiz", "lr@gmail.com", "64658454X", 984576515);
        array[5] = new Cliente("Manu", "Lopez");
        array[6] = new Cliente("Jorge", "Lopez");
        array[7] = new Cliente("Albeto", "Martinez");
        array[8] = new Cliente ("Samu", "Castro");
        array[9] = new Cliente("Oscar", "Ruiz");
        array[random()].mostrarCliente();
        Persona persona1 = new Persona("Pepe", "fdfndmnfd", 23);
        System.out.println(persona1);
        

    }
    public static int random(){
        double random = Math.random() * 10;
        int aleatorio = (int) random;
        return aleatorio;
    }
    
}
