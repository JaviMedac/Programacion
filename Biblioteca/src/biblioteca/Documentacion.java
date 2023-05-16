package biblioteca;


public abstract class Documentacion {
    protected String codigo;
    protected String titulo;
    protected String fecha;
    
    public Documentacion(String codigo, String titulo, String fecha){
        this.codigo = codigo;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "El código es = " + codigo + ", el título es = " + titulo + ", la fecha es = " + fecha;
    }
    
}
