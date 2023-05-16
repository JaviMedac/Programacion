package subidapunto;
/**
 * Version 1.0
 * @author Javi
 */

public class Paciente {

    private String id_SS;
/**
 * Constructor de la clase Paciente con atributo String id_SS
 * @param id_SS 
 */
    public Paciente(String id_SS) {
        this.id_SS = id_SS;
    }
/**
 * Getter de la id de la seguridad social
 * @return 
 */
    public String getId_SS() {
        return id_SS;
    }
/**
 * Setter de la id de la seguridad social
 * @param id_SS 
 */
    public void setId_SS(String id_SS) {
        this.id_SS = id_SS;
    }
/**
 * Método del Paciente para solicitar atención médica
 */
    public void solicitarAtencion() {
        System.out.println("Recogiendo tus datos...");
        System.out.println("Tu número de SS es: " + this.id_SS);
    }
}
