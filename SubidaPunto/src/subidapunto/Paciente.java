package subidapunto;

public class Paciente {

    private String id_SS;

    public Paciente(String id_SS) {
        this.id_SS = id_SS;
    }

    public String getId_SS() {
        return id_SS;
    }

    public void setId_SS(String id_SS) {
        this.id_SS = id_SS;
    }

    public void solicitarAtencion() {
        System.out.println("Recogiendo tus datos...");
        System.out.println("Tu número de SS es: " + this.id_SS);
    }
}
