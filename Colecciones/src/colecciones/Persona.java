package colecciones;

public class Persona implements Comparable {

    protected String nombre;
    protected String dni;
    protected int edad;

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + ", Dni: " + dni + ", Edad: " + edad;
    }

    @Override
    public int compareTo(Object o) {
        return dni.compareToIgnoreCase(((Persona) o).dni);
    }

}
