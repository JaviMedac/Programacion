package juegopokemon;

public class Pokemon {

    private int estadisticas[] = new int[4];
    private int precision;
    String nombre;
    private TipoPokemon tipo;

    public Pokemon(int estadisticas[], int precision, String nombre, TipoPokemon tipo) {
        this.estadisticas[0] = (int) (Math.random() * 200);
        this.estadisticas[1] = (int) (Math.random() * 150);
        this.estadisticas[2] = (int) (Math.random() * 250);
        this.estadisticas[3] = (int) (Math.random() * 100);
        this.precision = precision;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int[] getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(int[] estadisticas) {
        this.estadisticas = estadisticas;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Atacar(Pokemon p) {
        if (tipo.getTipo() == "fuego") {
            if (p.tipo.getTipo() == "fuego") {
            }
            if (p.tipo.getTipo() == "agua") {

            }
            if (p.tipo.getTipo() == "planta") {

            }
            if (tipo.getTipo() == "agua") {
                if (p.tipo.getTipo() == "fuego") {
                }
                if (p.tipo.getTipo() == "agua") {

                }
                if (p.tipo.getTipo() == "planta") {

                }
            }
            if (tipo.getTipo() == "planta") {
                if (p.tipo.getTipo() == "fuego") {
                }
                if (p.tipo.getTipo() == "agua") {

                }
                if (p.tipo.getTipo() == "planta") {

                }
            }
        }
    }
}
