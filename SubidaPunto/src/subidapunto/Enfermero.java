package subidapunto;

public class Enfermero {

    private String id_enfermero;

    public Enfermero(String id_enfermero) {
        this.id_enfermero = id_enfermero;
    }

    public String getId_enfermero() {
        return id_enfermero;
    }

    public void setId_enfermero(String id_enfermero) {
        this.id_enfermero = id_enfermero;
    }

    public void hacerInforme() {
        System.out.println("Checkeando paciente...");
        System.out.println("Haciendo informe...");
    }

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
