package subidapunto;
/**
 * Version 1.0
 * @author Javi
 */
public class Sistema {
/**
 * Constructor vacio de la clase Sistema para poder generar objetos
 */
    public Sistema() {

    }
/**
 * Método para comprobar los datos del atributo id_ss de la clase Paciente
 * @param datos 
 */
    public void revisarDatos(String datos) {
        if (datos.length() == 7) {
            System.out.println("Su número de SS es correcto,"
                    + " en breve será atendido por un enfermero");
        } else {
            System.out.println("Lo sentimos, su número de SS "
                    + "no es válido.");
        }
    }
}
