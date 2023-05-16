package subidapunto;

public class SubidaPunto {
    
    public static void main(String[] args) {
        Paciente javi = new Paciente("734353X");
        Sistema sistema = new Sistema();
        Enfermero enfermero = new Enfermero("73");
        javi.solicitarAtencion();
        sistema.revisarDatos(javi.getId_SS());
        enfermero.hacerInforme();
        enfermero.derivarEspecialista(javi.getId_SS());
        
    }
    
    }
