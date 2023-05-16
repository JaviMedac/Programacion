package subidapunto;

public class Sistema {

    public Sistema() {

    }

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
