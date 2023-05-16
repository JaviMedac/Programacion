package biblioteca;


public class Libros extends Documentacion implements Prestable{
    boolean prestado = false;
    

    public Libros(String codigo, String titulo, String fecha) {
        super(codigo, titulo, fecha);
        prestado = false;
    }

    @Override
    public void Prestar(boolean prestado) {
        prestado = true;
    }
    @Override
    public void Devolver(boolean prestado) {  
        prestado = false;
    }
    @Override
    public void Prestado(boolean prestado) {
        prestado = true;
    }
    public void DevolverAño(){
        System.out.println(fecha);
    }
    public void DevolverCodigo(){
        System.out.println(codigo);   
    }

    @Override
    public String toString() {
        return super.toString() + " y el estado del libro es: " + prestado;
    }
    
    

    


    
}
