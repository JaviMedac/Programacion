package herencia;

public class Herencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1000.0,"Javi", 19, "dnknfdnf");
        empleado1.mostrarDatos();
        Jefe jefe1 = new Jefe("Plus", "Jefe", 54 , "dmfkdnfklnd" );
        jefe1.cumplirAños();

    }

}
