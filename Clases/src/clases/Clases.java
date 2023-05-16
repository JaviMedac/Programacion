package clases;


public class Clases {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Jose");
        Persona persona3 = new Persona("Jose", "585793X", 42);
        Persona persona4 = new Persona(persona3);
        System.out.println(persona3.toString());
        System.out.println("");
        System.out.println(persona4.toString());
        persona3.dni = "565454X";
        persona3.nombre = "Julio";
        System.out.println(persona3.toString());
        System.out.println(persona4.toString());
        System.out.println(persona1);
        System.out.println(persona2);
    }
    
}
