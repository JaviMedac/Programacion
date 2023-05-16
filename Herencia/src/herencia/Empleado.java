package herencia;


public class Empleado extends Persona{
    double salario;

    public Empleado(double salario) {
        this.salario = salario;
    }

    public Empleado(double salario, String nombre, int edad, String dni) {
        super(nombre, edad, dni);
        this.salario = salario;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Salario: " + salario);
    }
    
}
