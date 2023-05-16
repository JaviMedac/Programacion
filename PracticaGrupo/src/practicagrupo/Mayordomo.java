package practicagrupo;

public class Mayordomo extends Personas {

    public Mayordomo(String ubicacion) {
        super(ubicacion);
    }

    public void PreguntaMayordomo(int pregunta) {
        if (malo == true) {
            switch (pregunta) {
                case 1:
                    System.out.println("En el Hall de entrada");
                    contador++;
                    break;
                case 2:
                    System.out.println("");
                    contador++;
                    break;
                case 3:
                    System.out.println("");
                    contador++;
                    
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
