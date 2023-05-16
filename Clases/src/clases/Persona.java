
package clases;


public class Persona {
    
    public String nombre;
    public String dni;
    public int edad;
    
public Persona(String name, String dni, int edad){
    
    this.nombre = name;
    this.dni = dni;
    this.edad = edad;
}
public Persona(){
    this.nombre = "No tiene nombre";
    this.dni = "0000000";
    this.edad = 18;
}
public Persona(String name){
    this();
    this.nombre = name;
}
public Persona(Persona Persona){
    this.nombre = Persona.nombre;
    this.dni = Persona.dni;
    this.edad = Persona.edad;
}
    


    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Dni=" + dni + ", edad=" + edad + '}';
    }

    }