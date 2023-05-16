package practicagrupo;

public class Cocinero extends Personas {

    public Cocinero(String ubicacion) {
        super(ubicacion);
    }

    public void PreguntaCocinero(int pregunta) {
        if (malo == true) {
            switch (pregunta) {
                case 1:
                    System.out.println("En el Hall de entrada");
                    
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
            }
        } else {
            switch (pregunta) {
                case 1:
                    System.out.println("En el Hall de entrada");
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
            }

        }
    }

}
