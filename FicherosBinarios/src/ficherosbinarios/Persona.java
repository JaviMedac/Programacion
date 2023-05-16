package ficherosbinarios;

import java.io.Serializable;

public class Persona implements Serializable{

    private String nombre;
    private String dni;
    private int edad;

    public Persona() {
    }
    public Persona(String nombre, String dni, int edad){
        this.dni = dni;
        this.nombre = nombre;
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
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + '}';
    }

}
