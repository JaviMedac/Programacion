package herencia;

public class Persona {

    protected String nombre;
    protected int edad;
    protected String dni;

    public Persona() {

    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public void cumplirAños(){
        edad++;
    }
    public void saludar(){
        System.out.println("Hola");
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Dni: " + dni);
    }
    
}
