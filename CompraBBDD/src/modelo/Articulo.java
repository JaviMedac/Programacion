package modelo;

public class Articulo {

    private String nombre;
    private int unidades;

    public Articulo(String nombre, int unidades) {
        this.nombre = nombre;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", unidades=" + unidades + '}';
    }

}
