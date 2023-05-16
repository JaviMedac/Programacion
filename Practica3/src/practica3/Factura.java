package practica3;

public class Factura {

    private Persona persona; //Ponemos todos los atributos de la clase factura
    private String fecha;
    private boolean tipo = false;
    private int n_personas;
    private boolean tipoalojamiento = false;
    private int n_factura;
    private int coste;

    // Creamos los constructores de nuestra clase ( Con 1 será necesario)
    public Factura(Persona p, String f, boolean t, int n, boolean tp, int factura) {
        this.persona = p;
        this.fecha = f;
        this.tipo = t;
        this.n_personas = n;
        this.tipoalojamiento = tp;
        this.n_factura = factura;
    }

    // Creamos los metodos get and set de todos los atributos, ya que , al ser privados , los necesitamos para tener acceso a ellos.
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public int getN_personas() {
        return n_personas;
    }

    public void setN_personas(int n_personas) {
        this.n_personas = n_personas;
    }

    public boolean getTipoalojamiento() {
        return tipoalojamiento;
    }

    public void setTipoalojamiento(boolean tipoalojamiento) {
        this.tipoalojamiento = tipoalojamiento;
    }

    public int getN_factura() {
        return n_factura;
    }

    public void setN_factura(int n_factura) {
        this.n_factura = n_factura;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int Coste() { // Creamos un método que nos calcule el coste total por habitación.
        coste = 50;
        if (n_personas == 2) { // Contemplamos el numero de personas.
            coste = coste + 10;
        }
        if (n_personas == 3) {
            coste = coste + 20;
        }
        if (tipoalojamiento == true) { // Contemplamos el tipo de habitacion.
            coste = coste + 20;
        }
        if (tipo == true) { // Contemplamos el tipo de alojamiento.
            coste = coste + 10;
        }
        return coste;
    }

    public int CosteTotal() {
        int CosteTotal;
        CosteTotal = coste + coste + coste + coste + coste;
        return CosteTotal;
    }

    public void ObtenerNombre() { // Con este método obtenemos el nombre de una persona par x nº de factura.
        System.out.println("Para el numero de factura: " + n_factura + " corresponde la persona: " + persona.nombre);
    }

    // Creamos un toString que nos enseñe los datos de la factura;
    @Override
    public String toString() {
        return "Datos de la persona: " + persona + ", Fecha=" + fecha + ", Tipo=" + tipo + ", Nº de personas=" + n_personas + ", Tipo de alojamiento = " + tipoalojamiento + ", Nº de factura=" + n_factura;
    }

}
