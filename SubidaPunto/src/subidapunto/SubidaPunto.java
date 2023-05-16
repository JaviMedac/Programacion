package subidapunto;
/**
 * Version 1.0
 * @author Javi
 */
public class SubidaPunto {
    
    public static void main(String[] args) {
        /**
         * Creación de objetos de Paciente, Sistema y Enfermero
         */
        Paciente javi = new Paciente("734353X");
        Sistema sistema = new Sistema();
        Enfermero enfermero = new Enfermero("73");
        /**
         * Llamad a métodos de las distintas clases
         */
        javi.solicitarAtencion();
        sistema.revisarDatos(javi.getId_SS());
        enfermero.hacerInforme();
        enfermero.derivarEspecialista(javi.getId_SS());
        
    }
    
    }
