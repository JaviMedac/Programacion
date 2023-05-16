
package clasecliente;


public class Cliente {
    int id;
    static int id2 = 0;
    String nombre;
    String apellidos;
    String email;
    String dni;
    int teléfono;
    Cliente (String n, String ap, String em, String dni, int tf){
        this.id = id2;
        id2++;
        this.nombre = n;
        this.apellidos = ap;
        this.email = em;
        this.dni = dni;
        this.teléfono = tf;
    }
    Cliente (String n, String ap){
        this.id = id2;
        id2++;
        this.nombre = n;
        this.apellidos = ap;
    }
    public void mostrarCliente(){
        System.out.println("Su ID es: " + this.id);
        System.out.println("Su nombre es: " + this.nombre);
        System.out.println("Su apellido es: " + this.apellidos);
        System.out.println("Su Email es: " + this.email);
        System.out.println("Su DNI es: " + this.dni);
        System.out.println("Su teléfono es: " + this.teléfono);
    }
    public void mostrarCliente2(){
        System.out.println("Su ID es: " + this.id);
        System.out.println("Su nombre es: " + this.nombre);
        System.out.println("Su apellido es: " + this.apellidos);
    }
}
