package subidapunto;
/**
 *  Version 1.0
 * @author Javi
 */
public class Enfermero {

    private String id_enfermero;
/**
 * constructor de la clase Enfermero con atributo String id_enfermero
 */
    public Enfermero(String id_enfermero) {
        this.id_enfermero = id_enfermero;
    }
/**
 * getter del id del enfermero
 * @return 
 */
    public String getId_enfermero() {
        return id_enfermero;
    }
/**
 *  setter del id del enfermero
 * @param id_enfermero parametro enfermero
 */
    public void setId_enfermero(String id_enfermero) {
        this.id_enfermero = id_enfermero;
    }
/**
 * método que realiza informe del paciente
 */
    public void hacerInforme() {
        System.out.println("Checkeando paciente...");
        System.out.println("Haciendo informe...");
    }
/**
 * ´método que deriva a especialista en función del valor "Datos" de la clase Paciente
 * @param datos 
 */
    public void derivarEspecialista(String datos) {
        if (datos.charAt(6) == 'X') {
            System.out.println("Te tenemos que derivar al podólogo");
        } else if (datos.charAt(6) == 'Y') {
            System.out.println("Te tenemos que derivar al dermatólogo");
        } else if (datos.charAt(6) == 'Z') {
            System.out.println("Te tenemos que derivar al neurólogo");
        }

    }

}
