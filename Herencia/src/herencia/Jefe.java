package herencia;

public class Jefe extends Persona {

    String categoria;

    public Jefe(String categoria) {
        this.categoria = categoria;
    }

    public Jefe(String categoria, String nombre, int edad, String dni) {
        super(nombre, edad, dni);
        this.categoria = categoria;
    }
    @Override
    public void cumplirAños(){
        System.out.println("Soy el jefe, no cumplo años");
        System.out.println(super.edad);
    }

}
